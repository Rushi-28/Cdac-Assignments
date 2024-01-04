/*3. Write a program to create a class player with members as
1. player Id
2. Player_name char[]
3. runs
4. wickets taken
5. innings played.
Create an array of 10 players and write functions to display information of player
write global furictions for
1. Dipslay player having maximum runs
2. Display player having maximum wkts.*/
#include<iostream>
using namespace std;
class Player
{
    int id,runs,wk,ing;
    char c[20];
    public :
    Player();
    void display();
    int getrun();
    int getwick();
};
Player::Player()
{
    cout<<"Enter Player Jersey no: ";
    cin>>id;
    cout<<"Enter Player Name: ";
    cin>>c;
    cout<<"Enter Runs scored by Player: ";
    cin>>runs;
    cout<<"Enter Wickets taken by Player: ";
    cin>>wk;
    cout<<"Enter Innings played by Player: ";
    cin>>ing;
}
void Player::display()
{
    cout<<endl<<"Enter Player Jersey no: "<<id;
    cout<<endl<<"Enter Player Name: "<<c;
    cout<<endl<<"Enter Runs scored by Player: "<<runs;
    cout<<endl<<"Enter Wickets taken by Player: "<<wk;
    cout<<endl<<"Enter Innings played by Player: "<<ing;
    cout<<endl<<endl;
}
int Player::getrun()
{
    return runs;
}
    int Player::getwick()
    {
        return wk;
    }
    Player getmaxrun(Player a[],int size)
    {   Player mx=a[0];
        int i,max=a[0].getrun();
        for(i=0;i<size;i++)
        {
            if(a[i].getrun()>max)
            {
                max=a[i].getrun();
                mx=a[i];
            }
        }
        return mx;
    }
    Player getmaxwk(Player a[],int size)
    {   Player mx=a[0];
        int i,max=a[0].getwick();
        for(i=0;i<size;i++)
        {
            if(a[i].getwick()>max)
            {
                max=a[i].getwick();
                mx=a[i];
            }
        }
        return mx;
    }
int main()
{
    int i;
    Player p[10];
    for(i=0;i<10;i++)
     p[i];
    for(i=0;i<10;i++) 
    p[i].display();
    Player q=getmaxrun(p,10);  
    cout<<endl<<endl<<"Following Player has Maximum runs: ";
    q.display();
    Player t=getmaxwk(p,10);
    cout<<endl<<endl<<"Following Player has Maximum wickets: ";
    t.display();
    return 0;
}