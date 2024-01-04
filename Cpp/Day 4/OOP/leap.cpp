 #include<iostream>
 using namespace std;
 int main()
 {
    int d,m,y;
    d=30;
    m=11;
    y=2001;
 if((y%4)==0 )
    {
        if(m==2)
        {
            if((d>=1 && d<=29) )
            cout<<"valid input";
            else cout<<"invalid date";
        }
        else if(m==1 || m==3 || m==5 || m==7 || m==8 || m==10 || m==12)
        {
            if((d>=1 && d<=31) )
            cout<<"valid Date.";
            else cout<<"Invalid date";
        }
        else if(m<0 || m>12)
        cout<<"invalid Month";

        else if((d>=1 && d<=30))
        cout<<"Valid Date.";
        else cout<<"invalid";
    }
    else{  if(m==2)
        {
            if((d>=1 && d<=28) )
            cout<<"valid input";
            else cout<<"invalid date";
        }
        else if(m==1 || m==3 || m==5 || m==7 || m==8 || m==10 || m==12)
        {
            if((d>=1 && d<=31) )
            cout<<"valid Date.";
            else cout<<"Invalid date";
        }
        else if(m<0 || m>12)
        cout<<"invalid Month";

        else if((d>=1 && d<=30))
        cout<<"Valid Date.";
        else cout<<"invalid";
        return 0;}
 }
 