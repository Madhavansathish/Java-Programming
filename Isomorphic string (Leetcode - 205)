class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] mapST = new int[256]; // mapping from s -> t
        int[] mapTS = new int[256]; // mapping from t -> s

        for (int i = 0; i < s.length(); i++) {
            char chS = s.charAt(i);
            char chT = t.charAt(i);

            // If no mapping exists, set it
            if (mapST[chS] == 0) {
                mapST[chS] = chT;
            } else if (mapST[chS] != chT) {
                return false; // conflict in s->t mapping
            }

            if (mapTS[chT] == 0) {
                mapTS[chT] = chS;
            } else if (mapTS[chT] != chS) {
                return false; // conflict in t->s mapping
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        System.out.println(sol.isIsomorphic("egg", "add"));   // true
        System.out.println(sol.isIsomorphic("foo", "bar"));   // false
        System.out.println(sol.isIsomorphic("paper", "title"));// true
    }
}
