/*1. Create structure of Student having following attributes
1. Roll number
2. name of student
3. numberofsubject.
4. int *mark;
5. Percentage;
Accept number of studnet, Allocate memmory for structure array. Accept and display information.*/
#include<iostream>
using namespace std;
typedef struct Student
{
    int i,roll,sub,total=0;
    char name[20];
    int *marks;
    float perc;
    void accept()
    {
        cout<<"\nPlease enter Student's Roll no: ";
        cin>>roll;
        cout<<"\nPlease enter Student's name: ";
        cin>>name;
        cout<<"\nPlease enter number of Subjects: ";
        cin>>sub;
        marks=new int[sub];
        cout<<"\nPlease enter "<<sub<<" subjects marks: ";
        for(i=0;i<sub;i++)
        {
            cin>>marks[i];
            total+=marks[i];
        }
        perc=(float)total/sub;
    }
    void display()
    {
        cout<<"\nStudent's Roll no: "<<roll<<"\nStudent's Name: "<<name<<"\nStudent's Percentage: "<<perc;
    }
}stud;
stud gettopper(stud[],int);
int main()
{
    int i,no;
    stud *s;
    cout<<"Please Enter Total Number of Students: ";
    cin>>no;
    s=new stud[no];
    for(i=0;i<no;i++)
    s[i].accept();
    for(i=0;i<no;i++)
    s[i].display();

    stud topper=gettopper(s,no);
    cout<<"\n\n Topper among the Students is : ";
    topper.display();
    return 0;
}
stud gettopper(stud s[],int size)
{
    stud top=s[0];
    int i,max=s[0].perc;
    for(i=0;i<size;i++)
    {
        if(s[i].perc>max)
        {
            max=s[i].perc;
            top=s[i];
        }
    }
    return top;
}