package J6.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import J6.entity.OrderDetail;

@Repository
public interface DAO_OrderDetail extends JpaRepository<OrderDetail, Long>{

}
