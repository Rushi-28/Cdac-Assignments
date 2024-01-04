// write a calculator class to accept 2 numbers ,acccpet and display them,write funt +,-,*,/.
#include<iostream>
using namespace std;
class Calculator
{
    int num1,num2;
    public :
        void accept(int,int);
        void display();
        void add();
        void sub();
        void mult();
        void div();
};
int main()
{
    int i,j,ch;
    Calculator c;
        cout<<"Please enter any two number ";
        cin>>i>>j;
        c.accept(i,j);
        c.display();
        do
        {
            cout<<"\n1.Addition: \n2.Substraction: \n3.Multition: \n4.Division: \n0.Exit: \nPlease Enter Your choise: ";
            cin>>ch;
            switch(ch)
            {
                case 1: c.add();break;
                case 2: c.sub();break;
                case 3: c.mult();break;
                case 4: c.div();break;
                default: cout<<"\nInvalid input.";
                break;

            }

        }while(ch!=0);
        

}
         void Calculator::accept(int a,int b)
        {
            num1=a;
            num2=b;
        }
        void Calculator::display()
        {
            cout<<num1<<"\t"<<num2;
        }
        void Calculator::add()
        {
            cout<<endl<<"["<<num1<<"+"<<num2<<"="<<num1+num2<<"]";
        }
        void Calculator::sub()
        {
            cout<<endl<<"["<<num1<<"-"<<num2<<"="<<num1-num2<<"]";
        }
        void Calculator::mult()
        {
            cout<<endl<<"["<<num1<<"*"<<num2<<"="<<num1*num2<<"]";
        }
        void Calculator::div()
        {
            cout<<endl<<"["<<num1<<"/"<<num2<<"="<<num1/num2<<"]";
        }