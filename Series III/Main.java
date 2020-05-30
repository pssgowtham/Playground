#include<iostream>
using namespace std;
int main()
{ 
  int n,k=5;
  cin>>n;
  int m=6;
  for(int i=0;i<n;i++)
  {
   cout<<m<<" ";
    m=m+k;
    k+=5;
  }
}
  