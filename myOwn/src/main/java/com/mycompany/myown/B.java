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
public class B implements Integerer{
//public class B extends A 
//we dont want to do this even tho my class will be able to access these methods
//
    /*public int getInteger(){
        return 9;
        //screwed up and typed in the wrong number
        //so now we have to test them both and if one doesnt then its wrong
        //if the code is only writtin in one place then less errors and
        //easier to test
    }*/
    //we can completley get ride of the implementation 
    
    public String getString(){
        return "hello";
    }
    
}
