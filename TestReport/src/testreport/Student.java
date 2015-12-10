/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testreport;

/**
 *
 * @author Van
 */
public class Student {
    private int id;  
      private String name;  
      private double mark;  

      public Student(int id, String name, double mark){  
           this.id = id;  
           this.name = name;  
           this.mark = mark;  
      }
  
      public int getId() {  
           return id;  
      }  
      public void setId(int id) {  
           this.id = id;  
      }  
      public String getName() {  
           return name;  
      }  
      public void setName(String name) {  
           this.name = name;  
      }  
      public double getMark() {  
           return mark;  
      }  
      public void setMark(double mark) {  
           this.mark = mark;  
      }  
    
}
