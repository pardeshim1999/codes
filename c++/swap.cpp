#include<iostream>
using namespace std;

int main()
	{
		int a=20;
		int b=30;

		cout<<"before swap A="<<a<<endl;
		cout<<"before swap B="<<b<<endl;

		swap(a,b);

		cout<<"after swap A="<<a<<endl;
		cout<<"after swap B="<<b<<endl;
	}

int swap(int x, int y)
	{
		int temp;
		temp=x;
		x=y;
		y=temp;

		return temp;
	}
