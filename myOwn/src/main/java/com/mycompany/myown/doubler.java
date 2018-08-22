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
public interface doubler {
    public default double getBoolean(){
        return 1.0;
    }
    
}
