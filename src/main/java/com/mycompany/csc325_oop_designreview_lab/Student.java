
package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author MoaathAlrajab
 */
/**
 *
 * @author MoaathAlrajab
 */
public abstract class Student extends  Human {

    private final int credits;
	// ToDo 1: Make this class a child of Human
	
	// ToDo 2: Fix the resulting errors
	
	// ToDo 3: Add a field for GPA and create setter and getter
        Student(String name, short age,int credits){
            this.credits  = credits;
            int gpa = 0;
        }
        
        public int getGPA(int gpa){
            return gpa;
        }
        
        public void setGPA(){
        }
	
	// ToDo 4: Add comments to your code

}