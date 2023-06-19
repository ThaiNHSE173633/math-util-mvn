/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package org.thainh.mathutil.core.test;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.provider.MethodSource;
import org.thainh.math.util.core.MathUtiliy;

/**
 *
 * @author Windows
 */
public class MathUtilityAdvancedTest {
    
    public MathUtilityAdvancedTest() {
    }
    //tra ve mang 2 chieu
    @Test
    public static Object[][] InitTestData(){
        Object[][] testData = {{0,1},{1,1}};
        return testData;
    }
    @ParameterizedTest
    @MethodSource("InitTestData")
    public void checkFactorialGivenRightArgumentReturnsWell(int n, int a){
        assertEquals(a, MathUtiliy.getFactorial(n));
    }
}

//