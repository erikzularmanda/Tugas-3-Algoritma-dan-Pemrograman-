import java.util.Scanner;
import java.util.Locale;

class HitungGajiKaryawanv3 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            Locale indonesia = Locale.of("id", "ID");

            String[] golonganKaryawan = {"A", "B", "C"};
            double[] gajiPokokKaryawan = {5000000, 6500000, 9500000};

            // Indeks 0-4 untuk jumlah jam lembur
            // Indeks 5 digunakan untuk 5 jam atau lebih
            double[] persentaseLemburKaryawan = {0, 0.30, 0.32, 0.34, 0.36, 0.38};

            String golongan = "";
            int indexGolongan = -1;

            // Input golongan dengan perulangan hingga valid
            while (indexGolongan == -1) {
                System.out.print("Masukkan Golongan Karyawan (A, B, C): ");
                String inputGolongan = input.nextLine().toUpperCase();

                for (int i = 0; i < golonganKaryawan.length; i++) {
                    if (inputGolongan.equals(golonganKaryawan[i])) {
                        golongan = inputGolongan;
                        indexGolongan = i;
                        break;
                    }
                }

                if (indexGolongan == -1) {
                    System.out.println("Golongan tidak valid. Silakan masukkan A, B, atau C.");
                }
            }

            double gajiPokok = gajiPokokKaryawan[indexGolongan];

            // Minta jumlah jam lembur dan pastikan nilai tidak negatif
            int jamLembur = -1;
            do {
                System.out.print("Masukkan Jumlah Jam Lembur: ");
                jamLembur = input.nextInt();

                if (jamLembur < 0) {
                    System.out.println("Jumlah jam lembur tidak boleh negatif. Silakan coba lagi.");
                }
            } while (jamLembur < 0);

            int indexLembur = Math.min(jamLembur, 5); // Gunakan indeks 5 untuk 5 jam atau lebih
            double persentaseLembur = persentaseLemburKaryawan[indexLembur];

            double gajiLembur = gajiPokok * persentaseLembur;
            double totalPenghasilan = gajiPokok + gajiLembur;

            // Output
            System.out.println("\n=== Hasil Perhitungan ===");
            System.out.println("Golongan               : " + golongan);
            System.out.printf(indonesia, "Gaji Pokok             : %,.0f%n", gajiPokok);
            System.out.printf(indonesia, "Gaji Lembur            : %,.0f%n", gajiLembur);
            System.out.printf(indonesia, "Total Penghasilan      : %,.0f%n", totalPenghasilan);
        }
    }
}