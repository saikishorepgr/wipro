package com.mile1.service;

import com.mile1.bean.Student;

public class StudentService
{
    public int findNumberOfNullObjects(Student s[])
    {
        int i,c=0;
        for(i=0;i<s.length;i++)
        {
            if(s[i]==null)
            {
                c++;
            }
            /*else
            {
                if(s[i].getName() == null)
                {
                    c++;
                }
                else if(s[i].getMarks()==null)
                {
                    c++;
                }
            }*/
        }
        return c;
    }
    public int findNumberOfNullName(Student s[])
    {
        int i,c=0;
        for(i=0;i<s.length;i++)
        {
            if(s[i]==null);
            else if(s[i].getName()==null)
            {
                c++;
            }
        }
        return c;
    }
    public int findNumberOfNullMarksArray(Student s[])
    {
        int i,j,c=0;
        for(i=0;i<s.length;i++)
        {
            if(s[i]==null);
            else
            {
                if(s[i].getMarks()==null)
                    c++;
            }
        }
        return c;
    }
}
