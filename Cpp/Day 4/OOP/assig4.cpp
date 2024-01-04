// Create a class called box add data member height, width, and depth 
// Also write member functions  to calculates volume of Box
#include<iostream>
using namespace std;
class Box
{
    int hei,wid,dep;
    public :
    void accept(int,int,int);
    void display();
    void volume();
};
    void Box::accept(int a,int b,int c)
    {
        hei=a;
        wid=b;
        dep=c;
    }
    void Box::display()
    {
        cout<<"\nHeight of the Box: "<<hei<<"\nWidth of the Box: "<<wid<<"\nDepth of the Box: "<<dep;
    }
    void Box::volume()
    {
        cout<<"\nVolume of the Box: "<<hei*wid*dep;
    }
int main()
{
    Box b;
     int i,p,q,r;
     cout<<"Enter Height , Width and Depth: ";
     cin>>p>>q>>r;
    b.accept(p,q,r);
    b.display();
    b.volume();
}