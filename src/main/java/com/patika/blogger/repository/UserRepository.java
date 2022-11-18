 
package com.patika.blogger.repository;

import com.patika.blogger.model.User;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface UserRepository  extends JpaRepository<User,Long>{
    
    List<User> findById(long id);
    List<User> findAll();    
}
