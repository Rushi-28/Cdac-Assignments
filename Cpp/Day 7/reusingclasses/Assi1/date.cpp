#include"date.h"

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