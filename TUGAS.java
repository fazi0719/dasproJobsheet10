    import java.util.Scanner;

public class TUGAS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int jml_responden = 10, jml_pertanyaan = 6;
        double rata, rataKeseluruhan;
        
        int[][] hasilSurvei = new int[jml_responden][jml_pertanyaan];

     // menyimpan hasil survei   
     System.out.println("=== INPUT HASIL SURVEI ===");
        for (int i = 0; i < jml_responden; i++) {
            System.out.println("Responden ke-" + (i + 1));
            for (int j = 0; j < jml_pertanyaan; j++) {
                System.out.print("  Nilai pertanyaan " + (j + 1) + " : ");
                hasilSurvei[i][j] = sc.nextInt();
            }
            System.out.println();
        }

    // menampilkan rata rata untuk setiap responden
        System.out.println("\n=== HASIL PERHITUNGAN RATA-RATA ===");
        System.out.println("\nRata-rata tiap responden:");
        for (int i = 0; i < jml_responden; i++) {
            int total = 0;
            for (int j = 0; j < jml_pertanyaan; j++) {
                total += hasilSurvei[i][j];
            }
            rata = total / jml_pertanyaan;
            System.out.println("  Responden " + (i + 1) + ": " + rata);
        }

    //menampilkan nilai rat rata untuk setiap pertanyaan
        System.out.println("\nRata-rata tiap pertanyaan:");
        for (int j = 0; j < jml_pertanyaan; j++) {
            int total = 0;
            for (int i = 0; i < jml_responden; i++) {
                total += hasilSurvei[i][j];
            }
            rata =  total / jml_responden;
            System.out.println("  Pertanyaan " + (j + 1) + ": " + rata);
        }
    //menampilkan rata rata untuk nilai secara keseluruhan
        int totalSemua = 0;
        System.out.println("\nRata-rata secara keseluruhan:");   
        for (int i = 0; i < jml_responden; i++) {
            for (int j = 0; j < jml_pertanyaan; j++) {
                totalSemua += hasilSurvei[i][j];
            }
        }
    }
}