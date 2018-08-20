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
public interface Integerer{
    public default int getInteger(){
        return 10;
    }
    
}
//you cand make a in vlaue and return said value 
//interfaces cant have their own loacl fields
//so we would need to upgrade to an abstract class
