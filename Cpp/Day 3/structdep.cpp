// create structure of department and accept no of department to insert
#include<iostream>
using namespace std;
typedef struct Department
{
    int id;
    char name[20];
    void accept()
    {
        cout<<"Enter Department Id and Department Name: ";
        cin>>id>>name;
    }
    void display()
    {
        cout<<"\n"<<id<<"\t"<<name;
    }

}Dep;
int main()
{
    int i,no;
    Dep *d;
    cout<<"Please Enter total No of Departments: ";
    cin>>no;
    d=new Dep[no];

    for(i=0;i<no;i++)
   { d[i].accept();}

   for(i=0;i<no;i++)
   { 
    d[i].display();}
delete []d;

    return 0;
    
}