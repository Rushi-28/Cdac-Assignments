// create Date class accept daate display it and check wheather it is valid or not
#include<iostream>
using namespace std;
class Date
{
    int day,month,year;
    public :
    void accept(int,int,int);
    void display();
    void checkValid(int,int,int);
    int getday();
    int getmonth();
    int getyear();
};
int main()
{   
    Date d;
    int i,dd,mm,yy,p,q,r;
    cout<<"Please Enter any date in DD/MM/YYYY format: ";
    cin>>dd>>mm>>yy;
    d.accept(dd,mm,yy);
    d.display();
    p=d.getday();
    q=d.getmonth();
    r=d.getyear();
    d.checkValid(p,q,r);
    return 0;
}
void Date::accept(int a, int b, int c)
{
    day=a;
    month=b;
    year=c;
}
void Date::display()
{
cout<<"Date: "<<day<<"/"<<month<<"/"<<year;
cout<<endl;
}
void Date::checkValid(int d,int m,int y)
{
   if((y%4)==0 )
    {
        if(m==2)
        {
            if((d>=1 && d<=29) )
            cout<<"valid input";
            else cout<<"invalid date";
        }
        else if(m==1 || m==3 || m==5 || m==7 || m==8 || m==10 || m==12)
        {
            if((d>=1 && d<=31) )
            cout<<"valid Date.";
            else cout<<"Invalid date";
        }
        else if(m<0 || m>12)
        cout<<"invalid Month";

        else if((d>=1 && d<=30))
        cout<<"Valid Date.";
        else cout<<"invalid";
    }
    else{  if(m==2)
        {
            if((d>=1 && d<=28) )
            cout<<"valid input";
            else cout<<"invalid date";
        }
        else if(m==1 || m==3 || m==5 || m==7 || m==8 || m==10 || m==12)
        {
            if((d>=1 && d<=31) )
            cout<<"valid Date.";
            else cout<<"Invalid date";
        }
        else if(m<0 || m>12)
        cout<<"invalid Month";

        else if((d>=1 && d<=30))
        cout<<"Valid Date.";
        else cout<<"invalid";
        }
}
    int Date::getday(){return day;}
    int Date::getmonth(){return month;}
    int Date::getyear(){return year;}