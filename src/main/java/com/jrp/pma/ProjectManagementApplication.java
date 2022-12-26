package com.jrp.pma;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.jrp.pma.dao.EmployeeRepository;
import com.jrp.pma.dao.ProjectRepository;
import com.jrp.pma.entities.Employee;
import com.jrp.pma.entities.Project;

@SpringBootApplication
public class ProjectManagementApplication {
	@Autowired
	ProjectRepository prorepo;
	@Autowired
	EmployeeRepository empRepo;

	public static void main(String[] args) {
		SpringApplication.run(ProjectManagementApplication.class, args);
	}
	
   /*@Bean
   CommandLineRunner runner() {
	   return args ->{
		   
		   Employee emp1= new Employee("poonia","karimi","poonia@gmail.com");
		   Employee emp2= new Employee("mehdi","haghighi","mehdi@gmail.com");
		   Employee emp3= new Employee("sosan","soltani","sosan@gmail.com");
		   
		   Employee emp4= new Employee("behrooz","jalali","behrooz@gmail.com");
		   Employee emp5= new Employee("meysam","babayee","may@gmail.com");
		   Employee emp6= new Employee("ali","moradi","momo@gmail.com");
		   
		   
		   Employee emp7= new Employee("bahar","lari","baha@gmail.com");
		   Employee emp8= new Employee("nazy","razi","raz@gmail.com");
		   Employee emp9= new Employee("nima","haghi","hagh@gmail.com");
		   
		   
		   Project pro1= new Project("okala","NOTSTARTED","its good");
		   Project pro2= new Project("snapp","COMPLETED","its bad");
		   Project pro3= new Project("snapfood","INPROGRESS","more usefull");
		   Project pro4= new Project("dgkala","COMPLETED","its too bad");
		   
		  
		   pro1.setEmployees(Arrays.asList(emp1,emp2));
		   pro2.setEmployees(Arrays.asList(emp3));
		   pro3.setEmployees(Arrays.asList(emp1));
		   pro4.setEmployees(Arrays.asList(emp1,emp3));
		   


           emp1.setProjects(Arrays.asList(pro1,pro3,pro4));
		   emp2.setProjects(Arrays.asList(pro1));
		   emp3.setProjects(Arrays.asList(pro2,pro4));
		   
		   
		   empRepo.save(emp1);
		   empRepo.save(emp2);
		   empRepo.save(emp3);
		   empRepo.save(emp4);
		   empRepo.save(emp5);
		   empRepo.save(emp6);
		   empRepo.save(emp7);
		   empRepo.save(emp8);
		   empRepo.save(emp9);
		   
		   
		   prorepo.save(pro1);
		   prorepo.save(pro2);
		   prorepo.save(pro3);
		   prorepo.save(pro4);

		   
		  

		   
	   };
 }
*/	
	

}
