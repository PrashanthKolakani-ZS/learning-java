package me.ujjawal.learning_java.testing;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SampleCalculatorDemo {
        private static final Logger LOGGER = LogManager.getLogger(UsingJUnit.SampleCalculator.class);

        Integer sum(Integer x, Integer y) throws UsingJUnit.CalculatorException {
            if (null == x) {
                throw new UsingJUnit.CalculatorException("x is invalid, shouldn't be null");
            }
            if (null == y) {
                throw new UsingJUnit.CalculatorException("y is invalid, shouldn't be null");
            }
            LOGGER.debug("x: " + x + ", y: " + y);
            Integer result = x + y;
            LOGGER.debug("result: " + result);
            return result;
        }

        Integer sub(Integer x, Integer y) throws UsingJUnit.CalculatorException {
            if (null == x) {
                throw new UsingJUnit.CalculatorException("x is invalid, shouldn't be null");
            }
            if (null == y) {
                throw new UsingJUnit.CalculatorException("y is invalid, shouldn't be null");
            }
            LOGGER.debug("x: " + x + ", y: " + y);
            Integer result = x - y;
            LOGGER.debug("result: " + result);
            return result;
        }
}
