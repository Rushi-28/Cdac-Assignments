// write a program to multiply with 3 Arguments and paas argument 1 2 3
#include<iostream>
using namespace std;
int multi(int=1,int=1,int=1);
int main()
{
    int p,q,r;
    p=multi(1);
    q=multi(10,25);
    r=multi(25,3,2);
    cout<<"\n"<<p;
    cout<<"\n"<<q;
    cout<<"\n"<<r;
    return 0;
}
int multi(int a,int b,int c)
{
    return a*b*c;
}