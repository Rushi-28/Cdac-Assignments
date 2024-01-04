// write program of Date class using constructor
#include<iostream>
using namespace std;
class Date
{
    int day,month,year;
    public :
    Date();
    Date(int,int);
    Date(int);
    Date(int,int,int);
    void display();

};
Date::Date()
{
    day=month=1;
    year=2023;
}
Date::Date(int a)
{
    day=month=a;
    year=2023;
}
Date::Date(int a, int b, int c)
{
    day=a;
    month=b;
    year=c;
}
Date::Date(int a,int b)
{
    day=month=a;
    year=b;
}
void Date::display()
{
    cout<<"\nDate: "<<day<<"/"<<month<<"/"<<year;
}
int main()
{
    int dd,mm,yy;
    Date d1;
    d1.display();

    Date d2(5,2023);
    d2.display();

    Date d3(25,03,2023);
    d3.display();

    return 0;
}
