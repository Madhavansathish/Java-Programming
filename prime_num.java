public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        long n = sc.nextLong();
        boolean ans=true;
        if(n<=1){
            System.out.println("not prime");
            return;
        }
        for(long i=2;i*i<=n;i++){
            if(n%i==0){
                ans=false;
                break;
            }
        }
        if(ans==true)
           System.out.print("prime");
        else 
           System.out.println("not prime");
    }  
}
