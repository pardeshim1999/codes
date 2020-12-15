#include<iostream>
using namespace std;

int main()
{
	int a=20;
	int b=15;

	cout<<"A="<<a<<endl;
	cout<<"B="<<b<<endl;

	a+=b;
	cout<<"a+b="<<a<<endl;

	a-=b;
	cout<<"a-b="<<a<<endl;

	a*=b;
	cout<<"a*b="<<a<<endl;

	a/=b;
	cout<<"a/b="<<a<<endl;

	a%=b;
	cout<<"a%b="<<a<<endl;

	a<<=2;
	cout<<"a<<2="<<a<<endl;

	b<<=2;
	cout<<"b<<2="<<b<<endl;

	a>>=2;
	cout<<"a>>2="<<a<<endl;

	b>>=2;
	cout<<"b>>2="<<b<<endl;


	return 0;
}
