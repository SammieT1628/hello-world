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
public class APrimePrime extends APrime{
    //without anything here we arre getting 2.0 because APrime overwrites classA
    public double getDouble(){
        //get 2.0 then add 3 to it
        //return getDouble() + 3; //this will be infinit recursion
        return super.getDouble() + 3;
        //super references the next parent ups
        //method instead of its own so it wont be recursive
        
        //can't do super.super you cant and you shouldn't 
        //changing APrimePrime alone you can't get methods in APrime from here
    }
}
