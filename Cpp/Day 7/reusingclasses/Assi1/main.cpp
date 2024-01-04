/* Create Person class as follows
name object of cString class
date Of Birth object of Date class.
rno interger */
#include"cString.cpp"
#include"date.cpp"
class Person
{   
    cstring name;
    Date bday;
    public :
    void display();
    Person();
    Person(const char *,int,int,int);  
};
Person::Person()
{

}
Person::Person(const char *p,int d,int m,int y):name(p)
{
    this->bday=Date(d,m,y);
}
void Person::display()
{
    name.display();
    bday.display();
}

int main()
{
    Person p1;
    p1.display();
    Person p2("Atharv",9,9,2003);
    p2.display();
    return 0;
}
