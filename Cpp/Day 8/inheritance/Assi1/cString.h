#include<iostream>
using namespace std;
#include<string.h>
class cString
{
    int len;
    char * name;
    public :
    cString();
    cString( const char *);
    cString(cString &);
    void display();
    ~cString();
};