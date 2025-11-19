import java.util.Scanner;

public class SurveiKepuasan {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        int jml_responden = 10, jml_pertanyaan = 6;
        double rata, rataKeseluruhan;
        

        int[][] hasilSurvei = new int[jml_responden][jml_pertanyaan];

    
        System.out.println("=== INPUT HASIL SURVEI ===");
        for (int i = 0; i < jml_responden; i++) {
            System.out.println("Responden ke-" + (i + 1));
            for (int j = 0; j < jml_pertanyaan; j++) {
                System.out.print("  Nilai pertanyaan " + (j + 1) + " : ");
                hasilSurvei[i][j] = input.nextInt();
            }
        }

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

       
        System.out.println("\nRata-rata tiap pertanyaan:");
        for (int j = 0; j < jml_pertanyaan; j++) {
            int total = 0;
            for (int i = 0; i < jml_responden; i++) {
                total += hasilSurvei[i][j];
            }
            rata =  total / jml_pertanyaan;
            System.out.println("  Pertanyaan " + (j + 1) + ": " + rata);
        }

       
        int totalSemua = 0;
        for (int i = 0; i < jml_responden; i++) {
            for (int j = 0; j < jml_pertanyaan; j++) {
                totalSemua += hasilSurvei[i][j];
            }
        }

        rataKeseluruhan = totalSemua / (jml_responden * jml_pertanyaan);
        System.out.println("\nRata-rata keseluruhan: " + rataKeseluruhan);

        input.close();
    }
}
