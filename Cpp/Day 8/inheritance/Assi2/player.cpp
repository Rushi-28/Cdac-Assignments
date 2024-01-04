#include<iostream>
#include<cstring>
using namespace std;

class cString
{
    int len;
    char * name;
    public :
    cString();
    cString( const char *);
    cString(cString &);
    cString operator =(const char *);
    void display();
    // ~cString();
};
cString cString::operator =(const char *obj)
{
    this->len=strlen(obj);
    this->name=new char[this->len+1];
    strcpy(this->name,obj);
    return *this;
}

cString::cString()
{
    this->len=1;
    this->name=new char[this->len];
    name[0]='\0';
}
    cString::cString( const char *ch)
    {
        this->len=strlen(ch);
        this->name=new char[this->len+1];
        strcpy(this->name,ch);
    }
    cString::cString(cString &p)
    {
        this->len=p.len;
        this->name=new char[this->len+1];
        strcpy(this->name,p.name);
    }
    void cString::display()
    {
        cout<<endl<<this->name;
    }
    /* cString::~cString()
    {
        delete  []name;
    } */
    class Player
    {
        int pid;
        cString name;
        public:
        Player();
        Player(int,const char *);
        void display();
    };
    Player::Player()
    {}
     Player::Player(int id,const char *ch)
     {
        pid=id;
        name=cString(ch);
     }
     void Player::display()
     {
        cout<<endl<<"Player Id: "<<pid;
        name.display();
     }

class Batsmen:public Player
{
    int inn,notout,runs;
    public:
    Batsmen();
    Batsmen(int, const char *,int,int,int);
    void display();
    float calavg();
};
Batsmen::Batsmen()
{
    inn=0;
    notout=0;
    runs=0;
}
Batsmen::Batsmen(int id,const char *name ,int inn,int notout,int runs):Player(id,name)
{
    this->inn=inn;
    this->notout=notout;
    this->runs=runs;
}
void Batsmen::display()
{
    cout<<endl<<endl;
    Player::display();
    cout<<endl<<"Innings : "<<inn;
    cout<<endl<<"Notouts : "<<notout;
    cout<<endl<<"runs :  "<<runs;
}
float Batsmen::calavg()
{
    float avg;
    avg=(float)runs/(inn-notout);
    return avg;
}





int main()
{
    Player p1;
    p1.display();
    Player p2(18,"virat");
    p2.display();
    Batsmen b1;
    Batsmen b2(18,"virat",200,50,5000);
    b2.display();
    b1.display();
    cout<<endl<<"Avg of player b2: "<<b2.calavg();
    return 0;
}