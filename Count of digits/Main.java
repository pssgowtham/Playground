#include<iostream>
using namespace std;
int main()
{
  int n,m=1,c=0;
  cin>>n;
  do
  {
    c++;
      n=n/10;
  }
    while(n>0);
 
  cout<<c;
}