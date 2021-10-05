package TestOct3;
import java.io.*;
import java.util.*;

public class TotalSalary {

	    public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	        Scanner sc = new Scanner(System.in);
	        long basic = sc.nextInt();
	        char grade = sc.next().charAt(0);
	      
	        long allow;
	        long total;
	        long hra = (20/100)*basic;
	        long da = (50/100)*basic;
	        long  pf = (11/100)*basic;
	        if(grade=='A'){
	            allow =1700;
	            total = basic + hra +da+ allow-pf;
	            System.out.println(total);
	                
	        }
	        else if(grade=='B'){
	            allow =1500;
	            total = basic + hra +da+ allow-pf;
	            System.out.println(total);
	                
	        }
	        else {
	            allow =1300;
	            total = basic + hra +da+ allow-pf;
	            System.out.println(total);
	            
	        }
	    }
	

}
