/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PartB;

import org.joda.time.DateTime;
import Student.Student;
import Student.Course;
import Student.Module;

/**
 *
 * @author Sean
 */
public class Main {
    
    public static void main(String[] args){
         
        Student[] ece = new Student[3];
        Student[] cs = new Student[3];
        
        ece[0] = new Student("Sean" , "05-09-1994",22,1111111);
        ece[1] = new Student("Mary" , "01-11-1995",20,1111112);
        ece[2] = new Student("John" , "05-12-1995",20,1111113);
        cs[0] = new Student("Kate" , "21-09-1995",21,1111114);
        cs[1] = new Student("Tom" , "12-02-1993",23,1111115);
        cs[2] = new Student("Sarah" , "22-10-1995",20,1111116);
        
        Module[] eMod = new Module[2];
        Module[] cMod = new Module[2];
       
        Module SOC = new Module("System on A Chip" , "EE447" , ece);
        Module TEL = new Module("Telecmmuniations" , "EE445" , ece);
        Module DB = new Module("Database Design" , "CS442" , cs);
        Module PRO = new Module("Programming" , "CS449" , cs);
        
        eMod[0] =SOC;
        eMod[1] = TEL;
        cMod[0] = DB;
        cMod[1] = PRO;
        
        
        Course ECE = new Course("Electrnonic and Computer Engineering" , eMod , new DateTime(2013,9,1,0,0), new DateTime(2017,9,1,0,0));
        Course CS = new Course("Computer Science ", cMod , new DateTime(2013,9,1,0,0), new DateTime(2017,9,1,0,0));
        
        
        for(int i = 0 ; ECE.getModules().length > i; i++ ){
            for(int a = 0 ; eMod.length>a;a++){
                Student[] st =  eMod[a].getStudents();
                for(int e =0; eMod[a].getStudents().length>e ; e++){
                    System.out.println("Student Name:"+ st[e].getName() + " Module :" + eMod[a].getmName() + " Course:" + ECE.getCourse());
                }
            }
            
        }
        
        for(int i = 0 ; CS.getModules().length > i; i++ ){
            for(int a = 0 ; cMod.length>a;a++){
                Student[] ct =  cMod[a].getStudents();
                for(int e =0; cMod[a].getStudents().length>e ; e++){
                    System.out.println("Student Name:"+ ct[e].getName() + " Module :" + eMod[a].getmName() + " Course:" + ECE.getCourse());
                }
            }
            
        }
        
    }
    
}
