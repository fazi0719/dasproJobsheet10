import java.util.Scanner;

public class coba {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        int jml_responden = 10, jml_pertanyaan = 6;
        

        int[][] hasilSurvei = new int[jml_responden][jml_pertanyaan];

    
        System.out.println("=== INPUT HASIL SURVEI ===");
        for (int i = 0; i < jml_responden; i++) {
            System.out.println("Responden ke-" + (i + 1));
            for (int j = 0; j < jml_pertanyaan; j++) {
                System.out.print("  Nilai pertanyaan " + (j + 1) + " : ");
                hasilSurvei[i][j] = input.nextInt();
            }
        }
    }
}
    

