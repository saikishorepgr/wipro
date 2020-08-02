package com.mile1.service;

import com.mile1.bean.Student;
import com.mile1.exception.NullMarksArrayException;
import com.mile1.exception.NullNameException;
import com.mile1.exception.NullStudentObjectException;

public class StudentReport
{
    public String findGrades(Student studentObject)
    {
        int i,sum=0;
        int[] grades = studentObject.getMarks();
        for(i=0;i<grades.length;i++)
        {
            if(grades[i]<35)
            {
                return "F";
            }
            sum+=grades[i];
        }
        if(sum<150) return "C";
        if(sum<200) return "B";
        if(sum<250) return "A";
        return "A+";
    }
    public String validate(Student s) throws NullNameException, NullMarksArrayException, NullStudentObjectException
    {
        if(s==null)
        {
            throw new NullMarksArrayException();
        }
        else
        {
            if(s.name==null)
            {
                throw new NullNameException();
            }
            if(s.marks==null)
            {
                throw new NullMarksArrayException();
            }
            else {
                return "VALID";
            }
        }
    }
}
