package J6.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import J6.entity.Role;

@Repository
public interface DAO_Role extends JpaRepository<Role, String>{

}
