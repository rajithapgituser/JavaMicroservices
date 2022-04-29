package org.ibm.springboot.controller;

import java.io.IOException;
import java.util.List;

import org.ibm.springboot.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cloudant.client.api.CloudantClient;
import com.cloudant.client.api.Database;
import com.cloudant.client.api.model.Response;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1")
public class EmployeeController {

	@Autowired
	private CloudantClient client;
	private Database db;

	@PostMapping("/employees")
	public @ResponseBody String createEmployee(@RequestBody Employee employee) {
		db = client.database("employee", false);
		System.out.println("Save Customer " + employee);
		Response r = null;
		if (employee != null) {
			r = db.post(employee);
		}
		return r.getId();
	}
	
	@GetMapping("/employees")
	public @ResponseBody List<Employee> getAll() throws IOException {
			db = client.database("employee", false);
			List<Employee> allDocs = db.getAllDocsRequestBuilder().includeDocs(true).build().getResponse().getDocsAs(Employee.class);
			return allDocs;
	}
	
	@GetMapping("/employees/{id}")
	public ResponseEntity<?> getById(@PathVariable String id) throws IOException {
			db = client.database("employee", false);
			Employee employee = db.find(Employee.class, id);
			return ResponseEntity.ok(employee);
	}
	
	@DeleteMapping("/employees/{id}")
	public ResponseEntity<?> deleteById(@PathVariable String id) throws IOException {
		db = client.database("employee", false);
		Employee employee = db.find(Employee.class, ""+id+"");
		Response remove = db.remove(employee.get_id(),employee.get_rev());
		//return new ResponseEntity<String>(remove.getReason(), HttpStatus.valueOf(remove.getStatusCode()));
		return new ResponseEntity<String>("Deleted successfully", HttpStatus.OK);
		
	}
	
	@PutMapping("/employees/{id}")
	public ResponseEntity<?> updateEmployee(@PathVariable String id, @RequestBody Employee employeeDetails) {
		db = client.database("employee", false);
		Employee employee = db.find(Employee.class, id);
			employee.setFirst(employeeDetails.getFirst());
			employee.setLast(employeeDetails.getLast());
			employee.setEmailAddress(employeeDetails.getEmailAddress());
			
			Response updatedEmployee = db.post(employee);
			
		return ResponseEntity.ok(updatedEmployee);
	}
}
