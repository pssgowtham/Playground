#include<iostream>
int main()
{
  int n,f=1;
  std::cin>>n;
  for(int i=1;i<=n;i++)
  {
   f=f*i;
  }
  std::cout<<"The factorial of "<<n<<" is "<<f;
}