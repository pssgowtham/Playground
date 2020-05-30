#include<iostream>
using namespace std;
int main()
{
  int a,b,c;
  cin>>a>>b>>c;
  b*=75;
  c*=30;
  if(a>=b+c)
    cout<<"Boat is stable";
  else
    cout<<"Boat will drow";
}