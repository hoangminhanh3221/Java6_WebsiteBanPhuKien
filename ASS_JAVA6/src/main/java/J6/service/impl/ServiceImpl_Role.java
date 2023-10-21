package J6.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import J6.dao.DAO_Role;
import J6.entity.Role;
import J6.service.Service_Role;

@Service
public class ServiceImpl_Role implements Service_Role{

	@Autowired private DAO_Role dao;

	@Override
	public List<Role> findAll() {
		return dao.findAll();
	}
	
}
