#include<iostream>
using namespace std;
int main()
{
int n,m,s,t=0;
  cin>>n;
  cin>>m;
  s=n+m;
  for(int i=1;i<s;i++)
  {
    if(s%i==0)
      t=t+i;
  }
  if(t==s)
    cout<<"They can read the message";
  else
    cout<<"They can't read the message";
}