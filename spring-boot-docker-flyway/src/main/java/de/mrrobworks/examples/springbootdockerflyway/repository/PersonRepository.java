package de.mrrobworks.examples.springbootdockerflyway.repository;

import de.mrrobworks.examples.springbootdockerflyway.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
