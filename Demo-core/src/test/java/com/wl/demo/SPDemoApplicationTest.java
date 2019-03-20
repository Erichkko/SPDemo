package com.wl.demo;


import com.wl.demo.model.Person;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class SPDemoApplicationTest {

    @Autowired
    Person person;

    @Test
    public void personTest() {
        log.error(""+person);
//        log.error(""+person.getDog().getName());
    }
}
