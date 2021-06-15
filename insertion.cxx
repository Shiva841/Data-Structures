#include<iostream>
using namespace std;

class node{
	public:
	int data;
	node * next;
};

// insertion at the begining
void insert(node *&head,int data){
	node * New = new node();
	New -> data = data;
	New -> next = head;
	head = New;
}


//insertion at the end
void insert_end(node *&head,int data){
	node * New = new node();
	New -> data = data;
	New -> next = NULL;
	//for traversing we required temp pointer 
	node * temp = head;
	
	if(head == NULL){
		head = New;
		return;
	}
	/*
	if we write (temp != NULL)it will throw a runtime error segmentation fault
	*/
	
	while(temp->next!=NULL){
		temp= temp->next;
	}
	temp->next = New;
	return;
}

void insert_between(node *&head,int data,int pos){
	node* New = new node();
	New->data = data;
	node *temp = (head);
	if(pos == 1 ){
		insert(head,data);
		return;
	}else if(pos ==0){
		return;
	}
	while(--pos && pos >=2){
		temp = temp->next;
	}
	New->next = temp->next;
	temp->next = New;
	return;
}

//printing the elements
void display(node*head){
	while(head!=NULL){
		cout<<head->data<<"->";
		head = head ->next;
	}
	cout<<"NULL";
}
//Driver code
int main(int argc, char *argv[])
{
	node * head = NULL;
	insert(head,12);
	insert(head,14);
	insert_end(head,11);
	insert_end(head,10);
	//14->12->11->10->NULL
	insert_between(head,22,5);
	//14->12->22->11->10->NULL
	display(head);
	
	
}