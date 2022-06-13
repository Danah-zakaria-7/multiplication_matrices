/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.product;


public class Product {
    
    public int [] mularray(int [] a , int [] b)
    {
        int [] result = new int [b.length];
        for(int i=0; i<a.length;i++)
            result[i]= a[i]*b[i];
        return result;
    }

    public static void main(String[] args) {
        
        Product X = new Product();
        int one[] = {1,3,1};
        int two[] = {2,3,4};
        int r[] = X.mularray(one, two);
        
        for(int i=0; i<r.length;i++)
        System.out.println(r[i]);
    }
}
