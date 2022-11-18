package com.patika.blogger;
 
import java.text.ParseException;  
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BloggerApplication {

	public static void main(String[] args) throws ParseException {
		SpringApplication.run(BloggerApplication.class, args);
               // Date date = new Date();
               // SimpleDateFormat dateformat = new SimpleDateFormat("dd/mm/yyyy");
               // date = dateformat.parse("22/12/2000");
	}

}
