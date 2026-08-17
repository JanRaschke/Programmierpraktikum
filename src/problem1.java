import java.util.Scanner;

public class problem1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.next();

        int mid = text.length() / 2;

        String left = text.substring(0, mid);
        String right = text.substring(mid, text.length());

        int l = Integer.parseInt(left);
        int r = Integer.parseInt(right);

        System.out.println(l + " " + r);

    }

}
