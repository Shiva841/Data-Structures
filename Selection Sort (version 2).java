import java.util.Scanner;
public class MySortingTechnique {
	static void swap(int []a,int j,int i){
		int temp =a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	static void SISort(int []a,int n){
		for(int i=0;i<n-1;i++){
			for(int j=i+1;j<n;j++){
				if(a[j]<a[i]){
					swap(a,j,i);
				}
			}
		}
		print(a,n);
	}
	static void print(int []a,int n ){
		for(int i=0;i<n;i++){
			System.out.print(a[i]+" ");
		}
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter size:");
		int n= s.nextInt();
		int []a = new int[n];
		System.out.println("Enter Elements:");
		for(int i=0;i<n;i++){
			a[i] = s.nextInt();
		}
		SISort(a,n);
	}
}