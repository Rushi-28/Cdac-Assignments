// write program of Time class using constructor
#include<iostream>
using namespace std;
class Time
{
    int hr,min,sec;
    public :
    Time();
    Time(int);
    Time(int,int,int);
    Time(int,int);
    void display();

};
Time::Time()
{
    hr=min=sec=10;
}
Time::Time(int a)
{
    hr=min=sec=a;
}
Time::Time(int a, int b)
{
    hr=a;
    min=sec=b;
}
Time::Time(int a,int b, int c)
{
    hr=a;
    min=b;
    sec=c;
}
void Time::display()
{
    cout<<"Time= "<<hr<<":"<<min<<":"<<sec;
}
int main()
{
    Time t1;
      t1.display();
    Time t2(10,20);
      t2.display();
    Time t3(9,25,30);
      t3.display();

       Time t4;
       t4=t2;
       t4.display();
    
    return 0;
}