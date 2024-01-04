// Accept 2 numbers feom user and print their addition, substraction, multiplication, division.

#include<iostream>
using namespace std;
int main()
{
    int num1,num2;
    cout<<"Enter any two numbers : ";
    cin>>num1>>num2;
    cout<<"\nAddition of "<<num1<<" & "<<num2<<" is "<<num1+num2;
        cout<<"\nSubstraction of "<<num1<<" & "<<num2<<" is "<<num1-num2;
            cout<<"\nMultiplication of "<<num1<<" & "<<num2<<" is "<<num1*num2;
                cout<<"\nDivision of "<<num1<<" & "<<num2<<" is "<<num1/num2;
                return 0;
}