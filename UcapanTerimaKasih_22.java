import java.util.Scanner;

public class UcapanTerimaKasih_22 {
    public static String PenerimaUcapan()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tuliskan NAMA orang yang ingin anda beri ucapan: ");
        String namaOrang = sc.nextLine();
        sc.close();
        return namaOrang;
    }

    public static void ucapanTambahan(String ucap)
    {
        System.out.println("Ucapan Tambahan: "+ ucap);
    }

    public static void ucapanTerimaKasih()
    {
        String nama =  PenerimaUcapan();
        System.out.println("Thank you "+ nama +" for being the best teacher in the world.\n"+
        "You inspired in me a love  for learning and made me feel like i could ask you anything.");
    }

    public static void main(String[] args) {
        ucapanTerimaKasih();
        ucapanTambahan("Semangat!!!");
        
    }
}
