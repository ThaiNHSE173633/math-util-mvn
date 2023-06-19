/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.thainh.math.util.core;

/**
 *
 * @author Windows
 */
public class MathUtiliy {
    public static int getFactorial(int n){
        if(n<0 || n>20)
            throw new IllegalArgumentException();
        int x=1;
        for(int i=1;i<=n;i++){
            x*=i;
        }
        return x;
    }
    
}
