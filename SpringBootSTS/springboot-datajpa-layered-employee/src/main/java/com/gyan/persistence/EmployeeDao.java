package com.gyan.persistence;

import org.springframework.data.jpa.repository.JpaRepository;


import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.gyan.bean.Employee;

@Repository
public interface EmployeeDao extends JpaRepository<Employee, Integer> {
	@Transactional
	@Modifying
	@Query("update Employee set salary=:sal where empId=:id")
	public int updateSalary(@Param("id") int empId,@Param("sal") double salary);

//	@Query("update Employee set salary=?1 where empId=?2")
//	public int updateSalary(double salary,int empId);
}
