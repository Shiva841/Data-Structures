import java.util.Scanner;
public class Main {
	static void Update(int []a,int n,int pos,int v){
		int i=0;
		while(i<pos-1){
			i++;
		}
		a[i] = v;
		print(a,n);
	};
	static void print(int []a,int n){
		for(int i=0;i<n;i++){
			System.out.println(a[i]+" ");
		}
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int [] a = {1,2,3,4,5};
		int n = a.length;
		print(a,n);
		System.out.print("Enter a pos:");
		int pos = s.nextInt();
		
		System.out.print("Enter a value to Update a value in array:");
		int v = s.nextInt();
	
		Update(a,n,pos,v);
	}
}