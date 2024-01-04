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