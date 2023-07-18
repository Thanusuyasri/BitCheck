import java.util.Scanner;

public class BitCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number=scanner.nextInt();
        int bit = scanner.nextInt();
        if(number==(number|(1<<bit)))
        {
            System.out.println(1);
        }
        else {
            System.out.println(0);
        }
    }
}
