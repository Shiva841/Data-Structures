public class Main {
	static void LSearch(int []a,int n,int k){
		//It is like Traversing + condition
		/**We have to traverse one by one if value is found then return which position it was stored*/
		for(int i=0;i<n;i++){
			if(a[i]==k){
				System.out.print(k+" is present at index :" + i+"\n");
				break;
			}
		}
	}
	public static void main(String[] args) {
		int [] a = {8,4,7,5,1,2,6,3};
		int n= a.length;
		int k = 1;
		LSearch(a,n,k);
	}
}