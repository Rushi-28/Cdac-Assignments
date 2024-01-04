// create Date class accept daate display it              
#include<iostream>
using namespace std;
class Date
{
    int day,month,year;
    public:
    void accept(int,int,int);
    void display();

};
int main()
{
    Date d;
    int dd,mm,yy;
    cout<<"Please enter date in DD/MM/YYYY format: ";
    cin>>dd>>mm>>yy;
    d.accept(dd,mm,yy);
    d.display();

    return 0;
}
void Date::accept(int a,int b,int c)
{
    day=a;
    month=b;
    year=c;
}
    void Date::display()
    {
        cout<<"Date: "<<day<<"/"<<month<<"/"<<year;
    }
