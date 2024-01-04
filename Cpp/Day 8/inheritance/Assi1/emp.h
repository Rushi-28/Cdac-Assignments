#include"person.h"
class Emp:public Person

{
    int eid;
    float sal;
    public :
    Emp();
    Emp(int , const char *,int ,int,int,float);
    void display();
};