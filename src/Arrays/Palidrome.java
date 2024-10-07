package Arrays;

public class Palidrome {

    public static boolean rightOrWrong (String word) {
        char[] charArray = word.toCharArray();
        int start = 0;
        int end = word.length() - 1;
        while (start < end) {
            if (charArray[start] != charArray[end]) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public static void main(String[] args) {
        Palidrome stringUtil = new Palidrome ();
        if (stringUtil.rightOrWrong("madam")){
            System.out.println("The given string is Palidrome!!!");
        } else {
            System.out.println("The given string is not Palidrome!!!");
        }
    }
}
