#include"date.h"

    Date::Date()
    {
        d=m=1;
        y=2000;
    }
    Date::Date(int d,int m,int y)
    {
        this->d=d;
        this->m=m;
        this->y=y;
    }
    void Date::display()
    {
        cout<<endl<<"Date: "<<d<<"/"<<m<<"/"<<y;
    }