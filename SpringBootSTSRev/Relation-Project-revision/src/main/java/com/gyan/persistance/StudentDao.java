package com.gyan.persistance;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gyan.beans.Student;

@Repository
public interface StudentDao extends JpaRepository<Student, Integer> {

}
