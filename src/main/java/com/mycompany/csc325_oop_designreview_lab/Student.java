
package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author MoaathAlrajab
 */
/**
 *
 * @author MoaathAlrajab
 */
public abstract class Student extends Human {
    

	// ToDo 1: Make this class a child of Human
	private int gpa;
	// ToDo 2: Fix the resulting errors
	
	// ToDo 3: Add a field for GPA and create setter and getter
        public Student(String name, short age){
           super(name, age);
            this.gpa = 0;
        }
        
        public int getGPA(int gpa){
            return gpa;
        }
        
        public void setGPA(int gpa){
            this.gpa = gpa;
        }
	
         @Override
    public String getAddress() {
        return this.address;
    }

    @Override
    public void setAddress(String address) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
	// ToDo 4: Add comments to your code

}