package io.gaojian.bjpowernode.dao;

import io.gaojian.bjpowernode.domain.Student;

import java.util.List;

//这是一个接口 操作student表
public interface StudentDao {
    //查询表中所有数据
    public List<Student> selectStudent();
    public int insertStudent(Student student);
}
