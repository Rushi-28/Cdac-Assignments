/*2. Create class Employee with data type name.
   Derive classes Programmer,DataBaseAdministrator,SystemAdministrator.
   a. all classes has display and test functions.
   a. programmer class has function Codding();
   b. DataBaseAdministrator class has function CreateDataBase();
   c. SystemAdministrator class has function SystemUpdate();
   d. Create Array of Employee Pointer with size 5.
   e. Check name of all classes  at runtime.
   g. Excute class specific function from respective classes.
  * Pass this array to global function Check().*/

#include<iostream>
#include<typeinfo>
using namespace std;
class Emp
{
    public:
    virtual void display()
    {
        cout<<endl<<"employee class display";
    }
    virtual void test()
    {
        cout<<endl<<"Employee class test";
    }

};
class Programmer:public Emp
{
    public:
    void display()
    {
        cout<<endl<<"Programmer class display";
    }
    void test()
    {
        cout<<endl<<"Programmer class test";
    }
    void codding()
    {
        cout<<endl<<"Programmer class codding";
    }

};
class DataBaseAdministrator:public Emp
{
    public:
    void display()
    {
        cout<<endl<<"DataBaseAdministrator class display";
    }
    void test()
    {
        cout<<endl<<"DataBaseAdministrator class test";
    }
    void CreateDataBase()
    {
        cout<<endl<<"DataBaseAdministrator class CreateDataBase ";
    }
};
class SystemAdministrator:public Emp
{
    public:
    void display()
    {
        cout<<endl<<"SystemAdministrator class display";
    }
    void test()
    {
        cout<<endl<<"SystemAdministrator class test";
    }
    void SystemUpdate()
    {
        cout<<endl<<"SystemAdministrator class SystemUpdate";
    }

};
int main()
{
    Emp *em[5];
    em[0]=new Emp;
    em[1]=new Programmer;
    em[2]=new DataBaseAdministrator;
    em[3]=new SystemAdministrator;
    em[4]=new Programmer;

    for(int i=0;i<5;i++)
    {
        em[i]->display();
        em[i]->test();
        Programmer *pr=dynamic_cast<Programmer *>(em[i]);
        pr[i].codding();
        DataBaseAdministrator *da=dynamic_cast<DataBaseAdministrator *>(em[i]);
        da[i].CreateDataBase();
        SystemAdministrator *sa=dynamic_cast <SystemAdministrator *>(em[i]);
        sa[i].SystemUpdate();
        cout<<endl;
    }
    return 0;
}