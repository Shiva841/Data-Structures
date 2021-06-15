#include<iostream>
using namespace std;

class node{
	public:
	int data;
	node* left,*right;
	
	node(int val){
		data = val;
		left = NULL;
		right = NULL;
	}
};

void inorder(node * root){
	if(root == NULL){
		return;
	}
	inorder(root->left);
	cout<<root->data<<" ";
	inorder(root->right);
}

void preorder(node * root){
	if(root == NULL){
		return;
	}
	cout<<root->data<<" ";
	preorder(root->left);
	preorder(root->right);
	
}

void postorder(node* root){
	if(root == NULL){
		return;
	}
	postorder(root->left);
	postorder(root->right);
	cout<<root->data<<" ";
}
int main(int argc, char *argv[])
{
	node * root = new node(1);
	root -> left = new node(2);
	root -> right = new node(3);
	/*
	                1
	              /   \
	            2      3
	          
	 */
	
	inorder(root);
	//   2 1 3
	cout<<endl;
	preorder(root);
	//   1 2 3
	cout<<endl;
	postorder(root);
	//   2 3 1
	return 0;
}
