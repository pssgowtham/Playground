#include <iostream>
using namespace std;
int main() 
{
	int n,m,i=0;
  cin>>n;
  while(i<n){
    int sum=0;
    m=n%10;
    sum=sum+m;
    n=n/10;
    cout<<sum;
  }
   
}