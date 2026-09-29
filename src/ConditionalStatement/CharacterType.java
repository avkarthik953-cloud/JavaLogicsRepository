package ConditionalStatement;

public class CharacterType {

    public static void main(String[] args) {

        char ch = '&';

        if (ch >= 'A' && ch <= 'Z') {
            System.out.println(ch + " is uppercase letter");
        } else if (ch >= 'a' && ch <= 'z') {
            System.out.println(ch + " is lowercase letter");
        } else if (ch >= '0' && ch <= '9') {
            System.out.println(ch + " is a numerical letter");
        } else {
            System.out.println(ch + " is a special character");
        }
    }
}
