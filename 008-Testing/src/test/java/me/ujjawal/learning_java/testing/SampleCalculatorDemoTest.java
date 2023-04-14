package me.ujjawal.learning_java.testing;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.*;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

class SampleCalculatorDemoTest {

    private static final Logger LOGGER = LogManager.getLogger(SampleCalculatorDemoTest.class);
    SampleCalculatorDemo sampleCalculatorDemo = new SampleCalculatorDemo();

    @BeforeAll
    static void setupBeforeAll(){
        LOGGER.info("setupBeforeAll");
    }

    @AfterAll
    static void tearDownAfterAll(){
        LOGGER.info("tearDownAfterAll");
    }

    @BeforeEach
    void setUp() {
        LOGGER.info("setUp");
    }

    @AfterEach
    void tearDown() {
        LOGGER.info("tearDown");
    }

    @Test
    void sum() throws UsingJUnit.CalculatorException {
        Integer result = sampleCalculatorDemo.sum(1, 2);
        assertEquals(3, result);
    }

    @Test
    void sumInvalidXValue(){
        try{
            sampleCalculatorDemo.sum(null, 2);
            fail("Failed");
        } catch (UsingJUnit.CalculatorException e) {
            LOGGER.info("Successful");
        }
    }

    @Test
    @Disabled
    void sumInvalidYValue(){
        assertThrows(UsingJUnit.CalculatorException.class, ()->sampleCalculatorDemo.sum(1, null));
    }



}
