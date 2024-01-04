// write a program to find size of all built in data type

#include<iostream>
using namespace std;
int main()
{
    int i; char c; float f; double d;
    cout<<"Enter any Integer  :  ";
    cin>>i; 
    cout<<"Enter any character  :  ";
    cin>>c; 
    cout<<"Enter any float :  ";
    cin>>f;
     cout<<"Enter any Double :  ";
    cin>>d;
    cout<<"\nSize of Integer datatype is : "<<sizeof(i);
    cout<<"\nSize of Charater datatype is : "<<sizeof(c);
    cout<<"\nSize of Float datatype is : "<<sizeof(f);
    cout<<"\nSize of Double datatype is : "<<sizeof(d);
return 0;
}
