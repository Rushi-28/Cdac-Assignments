#include<iostream>
using namespace std;
#include<string.h>
class cString
{
    int len;
    char *name;
    public :
    cString();
    cString( const char *);
    cString(cString &);
    cString operator =(const char *);
    void display();
    // ~cString();
};
cString cString::operator =(const char *obj)
{
    this->len=strlen(obj);
    this->name=new char[this->len+1];
    strcpy(this->name,obj);
    return *this;
}

cString::cString()
{
    this->len=1;
    this->name=new char[this->len];
    name[0]='\0';
}
    cString::cString( const char *ch)
    {
        this->len=strlen(ch);
        this->name=new char[this->len+1];
        strcpy(this->name,ch);
    }
    cString::cString(cString &p)
    {
        this->len=p.len;
        this->name=new char[this->len+1];
        strcpy(this->name,p.name);
    }
    void cString::display()
    {
        cout<<endl<<name;
    }
   /* cString::~cString()
    {
        delete [] name;
    }*/

class Date
{
    int d,m,y;
    public :
    Date();
    Date(int ,int ,int);
    void display();
};

    Date::Date()
    {
        d=m=1;
        y=2000;
    }
    Date::Date(int d,int m,int y)
    {
        this->d=d;
        this->m=m;
        this->y=y;
    }
    void Date::display()
    {
        cout<<endl<<"Date: "<<d<<"/"<<m<<"/"<<y;
    }

class Person
{
    cString nm;
    Date bday;
    public :
    Person();
    Person(const char*,int,int,int);
    void display();
};

Person::Person()
{

}
    Person::Person(const char *ch,int d,int m,int y)
    {
        this->nm=cString(ch);
        bday=Date(d,m,y);
    }
    void Person::display()
    {
        nm.display();
        bday.display();
    }


class Emp:public Person

{
    int eid;
    float sal;
    public :
    Emp();
    Emp(int , const char *,int ,int,int,float);
    void display();
};

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

int main()
{
    Emp e1;
    e1.display();
    Emp e2(101,"Rushi",28,7,2000,50000);
    e2.display();
    Emp e3(102,"om",14,9,2003,70000);
    e3.display();
    return 0;
}