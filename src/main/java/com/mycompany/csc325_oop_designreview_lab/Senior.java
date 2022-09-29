/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_oop_designreview_lab;
import java.util.Scanner;

/**
 *
 * @author kulsomzaraei
 */
public class Senior extends Student{
    private int credits;
    
    Scanner scnr = new Scanner(System.in);
    
    public Senior(String name, short age, int credits){
        super(name,age);
        this.credits = credits;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }
     public String toString(){
        System.out.println("Enter GPA");
       int gpa = scnr.nextInt();
       this.setGPA(gpa);
       
       String result = "";
       result = "Name: " + this.getName() + "\n" +
               "Age: " + this.getAge() + "\n " +
               "Credits: " + this.getCredits() + "\n" +
               "GPA: " + this.getGPA() + "\n";
        return result;
           

        
    }
   
        }  
    
