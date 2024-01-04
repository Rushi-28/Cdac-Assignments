// Create a class Point having data members as x, y (co-ordinates).
// and member function to accpet values and display the co- ordinates like[10,20].

#include<iostream>
using namespace std;
class Point
{
    int x,y;
    public :
    void accept(int,int);
    void display();
    void volume();
};
    void Point::accept(int a,int b)
    {
        x=a;
        y=b;
    }
    void Point::display()
    {
        cout<<"\nCo-ordinates of the Point: ["<<x<<","<<y<<"]";
    }
   
int main()
{
    Point b;
     int i,p,q,r;
     cout<<"Enter X and Y Co-ordinates of point: ";
     cin>>p>>q;
    b.accept(p,q);
    b.display();
    
}