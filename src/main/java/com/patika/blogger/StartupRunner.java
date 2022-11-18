
package com.patika.blogger;

import com.patika.blogger.model.Gender;
import com.patika.blogger.model.User;
import com.patika.blogger.repository.ExpenseTypeRepository;
import com.patika.blogger.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class StartupRunner implements CommandLineRunner {

    static final String alphabets = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";


    @Autowired
    private UserRepository userRepository;
    @Autowired
    private ExpenseTypeRepository expenseTypeRepository;
    private int genderIndex;

    @Override
    public void run(String... args) throws Exception {


        final int MAX = 100;

        String[] name = new String[MAX];
        String[] surname = new String[MAX];
        int[] telephone = new int[MAX];
        String[] GENDER_LIST = {"MALE", "FEMALE"};


        for (int i = 0; i < MAX; i++) {
            name[i] = randomString(5);
            telephone[i] = randomInt(1000000, 9999999);
            surname[i] = randomString(7);
        }

        for (int j = 1; j < MAX; j++) {

            if (j % 2 == 0) {
                User newUser = new User(j, name[j], surname[j], name[j] + "." + surname[j] + "@gmail.com", Gender.FEMALE, null, null);
                userRepository.save(newUser);
            } else {
                User newUser = new User(j, name[j], surname[j], name[j] + "." + surname[j] + "@gmail.com", Gender.MALE, null, null);
                userRepository.save(newUser);
            }

        }
    }


    public static int randomInt(int min, int max) {
        Random rand = new Random();
        int randomNum = rand.nextInt((max - min) + 1) + min;
        return randomNum;
    }

    public static String randomString(int len) {
        Random rand = new Random();
        StringBuilder word = new StringBuilder(len);
        for (int i = 0; i < len; i++) {
            word.append(alphabets.charAt(rand.nextInt(alphabets.length())));
        }
        return word.toString();
    }
}
