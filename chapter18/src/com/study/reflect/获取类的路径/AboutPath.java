package com.study.reflect.获取类的路径;

/**
 * @date 2022/10/22&16:42
 */
public class AboutPath {
    public static void main(String[] args) {
       // FileReader reader = new FileReader("chapter18/classinfo.properties");
        /*
        这种方式的路径缺点是，移植性差，这只是在IDEA下的相对路径
        如果不是在IDEA中编译，路径就会出错
         */
        //通用路径，即使代码换位置了，代码路径还是可以使用的
        //但是要确保：该文件必须在类路径下(凡是在src下的都是类路径下)
        /*
         Thread.currentThread() 当前线程
         getContextClassLoader() 是当前线程对象的方法，可以获取到当前线程的类加载器
         getResource("classinfo.properties") 获取资源
         这是类加载器的方法，当前线程的类加载器   默认从类的根路径下加载资源

         */
        //保证文件在src下(类路径下)
        //适合于各种操作系统  各种环境
        String path = Thread.currentThread().getContextClassLoader().
                getResource("classinfo.properties").getPath();
        System.out.println(path);//拿到文件的绝对路径
        //默认从src开始  src就是根路径
        String path2 = Thread.currentThread().getContextClassLoader().
                getResource("com/study/reflect/获取类的路径/db.properties").getPath();
        System.out.println(path2);
    }
}
