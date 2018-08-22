/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.myown;

/**
 *
 * @author Sammie
 */
public class A extends OtherThing implements AllTheTHings{
//    public int getInteger(){
//        return 10;
//    }
    //what if we made this one private 
    //but if we needed it for APrime then APrime wont have it
    
    //usually public now private it can only be used in A Class
    //changed from private to portected
    //making it private again
    
    //why would i do private final
    //
//    private  double getDouble(){
//    //isnt always default public but this is called package private
//        return 1.0;
//    }
    //why would i do private final
    //becomes hard to track a number of paths each number can change to
    //make sure your valriables dont change
    private final double secretValue;
    
    //this is y 
    public A(final double secret) {
        secretValue = secret;
    }
    
    private double getDouble(){
        return 1.0;
    }
    
    //this is x and we are getting value from y 
    //so whatever you pass into me i wont change it (final A other)
    //cant accidently change it 
    //why is useing final controversial because people are lazy
    //poeple dont want to update state
    public A setSecret(final double secret){
        return new A(secret);
    }
    
    public double helpAFriend(final A other){
        return other.getDouble();
    }
    //this is one object that gets private
    //in main method we have a object calling on another classes private methods
    //that object has a private method an it means no ohter objects can apply that method
    //private modifier to the class itself not private to the objects itself 
    //each instance of an object A has access to the private 
}
