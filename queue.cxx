#include<iostream>
#define n 5
using namespace std;
class queue{
	int *arr;
	int front;
	int back;
	public:
	queue(){
		arr = new int[n];
		front = -1 ;
		back = -1;
    }
   
   void Enqueue(int val){
   	if(back == n -1){
   		cout<<"Overflow"<<endl;
   		return;
   	}
   	back ++;
   	arr[back] = val;
   	if(front == -1){
   		front ++;
   	}
   }
   
   void Dequeue(){
   	if(front == -1 || front>back ){
   		cout<<"Underflow"<<endl;
   		return;
   	}
   	front ++;
   }
   
   int peek(){
   	if(front < 0 || front > n-1){
   	  cout<<"none is present!"<<endl;
   		return -1;
   	}
   	return arr[front];
   }
   
   bool empty(){
   	if(front<0 || front > n - 1){
   		return true;
   	}
   	return false;
   }
   void display(){
   	while(front<=back){
   		cout<<arr[front]<<" ";
   		front ++;
   	}
   }
   };
   
int main(int argc, char *argv[])
{
	queue q;
	q.Enqueue(1);
		q.Enqueue(2);
			q.Enqueue(3);
				q.Enqueue(4);
				   q.Enqueue(5);
	 q.display();
	 
	cout<<q.empty();
	
}