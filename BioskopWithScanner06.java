import java.util.Scanner;

public class BioskopWithScanner06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int baris, kolom, menu;
        String nama, next;

        String[][] penonton = new String[4][2];

        while (true) {
            System.out.println("=========================");
            System.out.println("        MENU BIOSKOP     ");
            System.out.println("=========================");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu: ");
            menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {

                case 1:
                    while (true) {
                        System.out.print("Masukkan nama: ");
                        nama = sc.nextLine();

                        while (true) {
                            System.out.print("Masukkan baris: ");
                            baris = sc.nextInt();

                            if (baris >= 1 && baris <= 4) {
                                break;
                            } else {
                                System.out.println("Baris tidak tersedia (harus 1-4)");
                            }
                        }
                        
                        while (true) {
                            System.out.print("Masukkan kolom: ");
                            kolom = sc.nextInt();

                            if (kolom >= 1 && kolom <= 2) {
                                break;
                            } else {
                                System.out.println("Kolom tidak tersedia (harus 1-2)");
                            }
                        }
                        sc.nextLine();

                        penonton[baris - 1][kolom - 1] = nama;
                        System.out.print("Input penonton lainnya? (y/n): ");
                        next = sc.nextLine();

                        if (next.equalsIgnoreCase("n")) {
                            break;
                        }
                        break;
                    }
                case 2:
                    System.out.println("\nDaftar Penonton:");
                    for (int i = 0; i < penonton.length; i++) {
                        for (int j = 0; j < penonton[i].length; j++) {
                            
                                System.out.print(penonton[i][j] + "\t");
                            
                        }
                        System.out.println();
                    }
                    System.out.println();
                    break;

                case 3:
                    // ===== KELUAR =====
                    System.out.println("Terima kasih!");
                    return;
            }
        }
    }
}