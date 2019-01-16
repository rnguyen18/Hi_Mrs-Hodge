package javaapplication1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ryan_
 */
public class ArrayPractice {
    
    private static int count = 0;
    private static String[] array = new String[0];
    
    public ArrayPractice(String name) {
        count++;
        String[] newarray = new String[count];
        newarray[count-1] = name;
        for (int i = 0; i < count - 1; i++) {
            newarray[i] = array[i];
        }
        
        array = newarray;
    }
    
    public static void printAll() {
        for (int i = 0; i < count; i++) {
            System.out.println(array[i]);
        }
    }
}
