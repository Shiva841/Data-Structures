public class Main {
	static void deleteatend(int [] a,int n){
		int count=0;
		for(int i=0;i<n-1;i++){
		  count++;
			System.out.println(count);
		}
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
		int [] a = {1,2,3,4,5,6,7,8,9};
		//length = 5
		int n = a.length;
		deleteatend(a,n);
	}
}