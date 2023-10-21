package J6.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import J6.dao.DAO_Category;
import J6.entity.Category;
import J6.service.Service_Category;

@Service
public class ServiceImpl_Category implements Service_Category{
	@Autowired private DAO_Category cateDao;

	@Override
	public List<Category> findAll() {
		return cateDao.findAll();
	}
}
