package TestOct3;
import java.math.*;
public class RepeatedElementTrue {
	
	public static void main(String [] args) {
		int num[]= {1,2,3,1,2,3};
		int k=2;
		boolean flag=false;
		for(int i=0; i<num.length;i++){
			for(int j=i+1;j<num.length;j++) {
				if((num[i]==num[j] && (Math.abs(i-j)<=k))) {
					
						flag =true;
						
						break;
				}
			}
			if(flag) {
				break;
			}
			
		}
		if(flag==true) {
			System.out.println("True");
			
		}else {
			System.out.println("False");
		}
	
	}

}
