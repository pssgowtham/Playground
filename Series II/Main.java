#include<iostream>
using namespace std;
int main()
{
 int n;
  cin>>n;
  int m=11;
  for(int i=0;i<n;i++)
  {
     int k=m*m;
     cout<<k<<" ";
     m=m+4;
  }
}