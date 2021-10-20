package com.ketul.demo.CRUDRepo;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.ketul.demo.model.Employee;

public interface CRUDRepo extends CrudRepository<Employee, Integer>{
	 ArrayList<Employee> findByEtech(String etech);
	 
	 ArrayList<Employee> findByEidGreaterThan(int eid);
	 
	 @Query("from Employee where etech = ?1 order by ename")
	 ArrayList<Employee> findByEtechSorted(String etech);
}