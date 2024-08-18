public class Palindrome {
    public static void main(String[] args) {
        String str1 = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(str1));

        String str2 = "race a car";
        System.out.println(isPalindrome(str2));

        String str3 = " ";
        System.out.println(isPalindrome(str3));
    }

    public static boolean isPalindrome(String str) {
        str = str.replaceAll("[^a-zA-Z0-9]", "").trim().toLowerCase();

        StringBuilder builder = new StringBuilder();
        char [] charArr = str.toCharArray();
        for(int i = charArr.length -1; i >= 0; i--) {
            builder.append(charArr[i]);
        }

        System.out.println(str);
        System.out.println(builder);

        return !str.isEmpty() && str.contentEquals(builder);
    }
}

