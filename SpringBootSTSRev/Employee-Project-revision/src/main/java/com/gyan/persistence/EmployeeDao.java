package com.gyan.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.gyan.bean.Employee;

import jakarta.transaction.Transactional;

@Repository
public interface EmployeeDao extends JpaRepository<Employee, Integer> {

	@Query("Select id from Employee where name = :name")
	public int searchByName(@Param("name") String name);

	@Transactional
	@Modifying
	@Query("update Employee set salary=:sal where empId=:id")
	public void updateSalary(@Param("id") int empId, @Param("sal") double salary);

}
