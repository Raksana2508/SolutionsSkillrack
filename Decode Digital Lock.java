If the number ia an amstrong number the sum of even digits is printed
If the number is not an amstrong number then the sum of odd digits is printed



Code
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String st=Integer.toString(n);
        int num=n;
        double sum=0;
        while(n>0){
            int r=n%10;
            sum=sum+Math.pow(r,st.length());
            n/=10;
        }
        int sum1=(int)sum;
        int s=0;
        if(num==sum){
            while(num>0){
                int r=num%10;
                if(r%2==0){
                    s+=r;
                }
                num/=10;
            }
        }
        else{
            while(num>0){
                int r=num%10;
                if(r%2!=0){
                    s+=r;
                }
                num/=10;
            }
        }
        System.out.print(s);
	}
}
