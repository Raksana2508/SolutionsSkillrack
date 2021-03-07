Count the Vowels in the String and remove the vowels from the string both uppercase and lowercase Vowels and want to each vowels count seperately



Code
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String arr[]=str.split(" ");
		int a=0,e=0,i=0,o=0,u=0;
		String res="";
		int l=0,x=0;
		for(int j=0;j<str.length();j++){
		    if(Character.isLetter(str.charAt(j))){
		        l++;
		    }
		}
        for(int j=0;j<arr.length;j++){
            String s=arr[j];
            res="";
            for(int k=0;k<s.length();k++){
            char c=s.charAt(k);
            if(c=='a' || c=='A'){
                a++;
                x++;
            }
            else if(c=='e' || c=='E'){
                e++;
                x++;
            }
            else if(c=='i' || c=='I'){
                i++;
                x++;
            }
            else if(c=='o' || c=='O'){
                o++;
                x++;
            }
            else if(c=='u' || c=='U'){
                u++;
                x++;
            }
            else{
                if(c!=' '){
                res+=s.charAt(k);
                }
            }
            }
            arr[j]=res;
        }
        System.out.print("a: "+a+"\n"+"e: "+e+"\n"+"i: "+i+"\n"+"o: "+o+"\n"+"u: "+u+"\n");
        if(x!=l){
            for(int j=0;j<arr.length;j++){
                if(arr[j].length()>0){
                System.out.print(arr[j]+" ");
                }
            }
        }
        else{
            System.out.print("-1");
        }
	}
}
