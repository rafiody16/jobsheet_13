import java.util.Scanner;

public class Kubus22 {
    static int hitungVolume (int s)
    {
        int vol = s * s * s;
        return vol;
    }
    static int hitungLuasPmkKubus (int s)
    {
        int luas = 6 * s *s;
        return luas;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s, l, vol;

        System.out.println("Masukkan sisi kubus: ");
        s = sc.nextInt();

        vol = hitungVolume(s);
        System.out.println("Volume kubus adalah "+ vol);
        l = hitungLuasPmkKubus(s);
        System.out.println("Luas permukaan kubus adalah "+ l);
        sc.close(); 
    }
}
