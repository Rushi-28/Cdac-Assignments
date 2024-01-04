#include"cString.h"
#include"date.h"
class Person
{
    cString nm;
    Date bday;
    public :
    Person();
    Person(const char*,int,int,int);
    void display();
};