import java.util.*;

public class ValidBrackets {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
         int n=str.length();
       
        int top=-1;
       
         char stack[]=new char[n];

        for(int i=0;i<n;i++){
            char ch=str.charAt(i);
            if(ch=='('||ch=='{'||ch=='['){
               stack[++top]=ch;
            }
            else{
                if(top==-1){
                    System.out.println("false");
                    return;
                }
                char open=stack[top--];
                if((ch==')' && open!='(')||(ch=='}' && open!='{')||(ch==']' && open!='[')) {
                    System.out.println("false");
                    return;
                }
            }
        }
        if(top == -1){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
