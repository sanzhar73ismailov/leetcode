package org.leetcode.sanzhar;

public class T05LongestPalindromicSubstring {
    public static void main(String[] args) {
        //System.out.println(revert("123456"));
        String res = new T05LongestPalindromicSubstring().longestPalindrome("kyyrjtdplseovzwjkykrjwhxquwxsfsorjiumvxjhjmgeueafubtonhlerrgsgohfosqssmizcuqryqomsipovhhodpfyudtusjhonlqabhxfahfcjqxyckycstcqwxvicwkjeuboerkmjshfgiglceycmycadpnvoeaurqatesivajoqdilynbcihnidbizwkuaoegmytopzdmvvoewvhebqzskseeubnretjgnmyjwwgcooytfojeuzcuyhsznbcaiqpwcyusyyywqmmvqzvvceylnuwcbxybhqpvjumzomnabrjgcfaabqmiotlfojnyuolostmtacbwmwlqdfkbfikusuqtupdwdrjwqmuudbcvtpieiwteqbeyfyqejglmxofdjksqmzeugwvuniaxdrunyunnqpbnfbgqemvamaxuhjbyzqmhalrprhnindrkbopwbwsjeqrmyqipnqvjqzpjalqyfvaavyhytetllzupxjwozdfpmjhjlrnitnjgapzrakcqahaqetwllaaiadalmxgvpawqpgecojxfvcgxsbrldktufdrogkogbltcezflyctklpqrjymqzyzmtlssnavzcquytcskcnjzzrytsvawkavzboncxlhqfiofuohehaygxidxsofhmhzygklliovnwqbwwiiyarxtoihvjkdrzqsnmhdtdlpckuayhtfyirnhkrhbrwkdymjrjklonyggqnxhfvtkqxoicakzsxmgczpwhpkzcntkcwhkdkxvfnjbvjjoumczjyvdgkfukfuldolqnauvoyhoheoqvpwoisniv");
        //String res = new T05LongestPalindromicSubstring().longestPalindrome("babad");
        System.out.println("res = " + res);
        //boolean b = isPalindrome("1221");

    }

    public String longestPalindrome(String s) {
        String res = s.substring(0, 1);
        for (int i = 0; i < s.length(); i++) {
            if ((s.length() - i) < res.length())
                break;
            for (int j = i + 1; j < s.length(); j++) {
                String part = s.substring(i, j + 1);
                if(part.length() < res.length())
                    continue;
                if (isPalindrome(part) && part.length() > res.length()) {
                    res = part;
                }
            }
        }
        return res;
    }

    static boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length()-1;
        while (i < j) {
            if(s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
