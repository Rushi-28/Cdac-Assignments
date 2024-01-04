#include"cString.h"
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