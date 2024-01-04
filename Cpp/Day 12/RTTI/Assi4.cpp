/*Write program to demostrate use of const cast.*/
#include<iostream>
using namespace std;
int main()
{
    int a=10;
    int const * p=&a;
    cout<<a<<endl;
    int *ptr;
    // ptr=p;
    ptr=const_cast<int *>(p);
    *ptr=30;
    cout<<a;
    return 0;
}