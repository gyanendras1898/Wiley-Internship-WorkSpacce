package com.gyan.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.gyan.beans.Student;
import com.gyan.beans.Teacher;
import com.gyan.persistance.StudentDao;
import com.gyan.persistance.TeacherDao;

@EntityScan(basePackages = "com.gyan.beans")
@EnableJpaRepositories(basePackages = "com.gyan.persistance")
@SpringBootApplication
public class RelationProjectRevisionApplication implements CommandLineRunner {
	
	@Autowired
	private StudentDao studentDao;
	
	@Autowired
	private TeacherDao teacherDao;

	public static void main(String[] args) {
		SpringApplication.run(RelationProjectRevisionApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Teacher t1 = new Teacher(1, "Sujata");
		
		Student st1 = new Student(1,"gyanendra",t1);
		Student st2 = new Student(2,"gaurav",t1);
		
		teacherDao.save(t1);
		studentDao.save(st1);
		studentDao.save(st2);
		
		System.out.println("Thanks !!");
	}

}
