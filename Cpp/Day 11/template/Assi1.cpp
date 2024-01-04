// Swapping 2 no using template
#include<iostream>
using namespace std;
template<class T>
void Swap(T&a, T&b)
{
    T temp;
    temp=a;
    a=b;
    b=temp;
}
int main()
{
    int no1,no2;
    char ch1,ch2;
    cout<<endl<<"enter 2 values: ";
    cin>>no1>>no2;
    cout<<"Entered values: "<<no1<<" & "<<no2;
    Swap(no1,no2);
    cout<<endl<<"Swapped values: "<<no1<<" & "<<no2;
    cout<<endl<<"enter 2 values: ";
    cin>>ch1>>ch2;
    cout<<"Entered values: "<<ch1<<" & "<<ch2;
    Swap(ch1,ch2);
    cout<<endl<<"Swapped values: "<<ch1<<" & "<<ch2;
    
    return 0;
}