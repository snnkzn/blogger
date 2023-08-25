
package com.patika.blogger.repository;
import com.patika.blogger.model.UserModel;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;
import com.patika.blogger.model.Gender;
import javax.persistence.EntityManager;

@Component
public interface UserModelRepository extends JpaRepository<UserModel, Long> {

    List<UserModel> findAll();

    List<UserModel> findByGender(Gender gender);


    @Query("SELECT firstName FROM UserModel um WHERE um.firstName = :firstName ")
        List<UserModel> findByFirstName(@Param("firstName")String firstName);

    }





