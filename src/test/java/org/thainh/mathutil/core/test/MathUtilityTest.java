/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.thainh.mathutil.core.test;
import org.junit.jupiter.api.Test;
import org.thainh.math.util.core.MathUtiliy;
import static org.junit.jupiter.api.Assertions.*;

public class MathUtilityTest {
    @Test
    public void checkFactorialGivenRightArgumentReturnsWell(){
        assertEquals(1, MathUtiliy.getFactorial(1));
        assertEquals(6, MathUtiliy.getFactorial(3));
        assertEquals(24, MathUtiliy.getFactorial(4));
    }
}

//DDT: Data Driven Testing
//Not test driven development
//ki thuat viet code lam app thi phai viet luon code cho cac
//test case de bao dam ham/ method/ class
//        TDD: viet code chinh va code test/test case dan xen de check ham
//dung sai
//        ddt: trong qua trinh viet code test, tach data test ra rieng 1 cho
//cho de doc, bao tri
//ddt la nam trong tdd
//test driven development la ki thuat danh cho dan dev
// noi ve viec viet code chinh can phai dc kiem tra ngay ve chat luong
//nên viết code đan xen, xen kẽ cùng với việc thiết kế
//các test case để test code chính
//lập trình mà viết code chín và code test (JUnit, Unit Test) đan xen xen kẽ nhau thì gọi là tdd
//ddt là kĩ thuật mở rộng cho tđ trong đó việc viết code test đc tách riêng ra so với test data
//ngĩa là bộ dữ liệu test thường đc đặt để ở 1 mảng 2 chiều hoặc để ở table, file txt, Excel sau
//đó đc nhồi/ fill vào lệnh thử
//việc data tách ra, sau đó fill lại là parameterized testing