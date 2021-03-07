Minimum profit Wipro Program


Code
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int arr[][]=new int[a][b];
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<b;i++){
            int arr1[]=new int[a];
            for(int j=0;j<a;j++){
                arr1[j]=arr[j][i];
            }
            Arrays.sort(arr1);
            System.out.print(arr1[0]+" ");
        }
	}
}
