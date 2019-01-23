package com.example.usertype;

import com.example.usertype.model.Person;
import com.example.usertype.model.PhoneType;
import com.example.usertype.person.PersonRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserTypeApplicationTests {
    @Autowired
    private PersonRepository personRepository;

    @Test
    public void contextLoads() {
        Person person = new Person();
        person.setFirstName("Name");
        person.setPhoneNumber("1");
        person.setPhoneType(PhoneType.LAND_LINE);

        personRepository.save(person);
    }

}

