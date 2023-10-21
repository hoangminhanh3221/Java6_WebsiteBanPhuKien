package J6.service;

import java.util.List;

import org.springframework.stereotype.Service;

import J6.entity.Category;

@Service
public interface Service_Category {

	List<Category> findAll();

}
