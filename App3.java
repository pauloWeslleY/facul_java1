/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package app3;

/**
 *
 * @author profslvo
 */

import java.util.*;
public class App3 {

    public static void main(String[] args) {
        Scanner event = new Scanner(System.in);

        String name;
        double note1, note2, average;    
        
        System.out.println("Insert this line your name");
        name = event.nextLine();

        System.out.println("Insert your notes!");
        note1 = event.nextDouble();
        note2 = event.nextDouble();
        
        average = (note1 + note2) / 2;
        
        System.out.println(name + " your average is: " + average);
        
        event.close();
    }  
    
}
