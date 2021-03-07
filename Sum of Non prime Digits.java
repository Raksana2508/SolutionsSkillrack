Sum of Non Prime Digits in a number
    The program must print a sum of non prime digits in a number
    
    
Code
    import java.util.*;
public class Hello {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0,c=0;
        while(n>0){
            int r=n%10;
            if(r==1 || r==0){
                sum+=r;
                c++;
            }
            else{
                for(int i=2;i<r;i++){
                    if(r%i==0){
                        sum+=r;
                        c++;
                        break;
                    }
                }
            }
            n/=10;
        }
        if(c>0){
            System.out.print(sum);
        }
        else{
            System.out.print("-1");
        }
	}
}
