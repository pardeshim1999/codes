
#include<iostream>
using namespace std;

int main()
{
	int a=60;
	int b=13;

	(a&b);
	cout<<"a&b="<<(a&b)<<endl;

	(a|b);
	cout<<"a|b="<<(a|b)<<endl;

	(a^b);
	cout<<"a^b="<<(a^b)<<endl;

	(~a);
	cout<<"~a="<<(~a)<<endl;

	(~b);
	cout<<"~b="<<(~b)<<endl;

	(a<<2);
	cout<<"a<<2="<<(a<<2)<<endl;

	(b<<2);
	cout<<"b<<2="<<(b<<2)<<endl;

	(a>>2);
	cout<<"a>>2="<<(a>>2)<<endl;

	(b>>2);
	cout<<"b>>2="<<(b>>2)<<endl;

	return 0;
}
