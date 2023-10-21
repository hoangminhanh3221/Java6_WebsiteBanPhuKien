package J6.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import J6.dao.DAO_Account;
import J6.dao.DAO_Authority;
import J6.entity.Account;
import J6.entity.Authority;
import J6.service.Service_Authority;

@Service
public class ServiceImpl_Authority implements Service_Authority{
	
	@Autowired private DAO_Authority authdao;
	@Autowired private DAO_Account accdao;
	
	@Override
	public List<Authority> findAuthoritiesOfAdministrators() {
		List<Account> accounts = accdao.getAdministrators();
		return authdao.authoritiesOf(accounts);
	}

	@Override
	public List<Authority> findAll() {
		return authdao.findAll();
	}

	@Override
	public Authority create(Authority auth) {
		return authdao.save(auth);
	}

	@Override
	public void delete(Integer id) {
		authdao.deleteById(id);
	}

	@Override
	public List<Authority> getOneByRole(String username) {
		return authdao.getOneByRole(username);
	}

	@Override
	public void deleteByUsername(String username) {
		authdao.deleteByUserName(username);
	}

	/*Summary*/
	@Override
	public Long getTotalCustomer() {
		return authdao.findAll().stream().filter(e->e.getRole().getName().equals("Customers")).count();
	}
	
}
