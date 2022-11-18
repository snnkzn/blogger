package com.patika.blogger.repository;

import com.patika.blogger.model.ExpenseType;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

 
public interface ExpenseTypeRepository extends JpaRepository<ExpenseType, Long>{
    List<ExpenseType> findById(long id);
    List<ExpenseType> findAll();
}
