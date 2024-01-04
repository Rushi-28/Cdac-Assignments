/*Create class BankAccount with data members as follows
1. acNo (should be increamet automatically)
2. name
3. balance
4. interestRate(static)
KNOWTI
implement appropriate constructors
implement static function setinterestRate to assign inerest value.*/
#include<iostream>
using namespace std;
class BankAcc
{
    static int acno;
    float balance;
    char name[];
    static int irate;
    public :
    BankAcc();
    void display();
    static void setinterest(int);
    static int getinterest();
};
int BankAcc::acno=1111;
int BankAcc::irate;
int main()
{
    BankAcc::setinterest(7);
    cout<<"Interest rate: "<<BankAcc::getinterest();
    BankAcc b1;
    b1.display();
    BankAcc b2;
    b2.display();

    b1.display();
    b2.display();
    return 0;
}
void BankAcc::setinterest(int i)
{
    irate=i;
}
BankAcc::BankAcc()
{
    cout<<"Enter Account Holder Name & Balance: ";
    cin>>name>>balance;
    acno++;
}
void BankAcc::display()
{
    cout<<endl<<"Account no: "<<acno;
    cout<<endl<<"Account Holders name: "<<name;
    cout<<endl<<"Account Balance: "<<balance;
    cout<<endl<<"Interest rate: "<<irate;
}
int  BankAcc::getinterest()
 {
    return irate;
 }

