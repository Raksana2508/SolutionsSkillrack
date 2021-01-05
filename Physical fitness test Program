The Programs prints the person number who has High Oxygen level


Code
import java.util.*;
public class Hello {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int n3=sc.nextInt();
        int n4=sc.nextInt();
        int n5=sc.nextInt();
        int n6=sc.nextInt();
        int n7=sc.nextInt();
        int n8=sc.nextInt();
        int n9=sc.nextInt();
        int sum1=n1+n4+n7;
        int sum2=n2+n5+n8;
        int sum3=n3+n6+n9;
        float f1=sum1/3.0f,f2=sum2/3.0f,f3=sum3/3.0f;
        float f[]=new float[3];
        f[0]=f1;
        f[1]=f2;
        f[2]=f3;
        for(int i=0;i<f.length;i++){
            int c=0;
            for(int j=0;j<f.length;j++){
                if(i!=j){
                    if(f[i]>=f[j]){
                        c++;
                    }
                }
            }
            if(c==2){
                System.out.println("Candidate Number: "+ (i+1));
            }
        }
	}
}
