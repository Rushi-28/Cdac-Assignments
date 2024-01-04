/*4. Create a class Point having data members as x, y (co-ordinates). 
Add static data member cnt to countnumber of objects creaeted 
Implement display function to display the co-ordinates like [10,20). 
Print number of object created. */
#include<iostream>
using namespace std;
class Point
{
    int x,y;
    static int cnt;
    public :
    Point();
    Point(int);
    Point(int, int );
    void display();
    int getcnt();
};
int Point::getcnt()
{
    return cnt;
}
Point::Point()
{
    x=y=5;
    cnt++;
}
Point::Point(int a)
{
    x=y=a;
    cnt++;
}
Point::Point(int a,int b)
{
    x=a;
    y=b;
    cnt++;
}
void Point::display()
{
    cout<<"Co-ordinates of point: ["<<x<<","<<y<<"]";
}
int Point::cnt;
int main()
{
    
    Point p2(10,20);
    p2.display();
    Point p3(11);
    p3.display();
    Point p1;
    p1.display();

    cout<<"No of objects created: "<<p3.getcnt();
}