package TestOct3;

public class EvenLeftOddRight {
	public static void main(String [] args) {
		int arr[] ={12,14,19,23,4,7,9,10};
		int[] copy= new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			if((arr[i]%2)==0) {
				;
			}
		}
		for(int i=0;i<copy.length;i++) {
			System.out.print(copy[i]+" ");
		}
	}

}
