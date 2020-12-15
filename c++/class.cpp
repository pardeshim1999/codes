#include<iostream>
using namespace std;

class box
	{
		public:
		int height;
		int length;
		int breadth;
		int volume;
	};

int main()
	{
		box box1;
		box box2;
		int volume=0;

		box1.height=7;
		box1.length=8;
		box1.breadth=9;

		box2.height=10;
		box2.length=11;
		box2.breadth=12;

		volume=box1.height*box1.length*box1.breadth;
		cout<<"Box1:"<<volume<<endl;

		volume=box2.height*box2.length*box2.breadth;
                cout<<"Box2:"<<volume<<endl;

		return 0;
	}
