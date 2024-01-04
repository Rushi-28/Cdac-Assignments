// overload add function
#include<iostream>
using namespace std;
void add(int,int);
void add(int,int,int);
void add(float,float);
void add(int,float);
void add(float,int);
int main()
{
    add(2,3);
    add(2,3,4);
    add(2.2f,3.3f);
    add(2,3.55f);
    add(3.55f,2);
    return 0;
}
void add(int a,int b)
{cout<<"Addition is: "<<a+b;}
void add(int a,int b,int c)
{cout<<"Addition is: "<<a+b+c;}
void add(float a,float b)
{cout<<"Addition is: "<<a+b;}
void add(int a,float b)
{cout<<"Addition is: "<<a+b;}
void add(float a,int b)
{cout<<"Addition is: "<<a+b;}