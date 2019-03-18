package com.zzb.learn.service01;

import com.zzb.learn.bean.Student;
import com.zzb.learn.dao.IStudentDao;
import com.zzb.learn.dao.StudentDaoImpl;

public class StudentServiceImpl implements IStudentService {
    private IStudentDao dao;

    public StudentServiceImpl() {
        dao = new StudentDaoImpl();
    }

    @Override
    public void saveStudent(Student student) {
        dao.insertStudent(student);
    }
}
