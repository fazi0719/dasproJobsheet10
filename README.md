1. Apakah pengisian elemen array harus dilakukan secara berurutan mulai dari indeks ke-0? Jelaskan!
jawab: Tidak, pengisian elemen array tidak harus berurutan mulai dari indeks ke-0. Kita bisa mengisi elemen array secara acak (indeks mana saja) asalkan indeks tersebut valid (berada dalam batas ukuran array).
2. Mengapa terdapat null pada daftar nama penonton?
Jaab:null muncul karena  elemen penonton [3][1] tidak diberi nilai 
3. public class Bioskop06 {
    public static void main(String[] args) {
        
    String [] []  penonton = new String[4][2];

    penonton [0][0] = "Amin";
    penonton [0][1] = "Bena";
    penonton [1][0] = "Candra";
    penonton [1][1] = "Dela";
    penonton [2][0] = "Eka";
    penonton [2][1] = "Farhan";
    penonton [3][0] = "Gisel";
    penonton [3][1] = "Hana";
    

    System.out.printf("%s \t %s\n", penonton[0][0], penonton [0][1] );
    System.out.printf("%s \t %s\n", penonton [1][0], penonton [1][1] );
    System.out.printf("%s \t %s\n", penonton [2][0], penonton [2][1] );
    System.out.printf("%s \t %s\n",penonton  [3][0], penonton [3][1]);
    
    }
}

4. Jelaskan fungsi dari penonton.length dan penonton[0].length! Apakah penonton[0].length, penonton[1].length, penonton[2].length, dan
penonton[3].length memiliki nilai yang sama? Mengapa?
Jawab: - penonton.length menunjukkan jumlah baris pada array 2 dimensi
       - penonton[0].length adalah jumlah kolom pada baris ke-0
       - Penonton[0].length, penonton[1].length, penonton[2].length, dan penonton[3].length memiliki nilai yang sama yaitu 2. Karena array penonton dibuat dengan ukuran [4][2] artinya ada 4 baris dan setiap baris memiliki 2 kolom

public class Bioskop06 {
    public static void main(String[] args) {
        
    String [] []  penonton = new String[4][2];

    penonton [0][0] = "Amin";
    penonton [0][1] = "Bena";
    penonton [1][0] = "Candra";
    penonton [1][1] = "Dela";
    penonton [2][0] = "Eka";
    penonton [2][1] = "Farhan";
    penonton [3][0] = "Gisel";
    penonton [3][1] = "Hana";


    System.out.printf("%s \t %s\n", penonton[0][0], penonton [0][1] );
    System.out.printf("%s \t %s\n", penonton [1][0], penonton [1][1] );
    System.out.printf("%s \t %s\n", penonton [2][0], penonton [2][1] );
    System.out.printf("%s \t %s\n",penonton  [3][0], penonton [3][1]);

    System.out.println(penonton.length);
    System.out.println(penonton [0].length);
    System.out.println(penonton [1].length);
    System.out.println(penonton [2].length);
    System.out.println(penonton [3].length);
    }
}

5. public class Bioskop06 {
    public static void main(String[] args) {
        
    String [] []  penonton = new String[4][2];

    penonton [0][0] = "Amin";
    penonton [0][1] = "Bena";
    penonton [1][0] = "Candra";
    penonton [1][1] = "Dela";
    penonton [2][0] = "Eka";
    penonton [2][1] = "Farhan";
    penonton [3][0] = "Gisel";
    penonton [3][1] = "Hana";


    System.out.printf("%s \t %s\n", penonton[0][0], penonton [0][1] );
    System.out.printf("%s \t %s\n", penonton [1][0], penonton [1][1] );
    System.out.printf("%s \t %s\n", penonton [2][0], penonton [2][1] );
    System.out.printf("%s \t %s\n",penonton  [3][0], penonton [3][1]);

   
     System.out.println(penonton.length);
    for (int i = 0; i<penonton.length; i++ ){
        System.out.println("panjang baris ke- " + (i+1)+ " : " + penonton[i].length);

    }
    }
}

6. public class Bioskop06 {
    public static void main(String[] args) {
        
    String [] []  penonton = new String[4][2];

    penonton [0][0] = "Amin";
    penonton [0][1] = "Bena";
    penonton [1][0] = "Candra";
    penonton [1][1] = "Dela";
    penonton [2][0] = "Eka";
    penonton [2][1] = "Farhan";
    penonton [3][0] = "Gisel";
    penonton [3][1] = "Hana";


    System.out.printf("%s \t %s\n", penonton[0][0], penonton [0][1] );
    System.out.printf("%s \t %s\n", penonton [1][0], penonton [1][1] );
    System.out.printf("%s \t %s\n", penonton [2][0], penonton [2][1] );
    System.out.printf("%s \t %s\n",penonton  [3][0], penonton [3][1]);

   
     System.out.println(penonton.length);
    for (String [] barisPenonton : penonton ){
        System.out.println("panjang baris " + barisPenonton.length);

    }
    }
}

7. public class Bioskop06 {
    public static void main(String[] args) {
        
    String [] []  penonton = new String[4][2];

    penonton [0][0] = "Amin";
    penonton [0][1] = "Bena";
    penonton [1][0] = "Candra";
    penonton [1][1] = "Dela";
    penonton [2][0] = "Eka";
    penonton [2][1] = "Farhan";
    penonton [3][0] = "Gisel";
    penonton [3][1] = "Hana";


    System.out.printf("%s \t %s\n", penonton[0][0], penonton [0][1] );
    System.out.printf("%s \t %s\n", penonton [1][0], penonton [1][1] );
    System.out.printf("%s \t %s\n", penonton [2][0], penonton [2][1] );
    System.out.printf("%s \t %s\n",penonton  [3][0], penonton [3][1]);

   
     System.out.println(penonton.length);
    for (String [] barisPenonton : penonton ){
        System.out.println("panjang baris " + barisPenonton.length);

    }
    System.out.println(" Penonton pada baris ke-3 : ");
    for ( int i = 0; i< penonton[2].length; i++){
        System.out.println (penonton [2][i]);
    }
    }
}

10. Menurut Anda, apa kekurangan dan kelebihan foreach loop dibandingkan dengan for loop?
jawab: Kelebihan foreach adalah sintaksisnya yang lebih sederhana, lebih mudah dibaca, dan otomatis mengelola indeks, sehingga tidak perlu khawatir tentang i atau i++ saat mengulang elemen, dan sangat cocok untuk array asosiatif. Kekurangannya, foreach tidak memberikan kontrol untuk menghentikan iterasi di tengah jalan (seperti break), dan umumnya kurang efisien dibandingkan for loop standar untuk tugas-tugas yang membutuhkan modifikasi pada indeks atau operasi yang kompleks. 
11. Berapa indeks baris maksimal untuk array penonton?
jawab: jumalh total baris - 1,jadi indeks baris max adalah 3
12. Berapa indeks kolom maksimal untuk array penonton?
jawab: indkes kolom mx adalah 1
13. Apa fungsi dari String.join()?
jawab: Fungsi string.join() digunakan untuk menggabungkan elemen dari suatu iterable (seperti daftar atau array) menjadi satu string tunggal, dengan pemisah yang ditentukan di antara setiap elemen. Contohnya, ", ".join(["apel", "jeruk"]) akan menghasilkan string "apel, jeruk"


