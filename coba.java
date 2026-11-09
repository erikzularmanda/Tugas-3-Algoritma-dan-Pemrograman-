import java.util.Locale;
import java.util.Scanner;

class HitungGajiKaryawan1 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
        Locale indonesia = Locale.of("id", "ID");
            String golongan;
            double gajiPokok = 0;
            double persentaseLembur;
            double gajiLembur;
            double totalPenghasilan;
            
            // Input golongan dengan perulangan sampai valid
            while (true) {
                System.out.print("Masukkan Golongan Karyawan (A/B/C): ");
                golongan = input.nextLine().toUpperCase();

            // Menentukan gaji pokok berdasarkan golongan
            boolean isValid = true;
            switch (golongan) {
                case "A" -> gajiPokok = 5000000;
                case "B" -> gajiPokok = 6500000;
                case "C" -> gajiPokok = 9500000;
                default -> {
                    System.out.println("Golongan tidak valid. Silakan Coba Lagi.");
                    isValid = false;
                }
            }

            // Jika golongan valid, keluar dari perulangan
            if (isValid) {
                break;
            }
            
        }
            // Input jumlah jam lembur
            System.out.print("Masukkan jumlah jam lembur: ");
            int jamLembur = input.nextInt();

            // Menentukan persentase lembur
            if (jamLembur == 1) {
                persentaseLembur = 0.30;
            } else if (jamLembur == 2) {
                persentaseLembur = 0.32;
            } else if (jamLembur == 3) {
                persentaseLembur = 0.34;
            } else if (jamLembur == 4) {
                persentaseLembur = 0.36;
            } else if (jamLembur >= 5) {
                persentaseLembur = 0.38;
            } else {
                persentaseLembur = 0; // Jika jam lembur <= 0
            }
            
            //Menghitung gaji lembur
            gajiLembur = gajiPokok * persentaseLembur;
            
            //Menghitung total penghasilan
            totalPenghasilan = gajiPokok + gajiLembur;
            
            //Output
            System.out.println("\n=== Hasil Perhitungan ===");
            System.out.println("Golongan            : " + golongan);
            System.out.printf(indonesia, "Gaji Pokok          : Rp%,.0f%n", gajiPokok);
            System.out.printf(indonesia, "Gaji Lembur         : Rp%,.0f%n", gajiLembur);
            System.out.printf(indonesia, "Total Penghasilan   : Rp%,.0f%n", totalPenghasilan);
        }
    }
}