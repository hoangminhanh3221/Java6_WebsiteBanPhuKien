package J6.controller.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import J6.entity.Role;
import J6.service.Service_Role;

@CrossOrigin("*")
@RestController
@RequestMapping("rest/roles")
public class RestController_Role {
	@Autowired private Service_Role roleService;
	
	@GetMapping
	public List<Role>getAll(){
		return roleService.findAll();
	}
}
