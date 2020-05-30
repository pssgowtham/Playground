#include<iostream>
using namespace std;
int main()
{
  int x,y;
  cin>>x;
  int a=x*0.5;
  int b=(x*0.65)+100;
  int c=(x*0.80)+200;
  int d=(x*1.25)+425;
  if(x<=200)
    cout<<"Rs."<<a;
  if(x<=400 && x>200)
     cout<<"Rs."<<b;
  if(x>400 && x<=600)
      cout<<"Rs."<<c;
  if(x>600)
      cout<<"Rs."<<d;
}