import java.util.Scanner;

public class MergeArray{
	
	//Merge Array function
	
	static void mergeArray(int a[],int b[],int n,int m){
		int i,j,count=0;
		int o = m+n;  //size will be addition of two array size
		int c[] = new int [o]; //allocation of third array
		for(i=0;i<n;i++){ 
		//Adding first Array in third array
			c[i] = a[i];
			count++;
		}
		for(j=0;j<m;j++){
		//Adding second Array in third array
			c[count++] = b[j];
		}
	    printArray(c,o);
			
	}
	
	//printing the elements of final array
	
	static void printArray(int [] c, int n){
		for(int i=0;i<n;i++){
			System.out.println("c["+ i +"]:" +c[i]);
		}
	}
	
	//Main Function
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n,m;
		
		System.out.println("Enter a first Array size:");
		n = s.nextInt();
		int [] a = new int[n];
		
		System.out.println("Enter the Second Array size:");
		m = s.nextInt();
		int [] b = new int[m];
		
	System.out.println("Enter a first Array values:");
	for(int i=0;i<n;i++){
		 a[i] = s.nextInt();
	}
	System.out.println("Enter the Second Array values:");
	
	for(int j=0;j<m;j++){
		 b[j] = s.nextInt();
	}
	
	   mergeArray(a,b,n,m);
	 
	}
}