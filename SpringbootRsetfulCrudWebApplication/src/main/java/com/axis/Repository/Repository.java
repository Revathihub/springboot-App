package com.axis.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.axis.modal.User;

public interface Repository extends JpaRepository<User,Long>{

}
