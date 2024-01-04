#include"cString.h"
cString::cString()
{
    this->len=1;
    this->name=new char[this->len];
    name[0]='\0';
}
    cString::cString( const char *ch)
    {
        this->len=strlen(ch);
        this->name=new char[this->len];
        strcpy(this->name,ch);
    }
    cString::cString(cString &p)
    {
        this->len=p.len;
        this->name=new char[this->len];
        strcpy(this->name,p.name);
    }
    void cString::display()
    {
        cout<<endl<<name;
    }
    cString::~cString()
    {
        delete []name;
    }