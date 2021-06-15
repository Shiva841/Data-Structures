/*Insertion at the beginning in java*/

import java.util.Scanner;//Scanner class for user inputs

public class Main {
	
	//insertion at the beginning Subroutine
	static void insertatbetween(int []a,int pos,int n,int k){
		int i;
		for(i=n;i>pos-1;i--){
			a[i] = a[i-1];
		}
		a[pos-1]= k;
		n++;
	System.out.println("After Insertion");
		print(a,n);
	}
	
	
	//Printing the elements of an array Subroutine
	static void print(int []a,int n){
		for(int i=0;i<n;i++){
			System.out.print(a[i]+" ");
		}
	}
	
	//Drivers code
	public static void main(String[] args) {
		//s is a object of Scanner class
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter size of an array");
		int n = s.nextInt();
		
		n = n+1; //we know that if we take n=5 in array the elements will allocate (0,1,2,3,4) hence if we want to add an element then we have to increase size by 1
		
		int a[] = new int [n];
		
		
		//elements of an array will be enter
		System.out.println("Enter an elements of an Array:");
		for(int i=0;i<n-1;i++){
			a[i] = s.nextInt();
		}
		
		//position value
		System.out.println("Enter a position to insert");
		int pos = s.nextInt();
		
		//the data we have to insert at the begining of an array
		System.out.println("Enter a value to insert");
		int k = s.nextInt();
		
		//insert subroutine
		insertatbetween(a,pos,--n,k);
	}
}