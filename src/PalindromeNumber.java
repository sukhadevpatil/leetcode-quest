public class PalindromeNumber {

    public static void main(String[] args) {
        int x1 = 121;
        System.out.println(isPalindrome(x1));

        int x2 = -121;
        System.out.println(isPalindrome(x2));

        int x3 = 10;
        System.out.println(isPalindrome(x3));
    }

    public static boolean isPalindrome(int x) {
        String str = String.valueOf(x);

        StringBuilder builder = new StringBuilder();
        char [] charArr = str.toCharArray();
        for(int i = charArr.length -1; i >= 0; i--) {
            builder.append(charArr[i]);
        }

        return str.contentEquals(builder);
    }

}
