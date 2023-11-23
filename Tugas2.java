import java.util.Scanner;

public class Tugas2 {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Masukkan Jumlah Mahasiswa: ");
        int JumMha = sc.nextInt();
        System.out.println("Masukkan Jumlah Minggu: ");
        int JumMngu = sc.nextInt();
        sc.nextLine();

        String[] namaMhs = new String[JumMha];

        for (int i = 0; i < namaMhs.length; i++) {
            System.out.print("Masukkan nama mahasiswa ke-"+(i + 1)+" : ");
            namaMhs[i] = sc.nextLine();
        }
        int[][] nilaiMhs = new int[JumMha][JumMngu];
        nilaiMhs = inputData(namaMhs, nilaiMhs);
        printData(namaMhs, nilaiMhs);
        System.out.println("Minggu ke- "+MingguTertinggi(nilaiMhs)+" adalah jumlah tertinggi");
        printTertinggi(namaMhs, nilaiMhs);
        sc.close();
    }    
    static int[][] inputData(String[] nama, int[][] data)
    {
        for (int i = 0; i < nama.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.print("Masukkan Nilai "+nama[i]+" pada minggu ke -"+(j + 1)+" : ");
                data[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        System.out.println();
        return data;
    }
    public static void printData(String[] nama, int[][] data)
    {
        for (int i = 0; i < nama.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.println("Nilai "+nama[i]+" pada minggu ke -"+(j + 1)+" : "+data[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }
    public static int MingguTertinggi(int[][] data)
    {
        int[] sumEveryWeeks = new int[data[0].length];
        for (int i = 0; i < data[0].length; i++) {
            for (int j = 0; j < data.length; j++) {
                sumEveryWeeks[i] += data[j][i];
            }
        }
        int highest = sumEveryWeeks[0];
        int week = 1;
        for (int i = 0; i < sumEveryWeeks.length; i++) {
            if (highest < sumEveryWeeks[i]) {
                highest = sumEveryWeeks[i];
                week = i + 1;
            }
        }
        return week;
    }
    public static void printTertinggi(String[] nama, int[][] data)
    {
        int highest = 0, index = 0;
        for (int i = 1; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
              if (highest < data[i][j]) {
                highest = data[i][j];
                index = i;
              }  
            }
        }
        System.out.println(nama[index] + " memiliki nilai tertinggi yaitu " + highest + " pada minggu ke-"
        + MingguTertinggi(data));
    }
}
