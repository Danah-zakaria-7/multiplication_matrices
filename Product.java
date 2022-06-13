
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
