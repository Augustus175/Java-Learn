package com.zzb.learn.services;

import com.zzb.learn.beans.Student;
import com.zzb.learn.dao.IStudentDao;

public class StudentServiceImpl implements IStudentService {
    private IStudentDao studentDao;

    @Override
    public void saveStudent(Student student) {
        studentDao.insertStudent(student);
    }

    public void setStudentDao(IStudentDao studentDao) {
        this.studentDao = studentDao;
    }
}
