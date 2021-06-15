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

void postorder(node* root){
	if(root == NULL){
		return;
	}
	postorder(root->left);
	postorder(root->right);
	cout<<root->data<<" ";
}

bool isFullBinaryTree(node *root) {
  
  // Checking for emptiness
  if (root == NULL){
    return true;
  }
  // Checking for the presence of children
  //if both the child node of the root node is NULL then return True 
  
  if (root->left == NULL && root->right == NULL){
    return true;
  }
  
// root ->left = 1 and root->right = 1
//then it will traverse first left and then right
//if any of the child is become NULL then the conditon becomes false and will return 0
//if both becomes null then the 2nd conditon evaluate true
//if root itself null then first condition evaluate true

  if ((root->left) && (root->right)){
    return (isFullBinaryTree(root->left) && isFullBinaryTree(root->right));
  }
  return false;
}

int main(int argc, char *argv[])
{
	node * root = new node(1);
	root -> left = new node(2);
	root -> right = new node(3);
	root->left->left = new node(4);
	root->left->right = new node(5);
	/*
	                1
	              /   \
	            2      3
	          /  \
	        4      5
	 */

	postorder(root);
	// 4 5 2 3 1
	cout<<endl;
	if(isFullBinaryTree(root)){
		cout<<"The tree is Full Binary Tree";
	}else{
		cout<<"The tree is not a Full Binary Tree";
	}
	return 0;
}
