#include<iostream>
#define n 20    /*Capacity of Stack */
using namespace std;

class Stack{
	public:
	int Top;    //Stack has Top  variable which will indicates Top element of a stack
	int arr[n] ={};  // Array Representation of a Stack with all values of 0 initialize by default
	
	Stack(){        //Constructor which will initialise Top  by default -1
		Top = -1;
	}
	
	void Push(int val); //Push operation will add the element in Top of a stack
	void display();//Traversing through Stack
	void Pop(); //Pop operation will remove the element from Top of a stack
};

void Stack::Push(int val){
	//while adding we have to take care to check if stack is full or not if it is already full then we cant add anymore then we call this situation Overflow.
if(Top == n-1){ // n-1 is the last element 
	cout<<"StackOverflow!!"<<endl;
	return;
}
Top++;  // if stack is not full then we have to increment the Top 
arr[Top] = val; // Now add the value at the Top
}

void Stack :: Pop(){
		if(Top == -1){//check whether Stack is empty if it is then return .-1 indicate stack is empty
		cout<<"StackUnderflow!!"<<endl;
		return;
	}
	Top--; // if it is not empty then decrement the Top 
}


//Displaying the elements;
void Stack:: display(){
	//if Stack is Empty then we cannot be able to print the data 
	if(Top < -1){
		cout<<"Stack is empty"<<endl;
		return;
	}
	
	//display in sequence
	for(int i=0;i<=Top;i++){
		cout<<arr[i]<<" ";
	}
	cout<<endl;
	//display in Reverse 
	cout<<"Reverse:";
	while(Top>-1){
		cout<<arr[Top]<<" ";
		Top --;
	}
}


//Drivers Code:
int main(int argc, char *argv[])
{
	Stack s;

		/*
	      |                    |
	      |                    |
	      |                    |
	      |                    |
	      |___________|
	                               <---- Top = -1
	 */
	s.Push(1);
	/*
	      |                    |
	      |                    |
	      |_________ _|
	      |         1        |   <------- Top = 0
	      ________ ___|
	      
	 */
	s.Push(2);
		/*
	      |  _________ |
	      |         2         |  <------- Top = 1
	      |_________ _|
	      |         1
	      ________ ___|
	      
	 */
	s.Push(3);
		/*
		  | __________|
		  |         3         |   <-------- Top = 2
	      |  _________ |
	      |         2         |
	      |_________ _|
	      |         1
	      ________ ___|
	      
	 */
	s.Push(4);
		/*
		  |                    |
		  |__________ |
		  |         4         |   <------- Top = 3
		  |__________ |
		  |         3         |
	      |__________ |
	      |         2         |
	      |_________ _|
	      |         1         |
	      ___________ |
	      
	 */
    s.Pop();
    
  	/*
		  | __________|
		  |         3         |   <-------- Top = 2
	      |  _________ |
	      |         2         |
	      |_________ _|
	      |         1
	      ________ ___|
	      
	 */
	s.display();   // 1 2 3 
						  //   3 2 1
	cout<<endl;
	s.Push(8);   
		/*
		  |                    |
		  |__________ |
		  |         4         |   
		  |__________ |
		  |         3         |
	      |__________ |
	      |         2         |
	      |_________ _|
	      |         8         |   <------ Top = 0
	      ___________ |
	      
	 */
	s.Push(7);
		/*
		  | __________|
		  |                    |
		  |__________ |
		  |         4         |   
		  |__________ |
		  |         3         |
	      |__________ |
	      |         7         |   <----- Top = 1
	      |_________ _|
	      |         8         |
	      ___________ |
	      
	 */
	s.display();  //8 7
	   				   // 7 8 
}