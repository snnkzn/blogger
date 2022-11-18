package com.patika.blogger.controller;
 
import com.patika.blogger.model.EnableFlag;
import com.patika.blogger.model.ExpenseType;
import com.patika.blogger.repository.ExpenseTypeRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/expensetype")
public class ExpenseTypeController {
    
    @Autowired
    private ExpenseTypeRepository expenseTypeRepository ;
    
    @GetMapping(path = "/getExpenseType")
    public List<ExpenseType> getExpenseType()
    {
        
        return expenseTypeRepository.findAll();
    }
    
    @GetMapping(path = "/setExpenseType")
    public void setExpenseType()
    {
        ExpenseType newExpenseType = new  ExpenseType(0,"Test",EnableFlag.YES);
        expenseTypeRepository.save(newExpenseType);
    }
    
}
