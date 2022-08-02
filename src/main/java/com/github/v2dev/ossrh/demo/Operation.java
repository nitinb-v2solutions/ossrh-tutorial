package com.github.v2dev.ossrh.demo;

import java.math.BigDecimal;

/**
 * Really silly class that provides the same functionality as {@link BigDecimal}
 * itself for simple arithmetic operationsXD
 */
public class Operation
{
    /**
     *  dummy add method
     * @param x dummy desc
     * @param y dummy desc
     * @return dummy desc
     */
	public static BigDecimal add(BigDecimal x, BigDecimal y) {
        return x.add(y);
    }
	
    /**
     * dummy substract method
     * @param x dummy desc
     * @param y dummy desc
     * @return dummy desc
     */
    public static BigDecimal substract(BigDecimal x, BigDecimal y) {
        return x.subtract(y);
    }
    
    /**
     * dummy multiply method
     * @param x dummy desc
     * @param y dummy desc
     * @return dummy desc
     */
    public static BigDecimal multiply(BigDecimal x, BigDecimal y) {
        return x.multiply(y);
    }

    /**
     * dummy divide method
     * @param x dummy desc
     * @param y dummy desc
     * @return dummy desc
     */
    public static BigDecimal divide(BigDecimal x, BigDecimal y) {
        return x.divide(y);
    }
}
