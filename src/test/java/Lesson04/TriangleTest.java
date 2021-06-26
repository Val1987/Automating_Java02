package Lesson04;

//---

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.junit.jupiter.api.Assertions;


public class TriangleTest {

    Triangle triangle = new Triangle();
    private static Logger logger = LoggerFactory.getLogger(TriangleTest.class);

    @BeforeAll
    static void beforeAllTests() {

        logger.info("Before All Tests");

    }
    //-----------Body-------------

    @Test
    void testTriangle() {
        double result = triangle.triangleSquare(4, 5,6);
        Assertions.assertEquals(10, result, "Expected");

    }

    //-----------Body-------------
    @AfterAll
    static void afterAllTests() {

        logger.info("After All Tests");

    }

}
