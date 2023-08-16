 
package com.patika.blogger.repository;

import com.patika.blogger.model.UserModel;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface UserRepository  extends JpaRepository<UserModel,Long>{
    
    List<UserModel> findById(long id);
    List<UserModel> findAll();    
}
