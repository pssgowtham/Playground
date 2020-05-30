#include<iostream>
#include<bits/stdc++.h>
using namespace std;
int main()
{
  int x,y,z;
  cin>>x>>y>>z;
  cout<<"Enter first number : Enter second number : Menu"<<"\n";
cout<<"1.Addition"<<"\n";
cout<<"2.Subtraction"<<"\n";
cout<<"3.Multiplication"<<"\n";
cout<<"4.Division"<<"\n";
cout<<"5.Remainder"<<"\n";
  switch(z)
  {
    case 1 : std::cout<<x+y;
    break;
    case 2 : std::cout<<x-y;
    break;
    case 3 : std::cout<<x*y;
    break;
     case 4 : std::cout<<x/y;
    break;
     case 5 : std::cout<<x%y;
    break;
      default : std::cout<<"Invalid operation";
    break;
  }
}