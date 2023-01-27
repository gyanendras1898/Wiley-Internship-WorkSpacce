package com.gyan.persistance;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gyan.beans.Teacher;

@Repository
public interface TeacherDao extends JpaRepository<Teacher, Integer> {

}
