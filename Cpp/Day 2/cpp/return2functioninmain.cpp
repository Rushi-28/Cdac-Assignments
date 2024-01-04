#include<iostream>
using namespace std;
int calculate(int,int,int,int&);
int main()
{
    int num1,num2,add,res=0;
    cout<<"Enter any two numbers : ";
    cin>>num1>>num2;
    add=calculate(num1,num2,add,res);
    cout<<"Addition of "<<num1<<" & "<<num2<<" is "<<add;
    cout<<"Multiplication of "<<num1<<" & "<<num2<<" is "<<res;
    return 0;
}
int calculate(int a,int b,int x,int &y)
{
    x=a+b;
    y=a*b;
    return x;
}