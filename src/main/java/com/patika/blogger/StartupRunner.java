package com.patika.blogger;

import com.patika.blogger.model.Gender;
import com.patika.blogger.model.UserModel;
import com.patika.blogger.repository.ExpenseTypeRepository;
import com.patika.blogger.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class StartupRunner implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private ExpenseTypeRepository expenseTypeRepository;

    @Override
    public void run(String... args) throws Exception {

     /*   UserModel newUser = new UserModel(2, "Kürşat", "Ufuk", "k@gmail.com", Gender.MALE,null , null);
        userRepository.save(newUser);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        //ExpenseType newExpenseType = new ExpenseType(1,"test2",EnableFlag.NO);
        //expenseTypeRepository.save(newExpenseType);
    */


        for (int i = 0; i < 100; i++) {
            String lastName = generateRandomName();
            String name = generateRandomName();
            String email = name + lastName+"@gmail.com";
            Gender gender = (i < 50) ? Gender.MALE : Gender.FEMALE;
            System.out.println("Person " + (i + 1) + ": " + name + " - " + lastName +" - " + email + " - " + gender);
            UserModel newUser = new UserModel( name, lastName, email, gender,null , null);
            userRepository.save(newUser);
        }
    }

    public static String generateRandomName() {
        Random random = new Random();
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
            int nameLength = random.nextInt(5) + 3;
            char[] nameChars = new char[nameLength];
            for (int i = 0; i < nameLength; i++) {
                int index = random.nextInt(alphabet.length());
                char letter = alphabet.charAt(index);
                nameChars[i] = letter;
            }


return new String(nameChars);
        }


    }
