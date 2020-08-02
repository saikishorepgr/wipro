package com.mile1.main;

import com.mile1.bean.Student;
import com.mile1.exception.NullMarksArrayException;
import com.mile1.exception.NullNameException;
import com.mile1.exception.NullStudentObjectException;
import com.mile1.service.StudentReport;
import com.mile1.service.StudentService;

public class StudentMain
{
    static	Student data[] = new Student[10];

    static {
        for (int i = 0; i <data.length; i++)  	data [i] = new Student (null, null);
        data [0] = new Student ("Sekar", new int [] {35, 35, 35});
        data [1] = new Student(null, new int[]{11,22,33});
        data [2] = null;
        data [3] = new Student ("Manoj", null);
        data [4] = new Student("C3", new int[] {14, 14, 99});
        data [5] = new Student("A2", new int[] {77,55,12});
        data [6] = new Student(null, new int[] {13, 88, 13});
        data [7] = new Student ("bhanu",null);
        data [8] = new Student("rekha", null);
        data [9] = null;
    }


    /*static{
        for (int i = 0; i <data.length; i++)  	data [i] = new Student (null, null);
        data[0] = new Student ("A1", new int [] {72,73,74});
        data[1] = new Student ("B1", new int [] {75,76,77});
        data[2] = new Student ("C1", new int [] {99,99,99});
        data[3] = new Student ("C3", new int [] {100,100,99});
        data[4] = new Student ("B2", new int [] {13,88,13});
        data[5] = new Student ("C3", new int [] {14,14,99});
        data[6] = new Student ("A2", new int [] {77,55,12});
        data[7] = new Student (null, new int [] {13,88,13});
        data[8] = new Student ("A2", null);
        data[9] = null;
    }*/


    public static void main(String[]args)
    {
        StudentReport studentReport = new StudentReport();
        StudentService studentService = new StudentService();
        int i;
        for(i=0;i<10;i++)
        {
            try {
                if (studentReport.validate(data[i]).equals("VALID"))
                {
                    System.out.println(studentReport.findGrades(data[i]));
                }
            }
            catch (NullNameException e) {
                e.printStackTrace();
            } catch (NullStudentObjectException e) {
                e.printStackTrace();
            } catch (NullMarksArrayException e) {
                e.printStackTrace();
            }
        }
        System.out.println(studentService.findNumberOfNullMarksArray(data));
        System.out.println(studentService.findNumberOfNullName(data));
        System.out.println(studentService.findNumberOfNullObjects(data));
    }
}
