public class Main {
	static void swap(int []a,int i,int j){
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
	static void bubblesort(int []a,int n){
		for(int i=0;i<n-1;i++){
			for(int j=0;j<n-1-i;j++){
				if(a[j] > a[j+1]){			
					swap(a,j,j+1);
				}
			}
		}
		print(a,n);
	}
	static void print(int []a,int n){
		for(int i=0;i<n;i++){
			System.out.println(a[i]+" ");
		}
	}
	public static void main(String[] args) {
		int [] a ={5,3,8,1,9};
		int n = a.length;
		bubblesort(a,n);
	}
}