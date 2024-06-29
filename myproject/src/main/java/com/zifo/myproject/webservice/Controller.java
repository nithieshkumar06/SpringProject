package com.zifo.myproject.webservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.zifo.myproject.DBConnection.pojo.EmpDetail;

@RestController
public class Controller {
	
	
	  
	    @Autowired
	    webImp webImp;
	  
	    @PostMapping("/addEmployee")
	    public void addEmploye(@RequestBody EmpDetail employe) {
	    	webImp.addEmploye(employe);
	    }
	  
	    @GetMapping("/findbyid")
	    public EmpDetail getEmployeByID(@RequestParam(value = "id", required=true) String id) {
	        return webImp.findEmploye(id);
	    }
	  
	    @DeleteMapping("/deletebyid")
	    public void deleteEmploye(@RequestParam(value = "id", required=true) String id) {
	    	webImp.deleteEmployee(id);
	    }
	    
	    @PutMapping("/employees/{id}")
	   public void replaceEmployee(@RequestBody EmpDetail newEmployee, @PathVariable String id) {
	    	webImp.updateEmploye(newEmployee);
		    return;
	    	
	    }
	
}
