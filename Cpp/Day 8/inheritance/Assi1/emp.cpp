#include"emp.h"
    Emp::Emp()
    {
        eid=10;
        sal=10;
    }
    Emp::Emp(int id, const char *ch,int d,int m,int y,float sal):Person(ch,d,m,y)
    {
        this->eid=id;
        this->sal=sal;
    }
    void Emp::display()
    {
        cout<<endl<<"Employee id: "<<eid;
        Person::display();
        cout<<endl<<"Employee Salary: "<<sal;
    }