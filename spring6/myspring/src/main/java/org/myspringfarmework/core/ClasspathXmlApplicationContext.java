package org.myspringfarmework.core;

import com.sun.jdi.event.ExceptionEvent;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;

/**
 * @date 2022/10/31&20:29
 */
public class ClasspathXmlApplicationContext implements ApplicationContext {
    private static final Logger logger = LoggerFactory.getLogger(ClasspathXmlApplicationContext.class);
    private HashMap<String, Object> singletonObjects = new HashMap();
    /*
     解析myspirng配置文件，然后初始化所有的Bean对象
     传入的参数是spring配置文件的路径，注意：使用ClasspathXmlApplicationContext，配置文件应当放在类路径下
     */

    public ClasspathXmlApplicationContext(String configLocation) {
        try {
            //将通过解析xml文件实例化的bean放在hashmap集合中
            //dom4j解析xml文件的核心对象
            SAXReader reader = new SAXReader();
            //获取一个流，指向配置文件  从类路径中加载资源
            InputStream in = ClassLoader.getSystemClassLoader().getResourceAsStream(configLocation);
            //读文件   代表的就是xml文件的内容
            Document document = reader.read(in);
            //获取所有的bean标签
            List<Node> nodes = document.selectNodes("//bean");
            //遍历bean标签
            nodes.forEach(node -> {
                try {
                    //System.out.println(node);
                    //向下转型的目的是为了使用Element接口里面更加丰富的方法
                    Element beanElt = (Element) node;
                    //获取id属性
                    String id = beanElt.attributeValue("id");
                    //获取class属性
                    String className = beanElt.attributeValue("class");
                    logger.info("beanName=" + id);
                    logger.info("className=" + className);
                    //通过反射机制创建对象  将其放入Map集合中  提前”曝光“
                    //获取Class
                    Class<?> aClass = Class.forName(className);
                    //获取无参数构造方法
                    Constructor<?> defaultCon = aClass.getDeclaredConstructor();
                    //调用无参数构造方法实例化Bean
                    Object bean = defaultCon.newInstance();
                    //将Bean”曝光“，加入Map集合
                    singletonObjects.put(id, bean);
                    //记录日志
                    logger.info(singletonObjects.toString());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            });
            //再次重新把所有的bean标签遍历一次，这一次主要是给对象的属性赋值
            nodes.forEach(node -> {
                try {
                    Element beanElt = (Element) node;
                    //获取id属性
                    String id = beanElt.attributeValue("id");
                    //获取class属性
                    String className = beanElt.attributeValue("class");
                    Class<?> aClass = Class.forName(className);
                    //获取该bean标签下所有的属性property标签
                    List<Element> propertys = beanElt.elements("property");
                    //遍历所有属性的标签
                    propertys.forEach(property -> {
                        try {
                            //获取属性名
                            String propertyName = property.attributeValue("name");
                            //获取属性类型
                            Field field = aClass.getDeclaredField(propertyName);
                            logger.info("属性名：" + propertyName);
                            //获取方法名
                            String setMethodName = "set" + propertyName.toUpperCase().charAt(0) + propertyName.substring(1);
                            //获取set方法
                            Method setMethod = aClass.getDeclaredMethod(setMethodName, field.getType());
                            //获取具体的值
                            String vaule = property.attributeValue("value");
                            String ref = property.attributeValue("ref");
                            Object actualValue = null;//真值
                            if (vaule != null) {
                                //表明属性是value简单类型
                                /*
                                myspring框架简单类型声明：
                                    byte short int long float double boolean char
                                    Byte Short Integer Float Double Boolean Character
                                    String
                                 */
                                //获取属性类型名
                                String propertyTypeSimpleName = field.getType().getSimpleName();
                                logger.info("123");
                                logger.info(propertyTypeSimpleName);
                                switch (propertyTypeSimpleName) {
                                    case "byte":
                                        actualValue = Byte.parseByte(vaule);
                                        break;
                                    case "short":
                                        actualValue = Short.parseShort(vaule);
                                        break;
                                    case "int":
                                        actualValue = Integer.parseInt(vaule);
                                        break;
                                    case "long":
                                        actualValue = Long.parseLong(vaule);
                                        break;
                                    case "float":
                                        actualValue = Float.parseFloat(vaule);
                                        break;
                                    case "double":
                                        actualValue = Double.parseDouble(vaule);
                                        break;
                                    case "boolean":
                                        actualValue = Boolean.parseBoolean(vaule);
                                        break;
                                    case "char":
                                        actualValue = vaule.charAt(0);
                                        break;
                                    case "Byte":
                                        actualValue = Byte.valueOf(vaule);
                                        break;
                                    case "Short":
                                        actualValue = Short.valueOf(vaule);
                                        break;
                                    case "Integer":
                                        actualValue = Integer.valueOf(vaule);
                                        break;
                                    case "Long":
                                        actualValue = Long.valueOf(vaule);
                                        break;
                                    case "Float":
                                        actualValue = Float.valueOf(vaule);
                                        break;
                                    case "Double":
                                        actualValue = Double.valueOf(vaule);
                                        break;
                                    case "Boolean":
                                        actualValue = Boolean.valueOf(vaule);
                                        break;
                                    case "Character":
                                        actualValue = Character.valueOf(vaule.charAt(0));
                                        break;
                                    case "String":
                                        actualValue = vaule;
                                }
                                //调用set方法(set对象没有返回值)
                                logger.info(actualValue.toString());
                                setMethod.invoke(singletonObjects.get(id), actualValue);
                            }
                            if (ref != null) {
                                //表明属性的ref非简单类型
                                //调用set方法(set对象没有返回值)
                                setMethod.invoke(singletonObjects.get(id), singletonObjects.get(ref));
                            }

                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    });
                } catch (Exception e) {
                    e.printStackTrace();
                }

            });
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public Object getBean(String beanName) {
        return singletonObjects.get(beanName);
    }
}
