import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        Scanner girdi = new Scanner(System.in);
        System.out.println("Lütfen Bir Sayı giriniz: ");
        n = girdi.nextInt();
            // burada alınan n degeri kadar donguyu donduruyor ve her dongu de 2 nin bir ustu sayıyı elde ediyor
        for (int i = 1; i <=n; i*=2 ) {
            System.out.println(i);
        }
    }
}
