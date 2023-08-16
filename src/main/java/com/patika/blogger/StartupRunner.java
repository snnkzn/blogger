
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
public class StartupRunner implements CommandLineRunner{

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
        Random random = new Random();
        String alphabet = "abcdefghijklmnopqrstuvwxyz";

        for (int i = 0; i < 100; i++) {
            String lastName = generateRandomName(random, alphabet);
            String name = generateRandomName(random, alphabet);
            String gender = (i < 50) ? "Male" : "Female";

            System.out.println("Person " + (i + 1) + ": " + name + " - " + lastName + " - " +gender );
        }
    }

    public static String generateRandomName(Random random, String alphabet) {
        int firstName = random.nextInt(2)+3;
        int lastName = random.nextInt(2)+2;
        StringBuilder nameBuilder = new StringBuilder();

        for (int i=0; i <lastName; i++){
            int indexForLastName = random.nextInt(alphabet.length());
            char letterForLastName = alphabet.charAt(indexForLastName);
            nameBuilder.append(letterForLastName);
        }
        for (int i = 0; i < firstName; i++) {
            int index = random.nextInt(alphabet.length());
            char letter = alphabet.charAt(index);
            nameBuilder.append(letter);
        }

        return nameBuilder.toString();
    }

}
