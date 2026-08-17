import java.util.Scanner;

public class problem1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.next();

        int mid = text.length() / 2;

        String left = text.substring(0, mid);
        String right = text.substring(mid, text.length());

        System.out.println(left + " " + right);

    }

}
