package com.zzb.learn.dao;

import com.zzb.learn.beans.Student;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentDaoImpl extends JdbcDaoSupport implements IStudentDao {


    @Override
    public void insertStudent(Student student) {
        String sql = " insert into student (name , age) values (?,?) ";
        this.getJdbcTemplate().update(sql, student.getName(), student.getAge());
    }

    @Override
    public void insertStudentCatchId(Student student) {
//       String sql = " update student set name = ? age = ? where  id = ? ";
//        this.getJdbcTemplate().update(sql, student.getName(), student.getAge(), student.getId());
    }

    @Override
    public void deleteStudentById(Integer id) {
        String sql = " delete form student where id = ? ";
        this.getJdbcTemplate().update(sql, id);
    }

    @Override
    public void updateStudent(Student student) {
        String sql = " update student set name = ? age = ? where  id = ? ";
        this.getJdbcTemplate().update(sql, student.getName(), student.getAge(), student.getId());
//        try {
//            inputStream = Resources.getResourceAsStream("mybatis.xml");
//            sqlSession = MyBatisUtil.getSqlSession();
//            sqlSession.update("updateStudent", student);
//            sqlSession.commit();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        if (sqlSession != null) {
//            sqlSession.close();
//        }

    }

    @Override
    public List<Student> selectAllStudents() {
        String sql = " select id ,name, age from student ";
        return this.getJdbcTemplate().query(sql, new StudentRowMapper());
    }

    @Override
    public Student selectStudentById(Integer id) {
        Student student = null;
//        try {
//            inputStream = Resources.getResourceAsStream("mybatis.xml");
//            sqlSession = MyBatisUtil.getSqlSession();
//            student = sqlSession.selectOne("selectStudentById", id);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        if (sqlSession != null) {
//            sqlSession.close();
//        }
        return student;
    }

    @Override
    public List<Student> selectStudentByName(String name) {
        List<Student> students = null;
//        try {
//            inputStream = Resources.getResourceAsStream("mybatis.xml");
//            sqlSession = MyBatisUtil.getSqlSession();
//            students = sqlSession.selectList("selectStudentByName", name);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        if (sqlSession != null) {
//            sqlSession.close();
//        }
        return students;
    }

    @Override
    public Map<String, Student> selectStudentMap() {
        Map<String, Student> map = new HashMap<>();
//        try {
//            inputStream = Resources.getResourceAsStream("mybatis.xml");
//            sqlSession = MyBatisUtil.getSqlSession();
//            map = sqlSession.selectMap("selectAllStudents", "name");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        if (sqlSession != null) {
//            sqlSession.close();
//        }
        return map;
    }
}
