public class Main {
	static void delete(int [] a,int n){
		//start shifting from 0th index till last less than(5-1=4)
		for(int i=0;i<n-1;i++){
			a[i] = a[i+1];
			System.out.println(i);
		}
		//decrease the size by 1
		--n;
		print(a,n);
	}
	//printing the elements
	static void print(int []a,int n){
		System.out.println("Size:"+n);
		for(int i=0;i<n;i++){
			System.out.println(a[i]);
		}
	}
	public static void main(String[] args) {
		int [] a = {1,2,3,4,5};
		//length = 5
		int n = a.length;
		delete(a,n);
	}
}