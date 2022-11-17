package cn.powernode.service;

import cn.powernode.dao.StudentDao;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

/**
 * @date 2022/11/2&20:01
 */
@Service("studentService")
public class StudentService {
    //@Resource(name = "studentDaoImpForMySQL")
    private StudentDao studentDao;
    //@Resource不能出现在构造方法上
    public StudentService(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    //@Resource(name = "studentDaoImpForMySQL")
    @Resource//不指定名字的话  先用属性名当作属性名进行匹配查找 如果查找不到就按类型进行匹配查找
    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    public void deleteStudent(){
        studentDao.deleteById();
    }
}
