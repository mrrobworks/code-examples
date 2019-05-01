package de.mrrobworks.examples.springbootdockerflyway;

import de.mrrobworks.examples.springbootdockerflyway.model.Person;
import de.mrrobworks.examples.springbootdockerflyway.repository.PersonRepository;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@Slf4j
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
@SpringBootApplication
public class SpringBootDockerFlywayApplication implements CommandLineRunner {

    @NonNull
    private final PersonRepository personRepository;

    @Override
    public void run(String... args) {
        final List<Person> all = personRepository.findAll();
        all.forEach(person -> log.info(person.toString()));
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDockerFlywayApplication.class, args);
    }
}
