 package TestOct3;

public class SquareRootOfNumber {
	public static void main(String [] args) {
		int arr[] = {1,2,3,4,5};
		int result=0;
		int length= arr.length;
		for(int i=0; i<length; i++) {
			result= (result + arr[i]);
		}
		int ans = result/length;
		System.out.println(ans);
	}

}
