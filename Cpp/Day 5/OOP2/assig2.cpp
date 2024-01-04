/*Create class Complex with data member real and imag;
implement default constructor and paramerised constructor.
Declare Display.getReal and getimg() functions as constant. 
Create constant object and check with constant and not constant function.*/
#include<iostream>
using namespace std;
class Complex
{   
    int re,ig;
    public :
    Complex();
    Complex(int);
    Complex(int ,int );
    void display() const;
    int getreal() const;
    int getimg() const;
};
Complex::Complex()
{
    re=ig=1;
}
    Complex::Complex(int a)
    {
        re=ig=a;
    }
    Complex::Complex(int a,int b)
    {
        re=a;
        ig=b;
    }
    void Complex::display() const
    {   if(ig>0)
        cout<<endl<<"Complex no: ["<<re<<"+"<<ig<<"i]";
        else
        cout<<endl<<"Complex no: ["<<re<<ig<<"i]";
    }
    int Complex::getreal() const
    {
        return re;
    }
    int Complex::getimg() const
    {
        return ig;
    }
int main()
{
    int res;
    Complex c1;
    c1.display();
    Complex c2(9,5);
    c2.display();
     const Complex c3(3,-8);
    c3.display();

    res=c2.getreal();
    cout<<endl<<"Real no: "<<res;

    res=c2.getimg();
    cout<<endl<<"Imaginary no: "<<res;

     res=c3.getreal();
    cout<<endl<<"Real no: "<<res;

    res=c3.getimg();
    cout<<endl<<"Imaginary no: "<<res;
    return 0;
}