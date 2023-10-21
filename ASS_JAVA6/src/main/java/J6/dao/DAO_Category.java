package J6.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import J6.entity.Category;

@Repository
public interface DAO_Category extends JpaRepository<Category, String>{

}
