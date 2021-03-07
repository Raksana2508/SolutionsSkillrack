This code is to calculate the cost of wall painting.The cost of both interior and exterior walls are given


Code
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int m=sc.nextInt();
        int n=sc.nextInt();
        double arr1[]=new double[m];
        double arr2[]=new double[n];
        double sum1=0.0,sum2=0.0;
        for(int i=0;i<m;i++){
            arr1[i]=sc.nextFloat();
            sum1+=arr1[i];
        }
        for(int i=0;i<n;i++){
            arr2[i]=sc.nextFloat();
            sum2+=arr2[i];
        }
        System.out.printf("%.2f",(sum1*x)+(sum2*y));
	}
}
