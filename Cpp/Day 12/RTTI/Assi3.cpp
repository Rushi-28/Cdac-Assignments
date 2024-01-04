/*Write program to demostrate use of Static cast.*/
#include<iostream>
using namespace std;
int main()
{
    int a=11;
    float b;
    b=static_cast<float>(a)/2;
    cout<<b;

    return 0;
}