package com.projetOne.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student mariam = new Student(
                    "Miriam",
                    "mariam.jamal@gmail.com",
                    LocalDate.of(2004, Month.JANUARY, 5)
            );
            Student alex = new Student("alex",
                    "alex.diop@gmail.com",
                    LocalDate.of(2005, Month.APRIL, 4)
            );
            Student samba= new Student("samba",
                    "samba.diop@hotmail.com",
                    LocalDate.of(2008,Month.SEPTEMBER,7)
                   );
            repository.saveAll(List.of(mariam, alex,samba));
        };
    }
}