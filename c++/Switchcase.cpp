#include<iostream>
using namespace std;

	int main()
		{
			int a=30;
			int b=20;
			int c=0;
			int ch;
			ch=3;

			cout<<"A="<<a<<endl;
			cout<<"B="<<b<<endl;

			cout<<"1=addition"<<endl;
			cout<<"2=subtraction"<<endl;
			cout<<"3=multiplication"<<endl;
			cout<<"4=division"<<endl;

			switch(ch)
				{
					case 1:
						c=a+b;
						cout<<"<<<addition>>>"<<c<<endl;
						break;
					case 2:
						c=a-b;
						cout<<"<<<subtraction>>>"<<c<<endl;
						break;
					case 3:
						c=a*b;
						cout<<"<<<multiplication>>>"<<c<<endl;
						break;
					case 4:
						c=a/b;
						cout<<"<<<division>>>"<<c<<endl;
						break;
					default:
						cout<<"thank you";
				}
		}
