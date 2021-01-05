The program must accept two integers and swap every digits of the numbers then the sum of the two numbers should be printed



Code
  import java.util.*;
public class Hello {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        String s1=Integer.toString(n1);
        String s2=Integer.toString(n2);
        char a1[]=s1.toCharArray();
        char a2[]=s2.toCharArray();
        for(int i=0;i<a1.length;i+=2){
            if(i!=a1.length-1){
            char c=a1[i];
            a1[i]=a1[i+1];
            a1[i+1]=c;
            }
        }
        for(int i=0;i<a2.length;i+=2){
            if(i!=a2.length-1){
            char c=a2[i];
            a2[i]=a2[i+1];
            a2[i+1]=c;
            }
        }
        String s3="",s4="";
        for(int i=0;i<a1.length;i++){
            s3+=a1[i];
        }
        for(int i=0;i<a2.length;i++){
            s4+=a2[i];
        }
        int num1=Integer.parseInt(String.valueOf(s3));
        int num2=Integer.parseInt(String.valueOf(s4));
        System.out.print(num1+num2);
	}
}
