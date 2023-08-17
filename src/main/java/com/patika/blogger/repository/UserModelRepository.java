
package com.patika.blogger.repository;

import com.patika.blogger.model.UserModel;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import com.patika.blogger.model.Gender;

@Component
public interface UserModelRepository extends JpaRepository<UserModel, Long> {

    List<UserModel> findAll();
    List<UserModel> findByGender(Gender gender);
}
