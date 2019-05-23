/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaApplication2;

/**
 ** A class to model Student Objects
 * each student has: a name (first and last name)
 * each student can: say their name (getName)

 *may 23 2019
 AMANJOT KAUR BRAR**/
public class JavaApplication2 {

    private String name;
    private int n;

    //constructor
    public JavaApplication2 (String givenName,int n)
    {
        name=givenName;
       
        
       
    }
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String givenName) {
        name = givenName;
    }
    System.out.println("fetch eg");
    
    
}

