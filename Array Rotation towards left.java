import java.util.Scanner;

public class Main {
	static void Arrotate(int []a,int n,int d){
		if(d >n){
			System.out.println("No of rotations are exceeded!");
			return;
		}
		int i,s=0;
		int j = n-d;
		//create temp arr
		
		int []temp = new int [d];
		
		//till dth element the values are copied to temp arr
		
		for(int l=0;l<d;l++){
			temp[l] = a[l];
		}
		
	  /**
	*  if n=5, d=2
	*  j = n-d = 5-2 = 3
	  
	*  1 2 3 4 5
	   
	*  temp [2] = [1,2]
	  
	*  for loop starts from i=0 ---> j and
	
	     i=0,1,2,3  
	    d=2, 3, 4
	    
	* shifting elements from index a[d] --> n
       a[0]  = a[d] = a[2] = 3
       a[1]  = a[d++] = a[3] = 4
	   a[2]  = a[d++] = a[4] = 5
	   
	   */
	   //condition will check from d should be less than n;
	   
	  if(d<n){
	  	for(i=0;i<j;i++){
	  		a[i] = a[d];
	  		d++;
	  	}
	  }
	  
	  //store back from temp array to original array 
	  
     //j starts with j=n-d = 5-2 = 3  --> less than n
	  for(;j<n;j++){
	  	a[j] = temp[s];
	  	s++;
	  }
	  //printing the elements
	  	for(int k=0;k<n;k++){
	  		System.out.print(a[k]+" ");
	  	}
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int []a = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		int n = a.length;
		System.out.print("Enter no of Rotations:");
		int d = s.nextInt();
		Arrotate(a,n,d);
	}
}