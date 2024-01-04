#include<iostream>
#include<string.h>
using namespace std;
class cString
{
    int len;
    char *str;
    public: 
    cString();
    cString(const char *);
    cString(cString &);
    cString operator=(const char *);
    void display();
};
    cString::cString()
    {
        len=1;
        str=new char[len+1];
        str[1]='\0';
    }
    cString::cString(const char *ch)
    {
        this->len=strlen(ch);
        str=new char[this->len+1];
        strcpy(str,ch);
    }
    cString::cString(cString &obj)
    {
        this->len=obj.len;
        this->str=new char[this->len+1];
        strcpy(this->str,obj.str);
    }
    cString cString::operator=(const char *ch)
    {
        this->len=strlen(ch);
        str=new char[this->len+1];
        strcpy(str,ch);
        return *this;
    }
    void cString::display()
    {
        cout<<endl<<str;
    }




class Customer
{
private:
cString email;
cString address;
public:
    Customer();
    Customer(const char *,const char *);
    void display();
};
    Customer::Customer()
    {
        email="\0";
        address="\0";
    }
    Customer::Customer(const char *ch,const char *addr)
    {
        email=cString(ch);
        address=cString(addr);
    }
    void Customer::display()
    {
        email.display();
        address.display();
    }

class Regcust:public Customer
{
    int regno;
    public:
    Regcust();
    Regcust(const char *,const char *,int);
    void display();
    void givediscount(int );
};
Regcust::Regcust()
{

}
Regcust::Regcust(const char *a,const char *b,int no):Customer(a,b)
{
    regno=no;
}
void Regcust::display()
{
    cout<<endl<<endl;
    cout<<"Registration no: "<<regno;
    Customer::display();
}
void Regcust::givediscount(int a)
{
    float z=a-((float)a*5/100);
    cout<<endl<<"shopping price: "<<a<<endl<<"Discounted price: "<<z;
}

int main()
{
    Regcust r1;
    Regcust r2("nikr1@gmail.com","katraj",100);
    r1.display();
    r2.display();
    r2.givediscount(5000);
return 0;
}