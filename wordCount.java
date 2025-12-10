import java.util.*;
public class wordCount{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

        String newstr=str.toLowerCase();
        newstr=newstr.replaceAll("[^a-z0-9]", " ");

        String[] arr=newstr.split("\\s+");
        HashMap<String,Integer> map=new HashMap<>();
        for(String s:arr){
            if(map.containsKey(s))
                map.put(s,map.get(s)+1);
            else
                map.put(s,1);
        }

        while(!map.isEmpty()){
            String word="";
            int max=-1;

            for(String key:map.keySet()){
                int count=map.get(key);
                if(count>max){
                    max=count;
                    word=key;
                }
            }
            System.out.println(word+" - "+max);
            map.remove(word);
        }
    }
}