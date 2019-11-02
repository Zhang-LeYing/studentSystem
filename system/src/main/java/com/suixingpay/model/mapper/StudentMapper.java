package com.suixingpay.model.mapper;

import com.suixingpay.model.po.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.ArrayList;

@Mapper
public interface StudentMapper {

    @Select("SELECT id,sudentId,name,sex,age,address,email from student WHERE id = #{id};")
    Student selectStudentById(int id);

    @Select("SELECT id,sudentId,name,sex,age,address,email from student")
    ArrayList<Student> selectStudent();
}
