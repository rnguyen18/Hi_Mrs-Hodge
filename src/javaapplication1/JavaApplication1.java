/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.*;

/**
 *
 * @author ryan_
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    
    private int count = 0;
    private String[] name = new String[count+1];
    
    public JavaApplication1(String name2) {
        name[count] = name2;
        count++;
    }
    
    public static void main(String[] args) {
        new ArrayPractice("Frank");
        new ArrayPractice("Joe");
        new ArrayPractice("Billy");
        
        ArrayPractice.printAll();
    }
    
}
