// write structure of employee having id name and salary,accept and diplay data of 5 emp using function
#include<iostream>
#include<cstring>
using namespace std;
typedef struct Employee
{
    int eid;
    char ename[20];
    float esalary;
    void accept();
    void display();


}Emp;
void Emp::accept()
{
    int a;
    char b[20];
    float c;
    cout<<"Please enter Employee id , name and salary : ";
    cin>>a>>b>>c;
    eid=a;
    strcpy(ename,b);
    esalary=c;
}
    void Emp::display()
    {
        cout<<endl<<eid<<ename<<esalary;
    }
int main()
{
    int i;
    Emp e[5];
    for(i=0;i<5;i++)
    {   
        e[i].accept();
    }
     for(i=0;i<5;i++)
    {   
        e[i].display();
    }
    return 0;
}