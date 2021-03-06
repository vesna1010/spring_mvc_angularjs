package students.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import students.service.DepartmentService;
import students.model.Department;

@RestController
@RequestMapping("/departments")
public class DepartmentController {

	@Autowired
	public DepartmentService departmentService;

	@RequestMapping(method = RequestMethod.GET, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Department> findAllDepartments() {
		return departmentService.findAllDepartments();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public Department findDepartmentById(@PathVariable Long id) {
		return departmentService.findDepartmentById(id);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE, 
			produces = MediaType.TEXT_PLAIN_VALUE)
	public String deleteDepartmentById(@PathVariable Long id) {
		departmentService.deleteDepartmentById(id);

		return "Department has been successfully deleted!";
	}

	@RequestMapping(method = RequestMethod.POST, 
			consumes = MediaType.APPLICATION_JSON_VALUE, 
			produces = MediaType.TEXT_PLAIN_VALUE)
	public String saveDepartment(@RequestBody Department department) {
		departmentService.saveDepartment(department);

		return "Department has been successfully saved!";
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT, 
			consumes = MediaType.APPLICATION_JSON_VALUE, 
			produces = MediaType.TEXT_PLAIN_VALUE)
	public String updateDepartment(@RequestBody Department department, @PathVariable Long id) {
		departmentService.updateDepartment(department, id);

		return "Department has been successfully updated!";
	}

}

