/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.myown;

import newpackage.APrime;

/**
 *
 * @author Sammie
 */
public class MyClass {
    public static void main(final String[] args) {
       
    
    final A x = new A();
    final A y = new A();
    
    }
    
}
                //world         the class       desendents      packages
//private           X              Y                X              X
//protected         X              Y                Y              Y
//(when nothing)    X              Y                X              Y
//public            Y              Y                Y              Y


 /*final B b = new B();
        final doubler aPrime = new APrime();
        // aPrime gets the interface doubler but it doenst know it has getInteger 
        //the only method we can possinbly call on this object is getdouble
        //final APrime aPrime = new APrime();
        //final int x = b.getInteger();
        //final int y = aPrime.getInteger();
        final double y = aPrime.getDouble();
        System.out.print(x);
        
        
        
        if(aPrime instanceof Intergerer){
            final Integerer copy = (Integerer)aPrime;
            final int x = copy.getInteger();
        }
    }*/
    //----final A x = new APrime(); should be 5
    
    //------final APrime x = new APrimePrime(); //should still be prime
    //we tell compiler its an A but we created an APrime
    //we get 2.0 
    //we are telling the compiler that its type A 
    //this varibale can hold anything that has the type A as an ansestor
    //we are ganna make a APrime object
    //-----final Object b = new Object();
   // -----System.out.println(((A)b).getDouble()); //method not defined its trying to
    //call A class object b
    
    //the caller is MainStuff so its not a child of A so its cant access its methods
    //-----System.out.println(x.getDouble()); 
    //------System.out.println(((A)x).getDouble());
    //-------System.out.println(((APrimePrime)x).getInteger()); //treating x like a 
    //APrimePrime object
    