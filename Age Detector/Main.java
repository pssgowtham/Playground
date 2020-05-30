#include<iostream>
using namespace std;
int main()
{
  int n,m;
  cin>>n>>m;
  if(n>m)
  {
   int x=m+100;
  cout<<x-n;
}
  else
    cout<<m-n;
}