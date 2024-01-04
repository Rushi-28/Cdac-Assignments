/*2. Use already created Box class and Implement following.
Overload <,> operators.
Operator ==   */
#include<iostream>
using namespace std;
class Box
{
    int hei,wid,dep,vol;
    public :
    Box(int=1,int=1,int=1);
    void display();
    int volume();
    int operator <(Box );
    int operator>(Box );
    int operator==(Box );
};
    Box::Box(int a,int b,int c)
    {
        hei=a;
        wid=b;
        dep=c;
    }
    void Box::display()
    {
        cout<<"\nHeight of the Box: "<<hei<<"\nWidth of the Box: "<<wid<<"\nDepth of the Box: "<<dep;
    }
    int Box::volume()
    {
        return hei*wid*dep;
    }
    int Box::operator<(Box b)
    {
        int i=0;
        if(this->volume()<b.volume())
        i=1;

        return i;

    }
    int Box::operator>(Box b)
    {
        int i=0;
        if(this->volume()>b.volume())
        i=1;

        return i;
    }
    int Box::operator==(Box b)
    {
        int i=0;
        if(this->volume()==b.volume())
        i=1;

        return i;
    }
int main()
{
    Box b1(10,2,5);
    Box b2(5,5,2);
    Box b3;
    Box b4(5,5,4);
     
    b1.display();
    cout<<endl<<"Volume :"<<b1.volume();
    b2.display();
    cout<<endl<<"Volume :"<<b2.volume();
    b3.display();
    cout<<endl<<"Volume :"<<b3.volume();
    b4.display();
    cout<<endl<<"Volume :"<<b4.volume();
    if(b1>b2)
    cout<<endl<<"Box b1 have more volume";
    else 
    cout<<endl<<"Box b2 have more volume";
    if(b4<b2)
    cout<<endl<<"Box b2 have more volume";
    else 
    cout<<endl<<"Box b4 have more volume";
    if(b1==b4)
    cout<<endl<<"Both Box have same volume";
    else cout<<endl<<"Both Box not have same volume";
    if(b2==b4)
    cout<<endl<<"Both Box have same volume";
    else cout<<endl<<"Both Box not have same volume";
return 0;
}