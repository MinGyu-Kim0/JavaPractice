import java.util.Scanner;

public class AplusB {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] number = sc.nextLine().split(" ");

            int a = Integer.parseInt(number[0]);
            int b = Integer.parseInt(number[1]);
            System.out.println(a+b);
        }
    }