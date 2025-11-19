import java.util.Scanner;
public class Numbers06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    int[][] myNumbers = new int[3][];

    myNumbers[0] = new int[5]; // indeks 0-4
    myNumbers [1] = new int[3]; // indeks 0-2
    myNumbers [2] = new int[1]; // indeks 0

    System.out.println(" Panjang baris 0 : " + myNumbers[0].length);
    System.out.println(" Panjang baris 1 : " + myNumbers[1].length);
    System.out.println(" Panjang baris 2 : " + myNumbers[2].length);

    }
}
