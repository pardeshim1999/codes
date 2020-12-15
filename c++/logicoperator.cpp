//Manish Vijay Pardeshi
//LOgical Operators program
//c++

#include<iostream>
using namespace std;

int main()
{
	int a=10;
	int b=20;
	int c=30;
	int d=40;

	cout<<"A="<<a<<endl;
	cout<<"B="<<b<<endl;
	cout<<"C="<<c<<endl;
	cout<<"D="<<d<<endl;

	if((a==b) && (c==d))
	{
		cout<<"(a==b) && (c==d) is true"<<endl;
	}
	else
	{
		cout<<"(a==b) && (c==d) is false"<<endl;
	}
	 if((a!=b) && (c==d))
        {
                cout<<"(a!=b) && (c==d) is true"<<endl;
        }
        else
        {
                cout<<"(a!=b) && (c==d) is false"<<endl;
        }
	 if((a==b) && (c!=d))
        {
                cout<<"(a==b) && (c!=d) is true"<<endl;
        }
        else
        {
                cout<<"(a==b) && (c!=d) is false"<<endl;
        }
	 if((a!=b) && (c!=d))
        {
                cout<<"(a!=b) && (c!=d) is true"<<endl;
        }
        else
        {
                cout<<"(a!=b) && (c!=d) is false"<<endl;
        }

	if((a==b) || (c==d))
        {
                cout<<"(a==b) || (c==d) is true"<<endl;
        }
        else
        {
                cout<<"(a==b) || (c==d) is false"<<endl;
        }
         if((a!=b) || (c==d))
        {
                cout<<"(a!=b) || (c==d) is true"<<endl;
        }
        else
        {
                cout<<"(a!=b) ||  (c==d) is false"<<endl;
        }
         if((a==b) || (c!=d))
        {
                cout<<"(a==b) || (c!=d) is true"<<endl;
        }
        else
        {
                cout<<"(a==b) || (c!=d) is false"<<endl;
        }
         if((a!=b) || (c!=d))
        {
                cout<<"(a!=b) || (c!=d) is true"<<endl;
        }
        else
        {
                cout<<"(a!=b) || (c!=d) is false"<<endl;
        }

	if(!((a==b) && (c==d)))
        {
                cout<<"!((a==b) && (c==d)) is true"<<endl;
        }
        else
        {
                cout<<"!((a==b) && (c==d)) is false"<<endl;
        }
         if(!((a!=b) && (c==d)))
        {
                cout<<"!((a!=b) && (c==d)) is true"<<endl;
        }
        else
        {
                cout<<"!((a!=b) && (c==d)) is false"<<endl;
        }
         if(!((a==b) && (c!=d)))
        {
                cout<<"!((a==b) && (c!=d)) is true"<<endl;
        }
        else
        {
                cout<<"!((a==b) && (c!=d)) is false"<<endl;
        }
         if(!((a!=b) && (c!=d)))
        {
                cout<<"!((a!=b) && (c!=d)) is true"<<endl;
        }
        else
        {
                cout<<"!((a!=b) && (c!=d)) is false"<<endl;
        }
	if(!((a==b) || (c==d)))
        {
                cout<<"!((a==b) || (c==d)) is true"<<endl;
        }
        else
        {
                cout<<"!((a==b) || (c==d)) is false"<<endl;
        }
         if(!((a!=b) || (c==d)))
        {
                cout<<"!((a!=b) || (c==d)) is true"<<endl;
        }
        else
        {
                cout<<"!((a!=b) || (c==d)) is false"<<endl;
        }
         if(!((a==b) || (c!=d)))
        {
                cout<<"!((a==b) || (c!=d)) is true"<<endl;
        }
        else
        {
                cout<<"!((a==b) || (c!=d)) is false"<<endl;
        }
         if(!((a!=b) || (c!=d)))
        {
                cout<<"!((a!=b) || (c!=d)) is true"<<endl;
        }
        else
        {
                cout<<"!((a!=b) || (c!=d)) is false"<<endl;
        }

return 0;
}
