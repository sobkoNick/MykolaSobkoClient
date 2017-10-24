package com.epam.lab.test;

import com.epam.lab.service.RestRequestMaker;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 *
 */
public class RestTest {
    private static final Logger LOGGER = Logger.getLogger(RestTest.class);
    private String restBaseUrl;
    RestRequestMaker restRequestMaker;

    @BeforeTest
    public void setUp() {
        restBaseUrl = "http://localhost:8085/RESTfulCRUD/rest/calc";
        restRequestMaker = new RestRequestMaker();
    }

    @Test
    public void restPlusTest_ValidValuesPassed_ShouldPass() {
        double firstN = 23;
        double secondN = 7;
        double expectedResult = 30.0;
        double result = restRequestMaker.getResultFromJson(restBaseUrl + "/plus/" + firstN + "/" + secondN);
        LOGGER.info("Expected result = " + expectedResult + " and actual = " + result);
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void restMinusTest_ValidValuesPassed_ShouldPass() {
        double firstN = -120;
        double secondN = -125;
        double expectedResult = 5.0;
        double result = restRequestMaker.getResultFromJson(restBaseUrl + "/minus/" + firstN + "/" + secondN);
        LOGGER.info("Expected result = " + expectedResult + " and actual = " + result);
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void restDivisionTest_ValidValuesPassed_ShouldPass() {
        double firstN = 121;
        double secondN = 33;
        double expectedResult = 3.6667;
        double result = restRequestMaker.getResultFromJson(restBaseUrl + "/division/" + firstN + "/" + secondN);
        LOGGER.info("Expected result = " + expectedResult + " and actual = " + result);
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void restMultiplicationTest_ValidValuesPassed_ShouldPass() {
        double firstN = 2.22222222;
        double secondN = 5;
        double expectedResult = 11.1111;
        double result = restRequestMaker.getResultFromJson(restBaseUrl + "/multiple/" + firstN + "/" + secondN);
        LOGGER.info("Expected result = " + expectedResult + " and actual = " + result);
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void restPercentTest_ValidValuesPassed_ShouldPass() {
        double firstN = 222;
        double secondN = 5;
        double expectedResult = 2.0;
        double result = restRequestMaker.getResultFromJson(restBaseUrl + "/percent/" + firstN + "/" + secondN);
        LOGGER.info("Expected result = " + expectedResult + " and actual = " + result);
        Assert.assertEquals(expectedResult, result);
    }
}
