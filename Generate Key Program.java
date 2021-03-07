Generate Key Program in Wipro
  The Program must accept three integers and generate a four digit key based on following conditions.
      The 1st digit in key must be equal to the smallest digit in thousands places
      The 2nd digit in key must be equal to the largest digit in hundreds places
      The 3rd digit in key must be equal to the smallest digit in tens places
      The 1st digit in key must be equal to the largest digit in unit places
      
      
      
Coding
      import java.util.*;
      public class Hello {

              public static void main(String[] args) {
              Scanner sc=new Scanner(System.in);
              int n1=sc.nextInt();
              int n2=sc.nextInt();
              int n3=sc.nextInt();
              String s="";
              int t1=n1/1000;
              int t2=n2/1000;
              int t3=n3/1000;
              int h1=(n1%1000)/100;
              int h2=(n2%1000)/100;
              int h3=(n3%1000)/100;
              int ten1=(n1%100)/10;
              int ten2=(n2%100)/10;
              int ten3=(n3%100)/10;
              int u1=n1%10;
              int u2=n2%10;
              int u3=n3%10;
              if(t1<=t2 && t1<=t3){
                 s+=Integer.toString(t1);
              }
              else if(t2<=t1 && t2<=t3){
                 s+=Integer.toString(t2);
              }
              else{
                 s+=Integer.toString(t3);
              }
              if(h1>=h2 && h1>=h3){
                s+=Integer.toString(h1);
              }
              else if(h2>=h1 && h2>=h3){
                s+=Integer.toString(h2);
              }
              else{
                s+=Integer.toString(h3);
              }
              if(ten1<=ten2 && ten1<=ten3){
                s+=Integer.toString(ten1);
              }
              else if(ten2<=ten1 && ten2<=ten3){
                s+=Integer.toString(ten2);
              }
              else{
                s+=Integer.toString(ten3);
              }
              if(u1>=u2 && u1>=u3){
                s+=Integer.toString(u1);
              }
              else if(u2>=u1 && u2>=u3){
                s+=Integer.toString(u2);
              }
              else{
                s+=Integer.toString(u3);
              }
              System.out.print(s);
	  }
}
