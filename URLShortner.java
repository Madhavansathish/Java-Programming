import java.util.*;

public class URLShortner{

    Map<String, String> codetourl = new HashMap<>();
    Map<String, String> urltocode = new HashMap<>();

    Random rand=new Random();
     String letters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    

    private String generate(){
        String code="";
        for(int i=0;i<6;i++){
            int idx=rand.nextInt(letters.length());
            code+=letters.charAt(idx);
        }
        return code;
    }

    public String shorten(String url){
        if(urltocode.containsKey(url)){
            return urltocode.get(url);
        }
        String code=generate();
        while(codetourl.containsKey(code)){
            code=generate();
        }
        codetourl.put(code,url);
        urltocode.put(url,code);
        return code;
    }

     public String redirect(String code) {
        return codetourl.getOrDefault(code, null);
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        URLShortner s=new URLShortner();

        
        while(true) {
            System.out.println("\n1. Shorten URL");
            System.out.println("2. Redirect code");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            if(choice == 0) break;

            switch(choice) {
                case 1:
                    System.out.print("Enter URL: ");
                    String url = sc.nextLine();
                    String code = s.shorten(url);
                    System.out.println("Short Code = " + code);
                    break;

                case 2:
                    System.out.print("Enter short code: ");
                    String c = sc.nextLine();
                    String original = s.redirect(c);
                    System.out.println("Original URL = " + original);
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        }
        
    }
}