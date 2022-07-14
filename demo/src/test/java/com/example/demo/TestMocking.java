package com.example.demo;


import com.example.demo.model.HelloEntity;
import com.example.demo.repository.HelloRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Optional;
import java.util.Set;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
@DataJpaTest
public class TestMocking {
    private static final Logger LOGGER = LogManager.getLogger(TestMocking.class);
    @Mock
    HelloEntity helloEntity;

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private HelloRepository helloRepository;

    @BeforeMethod
    public void setupMock() {

        LOGGER.info( "Test started");
        long startTime = System.currentTimeMillis();
        startTime = System.currentTimeMillis();
        System.out.println("start time is: " + startTime+"ms");

        helloEntity = mock(HelloEntity.class);
        when(helloEntity.getLang()).thenReturn("English");
        when(helloEntity.gethelloDifLeng()).thenReturn("Hello World");


    }

    @Test
    void testHelloEntityExists() throws ClassNotFoundException {
        //tests whether class exists

        Class a=Class.forName("com.example.demo.model.HelloEntity");


        Assert.assertNotEquals(a,null);

        if (a==null) {
            LOGGER.info("Test failed - class does not exist");
        }else{
            LOGGER.info("Test passed - class exists");
        }

    }


    @Test
    public void HelloLang() {
        System.out.println("Lang: " + helloEntity.getLang());
        assertEquals("English", helloEntity.getLang());
        if(helloEntity.getLang()=="English"){
           LOGGER.info("Test passed");
        }else{
            LOGGER.info("Test failed");
        }
    }

    @Test
    public void HelloWorldFromEntity() {

        System.out.println("Message Hello World in English: " + helloEntity.gethelloDifLeng());
        assertEquals("Hello World", helloEntity.gethelloDifLeng());
        if(helloEntity.gethelloDifLeng()=="English"){
            LOGGER.info("Test passed");
        }else{
            LOGGER.info("Test failed");
        }
    }

    @Test
    public void HelloLangSaveNew() {
        entityManager.persist(new HelloEntity(11L,"Srpski", "Cao svete"));

        HelloEntity helloEntity1 = helloRepository.findBylang("Cao svete");

        assertThat(helloEntity1.getLang()).isEqualTo("Cao svete");

    }

    @AfterEach
    void tearDown() {

        LOGGER.info( "Test ended");
        long startTime = System.currentTimeMillis();
        startTime = System.currentTimeMillis();
        System.out.println("end time is: " + startTime+"ms");
    }


}





