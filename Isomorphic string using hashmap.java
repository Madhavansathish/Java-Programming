class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;

        Map<Character, Character> mapST = new HashMap<>();
        Map<Character, Character> mapTS = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);

            // Check existing mappings
            if (mapST.containsKey(ch1) && mapST.get(ch1) != ch2)
                return false; // mismatch in s→t mapping
            if (mapTS.containsKey(ch2) && mapTS.get(ch2) != ch1)
                return false; // mismatch in t→s mapping

            // Add mappings if not present
            mapST.put(ch1, ch2);
            mapTS.put(ch2, ch1);
        }

        return true;
    }
}
