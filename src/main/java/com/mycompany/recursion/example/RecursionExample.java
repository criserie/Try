/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.recursion.example;

/**
 *
 * @author crise
 */
public class RecursionExample {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        int result = randomThing(1);
        System.out.println(result);
    }
    
    public static int randomThing(int num)
    {
        double myRand = Math.random();
        myRand = myRand * 100.0;
        Math.rint(myRand);
        int myResult = (int)myRand;
        if(num > 50)
        {
            num = 0;
            return num;
        }
        
        if(myResult % 2 == 1)
        {
            num = num * 2;
        }
        else if (myResult %2 == 0)
        {
            num = num + 5;
        }
        
        
            System.out.println("num is: "+num);
            return num + randomThing(num);
        
        
        //System.out.println(myRand);
        //return num;
    }
}
