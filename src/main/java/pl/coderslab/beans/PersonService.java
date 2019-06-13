package pl.coderslab.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PersonService {
    @Autowired
    private PersonRepository personRepo;

    public PersonRepository getPersonRepo() {
        return personRepo;
    }
}
