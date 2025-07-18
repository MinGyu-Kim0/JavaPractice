import java.util.Scanner;

public class ToggleCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String result = "";
        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);
            if (Character.isLowerCase(a.charAt(i))) {
                result += Character.toUpperCase(ch);
            } else if (Character.isUpperCase(a.charAt(i))) {
                result += Character.toLowerCase(ch);
            }
        }
        System.out.println(result);
    }
}