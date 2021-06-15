
import java.util.Scanner;

public class MyClass{
	static void deleteinbet(int []a,int n,int pos){
		int count=0;
		/**count the elements from 0 to given pos(if pos = 2 then loop goes 0(second time i will be increase i.e 1. but condition become false)) but count will ended with 1(2nd index of an array)*/
		
		for(int i=0;i<pos-1;i++){
			count++;
		}
		//starts shifting from pos to end of an array
		for(int i=count;i<n-1;i++){
		a[i] =a[i+1];
		}
		//After shifting all the elements decrease the size by 1
		--n;
		print(a,n);
	};
	static void print(int []a,int n){
		//traversing to array
		for(int i=0;i<n;i++){
			System.out.println(a[i]+" ");
		}
	};
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int [] a ={1,2,3,4,5};
		int n = a.length;
		print(a,n);
		System.out.print("Enter a pos:");
		int pos = s.nextInt();
		deleteinbet(a,n,pos);
	}
}