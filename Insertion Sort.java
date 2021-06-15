public class Main {
	
	static void swap(int []a,int j,int i){
		int temp =a[j];
		a[j] = a[i];
		a[i] = temp;
	}
	
	static void Insertionsort(int []a,int n){
		for(int i=0;i<n-1;i++){
			for(int j=i;j<n;j++){
				if(a[j]<a[i]){
					swap(a,j,i);
				}
			}
		}
		for(int i=0;i<n;i++){
			System.out.print(a[i]+" ");
		}
	}
	public static void main(String[] args) {
		int []a ={8,1,3,6,4,7,9,5,2,10};
		int n =a.length;
		Insertionsort(a,n);
	}
}