class Solution {
    public String getEncryptedString(String s, int k) {
        StringBuilder s1=new StringBuilder();
        for(int i=0;i<s.length();i++){
            s1.append(s.charAt((k+i)%s.length()));
        }
        return s1.toString();
    }
}
