/*Create class String with data member int length and char pointer.Implement following
1. Default Constructor
2. Parameterized Constructor
3. Copy Constructor
4. Destructor.  */
#include<iostream>
#include<cstring>
using namespace std;
class cstring
{
    int len;
    char *s;
    public :
    cstring();
    cstring(const char *);
    void display();
    cstring(cstring &);
    ~cstring();
};
int main()
{
    cstring c1;
    cstring c2("om");
    cstring c3=c2;
    c1.display();
    c2.display();
    c3.display();
    return 0;
}
cstring::cstring()
{
    this->len=1;
    s=new char[this->len];
    s[0]='\0';
}
cstring::cstring(const char *p)
{
    this->len=strlen(p);
    s=new char[this->len+1];
    strcpy(s,p);
}
cstring::cstring(cstring &p)
{
    this->len=p.len;
    this->s=new char[this->len+1];
    strcpy(this->s,p.s);

}
void cstring::display()
{
    cout<<endl<<s;
}
cstring::~cstring()
{
    delete []s;
}