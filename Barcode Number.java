To find the smallest digit in a number


Code
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=Integer.toString(n);
        int arr[]=new int[s.length()];
        int i=0;
        while(n>0){
            arr[i]=n%10;
            i++;
            n/=10;
        }
        Arrays.sort(arr);
        System.out.print(arr[0]);
	}
}
