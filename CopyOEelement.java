package TestOct3;

public class CopyOEelement {
	public static void main(String [] args) {
		int arr[] = {1,2,3,4,7,6,5};
		int[] arracopy =new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			arracopy[i]=arr[i];
			System.out.println(arracopy[i]);
		}
	}

}
