// write a program to print student having max marks
#include<iostream>
using namespace std;
typedef struct Student
{
    int sid;
    char sname[20];
    int marks;
    void accept()
    {
        cout<<"Enter id name and marks of student : ";
        cin>>sid>>sname>>marks;
    }
    void display()
    {
        cout<<sid<<"\t"<<sname<<"\t"<<marks;
    }

}stu;
stu getMax(stu [],int);
int main()
{
    int i;
    stu student[5],res;
    for(i=0;i<5;i++)
    student[i].accept();
    for(i=0;i<5;i++)
    student[i].display();
res=getMax(student,5);
    cout<<"\nFollowing Student Have Maximum Marks :  ";
    res.display();
        return 0;
}
stu getMax(stu s[],int size)
{   stu q=s[0];
    int max=s[0].marks,i,roll=0;
    for(i=1;i<size;i++)
    {
        if(s[i].marks>max)
       {max=s[i].marks;
       q=s[i];
       } 
    }
    return q;
}