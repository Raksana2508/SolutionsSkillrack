import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int odd=1,even=0,a=0,b=1,c=0;
        System.out.print(a+" "+b+" ");
        for(int i=2;c<=n;i++){
            c=a+b;
            a=b;
            b=c;
            if(c<=n){
            if(c%2==0){
                even++;
            }
            else{
                odd++;
            }
            System.out.print(c+" ");
            }
        }
        System.out.println("\n"+odd+"\n"+even);
	}
}
