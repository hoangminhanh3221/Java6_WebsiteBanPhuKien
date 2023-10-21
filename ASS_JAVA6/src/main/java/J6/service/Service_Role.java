package J6.service;

import java.util.List;

import org.springframework.stereotype.Service;

import J6.entity.Role;


@Service
public interface Service_Role {
	List<Role> findAll();
}
