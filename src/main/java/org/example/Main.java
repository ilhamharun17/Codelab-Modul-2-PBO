import java.util.Scanner;
class Mahasiswa {
    String nama;
    String nim;
    String jurusan;

    static String tampilUniversitas() {
        return "Universitas Muhammadiyah Malang";
    }

    void inputData() {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Nama : ");
        nama = input.nextLine();

        System.out.print("Masukkan NIM : ");
        nim = input.nextLine();

        while (true) {
            if (nim.length() != 15) {
                System.out.println("NIM Harus 15 Digit");
                System.out.print("Masukkan NIM : ");
                nim = input.nextLine();
            } else {
                break;
            }
        }

        System.out.print("Masukkan Jurusan : ");
        jurusan = input.nextLine();
    }

    String tampilDataMahasiswa() {
        return "Nama : " + nama + ", NIM : " + nim + ", Jurusan : " + jurusan;
    }
}

public class Main {
    public static void main(String[] args) {

        Mahasiswa data = new Mahasiswa();
        Scanner pilih = new Scanner(System.in);
        boolean menu = false;

        while (!menu) {
            System.out.println(" 1. Tambah Data Mahasiswa");
            System.out.println(" 2. Tampilkan Nama Mahasiswa");
            System.out.println(" 3. Keluar");
            System.out.print("Masukkan Pilihan (1-3) : ");
            int pilihan = pilih.nextInt();

            switch (pilihan){
                case 1:
                    data.inputData();
                    break;
                case 2:
                    System.out.println("Data Mahasiswa");
                    System.out.println(data.tampilUniversitas());
                    System.out.println(data.tampilDataMahasiswa());
                    break;
                case 3:
                    System.out.println("Sampai Jumpa");
                    menu = true;
                    break;
                default:
                    System.out.println("Pilihan Hanya 1-3");
            }
        }
    }
}