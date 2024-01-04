/*1. Create Account Class with data member(acno, name, balance) 
use Accept, Display, Deposit, Withdraw fucntion.
Create user define exception classes.
1.AmoutExeededException
2.MiminumBalanceException
1. If depostit amount is >=50000 PAN card detail required.
2. while withdraw maintain minimum balance (10000).*/
#include<iostream>
#include<string.h>
using namespace std;
class Account
{
    static double cnt;
    double acno;
    char name[20];
    float balance;
    public:
    Account();
    Account(char [],float );
    void accept();
    void display();
    void deposite(float );
    void withdraw(float );
    
};
Account::Account()
{
    cnt++;
    acno=cnt;
    strcpy(name,"NA");
    balance=0.0;
}
Account::Account(char s[],float bl)
{
    cnt++;
    acno=cnt;
    strcpy(name,s);
    balance=bl;
}
void Account::accept()
{
    cnt++;
    acno=cnt;
    cout<<"\nEnter name and balance: ";
    cin>>name>>balance;
}
void Account::display()
{
    cout<<endl<<"Account no: "<<acno;
    cout<<endl<<"Account Holder Name: "<<name;
    cout<<endl<<"Account Holder balance: "<<balance;
}
void Account::deposite(float am)
{
    if(am>=50000.0)
    throw 100;
    this->balance=this->balance+am;
    this->display();
}
void Account::withdraw(float am)
{
    
    this->balance=this->balance-am;
    if(this->balance<5000.0)
    {balance=balance+am;
    throw 25.26f;
    }
    this->display();
}
double Account::cnt=11000;
int main()
{
    Account a1;
    char s[]="Ram";
    Account a2(s,5000.36);
    a1.display();
    a2.display();
    Account b1,b2;
    b1.accept();
    b2.accept();
    b1.display();
    b2.display();
    try{a2.deposite(6000.20);}
    catch(int a)
    {
        cout<<endl<<"Pan card required. ";
    }
    try{a2.withdraw(4000.25);}
    catch(float p)
    {
        cout<<endl<<"Minimum Balance required is 5000.";
    }
    a2.display();
    return 0;
}