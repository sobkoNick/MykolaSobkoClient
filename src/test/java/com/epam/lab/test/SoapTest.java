package com.epam.lab.test;

import com.epam.lab.service.soap.CalcServiceImpl;
import com.epam.lab.service.soap.CalcServiceImplService;
import com.epam.lab.service.util.TestNGListener;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

/**
 *
 */
@Listeners({TestNGListener.class})
public class SoapTest {

    private static final Logger LOGGER = Logger.getLogger(SoapTest.class);

    CalcServiceImpl calcService = null;
    NumberFormat format = null;
    Number number = null;

    @BeforeTest
    public void setUp() {
        calcService = new CalcServiceImplService().getCalcServiceImplPort();
        format = NumberFormat.getInstance(Locale.FRANCE);
        number = null;
    }

    @Test
    public void soapPlusTest_ValidValuesPassed_ShouldPass() {
        try {
            number = format.parse((calcService.plus(100, 100)));
        } catch (ParseException e) {
            LOGGER.error(e);
        }
        double result = number.doubleValue();
        double expectedResult = 200.0;
        LOGGER.info("Expected result = " + expectedResult + " and actual = " + result);
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void soapMinusTest_ValidValuesPassed_ShouldPass() {
        try {
            number = format.parse((calcService.minus(100, 10)));
        } catch (ParseException e) {
            LOGGER.error(e);
        }
        double result = number.doubleValue();
        double expectedResult = 90.0;
        LOGGER.info("Expected result = " + expectedResult + " and actual = " + result);
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void soapDivisionTest_ValidValuesPassed_ShouldPass() {
        try {
            number = format.parse((calcService.division(120, 10)));
        } catch (ParseException e) {
            LOGGER.error(e);
        }
        double result = number.doubleValue();

        double expectedResult = 12.0;
        LOGGER.info("Expected result = " + expectedResult + " and actual = " + result);
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void soapMultipleTest_ValidValuesPassed_ShouldPass() {
        try {
            number = format.parse((calcService.multiple(100, 10)));
        } catch (ParseException e) {
            LOGGER.error(e);
        }
        double result = number.doubleValue();

        double expectedResult = 1000.0;
        LOGGER.info("Expected result = " + expectedResult + " and actual = " + result);
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void soapPercentTest_ValidValuesPassed_ShouldPass() {
        try {
            number = format.parse((calcService.percent(5, 3)));
        } catch (ParseException e) {
            LOGGER.error(e);
        }
        double result = number.doubleValue();

        double expectedResult = 2.0;
        LOGGER.info("Expected result = " + expectedResult + " and actual = " + result);
        Assert.assertEquals(expectedResult, result);
    }

}
