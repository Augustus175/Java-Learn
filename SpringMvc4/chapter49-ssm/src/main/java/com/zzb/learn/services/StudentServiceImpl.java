package com.zzb.learn.services;

import com.zzb.learn.beans.Student;
import com.zzb.learn.dao.IStudentDao;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service("studentService")
public class StudentServiceImpl implements IStudentService {

    @Resource(name = "IStudentDao")
    private IStudentDao studentDao;

    @Override
    @Transactional
    public void saveStudent(Student student) {
        studentDao.insertStudent(student);
    }
}
