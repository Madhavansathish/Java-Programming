public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        BigInteger n=sc.nextBigInteger();
        
        if(n.isProbablePrime(20)){
            System.out.print("prime");
        }
        else{
            System.out.println("not prime");
        }
    }
}
