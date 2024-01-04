/*1.Create Complex class with data member real and imagenary And Operload fllowing operators.
Overload +,-, operators.
Overload ++ (pre and Post increment)*/
#include<iostream>
using namespace std;
class Complex
{
    int re,img;
    public :
    Complex();
    Complex(int );
    Complex(int ,int );
    Complex operator ++(int);
    Complex operator ++();
    Complex operator +(Complex);
    Complex operator -(Complex);
    void display();
};
    Complex::Complex()
    {
        re=img=1;
    }
    Complex::Complex(int a)
    {
        re=img=a;
    }
    Complex::Complex(int re,int img)
    {
        this->re=re;
        this->img=img;
    }
    Complex Complex::operator ++(int a)
    {
        Complex temp;
        temp.re=this->re++;
        temp.img=this->img++;
        return temp;

    }
    Complex Complex::operator ++(){
        Complex temp;
        temp.re=++this->re;
        temp.img=++this->img;
        return temp;
    }
    Complex Complex::operator +(Complex a)
    {
        Complex temp;
        temp.re=this->re+a.re;
        temp.img=this->img+a.img;
        return temp;
    }
    Complex Complex::operator -(Complex b)
    {
        Complex temp;
        temp.re=this->re-b.re;
        temp.img=this->img-b.img;
        return temp;
    }
    void Complex::display()
    {
        cout<<endl<<"Complex NO: ["<<re<<","<<img<<"i]";
    }
    int main()
    {
        Complex c1;
        c1.display();
        Complex c2(50,60),c3(11,20);
        c2.display();
        c3.display();
        Complex c4;
        c4=c2+c3;
        Complex c5=c2;
        Complex c6=c2++;
        Complex c7;
        c7=c2++;
        Complex c8=++c5;
        
        
        c4.display();
        c5.display();
        c6.display();
        c7.display();
        c8.display();
        c2.display();
        c3.display();
        return 0;
    }