import java.util.Scanner;

public class Ucapan_22 {
    public static void PenerimaUcapan()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tuliskan Nama orang yang ingin anda beri ucapan: ");
        String namaOrang = sc.nextLine();
        sc.close();
        System.out.println("Thank you "+ namaOrang +"\nMay the force be with you.");
    }

    public static void main(String[] args) {
        PenerimaUcapan();
    }
}
