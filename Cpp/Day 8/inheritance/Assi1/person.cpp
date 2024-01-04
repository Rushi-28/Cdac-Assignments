#include"person.h"
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