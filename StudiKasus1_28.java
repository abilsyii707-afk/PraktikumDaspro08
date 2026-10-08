import java.util.Scanner;
public class StudiKasus1_28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hargaPerCup = 18000
        int jumlahCup, uangBayar;
        int totalHarga, diskon = 0, totalBayar;
        int kembalian, kurang;

        System.out.print("Masukkan jumlah cup:");
        jumlahCup = sc.nextInt();
        System.out.print("Masukkan uang bayar:");
        uangBayar = sc.nextInt();

        totalHarga = jumlahCup * hargaPerCup;

        if (totalHarga >= 100000) {
            diskon = totalHarga * 10/100;
         } else {
            diskon = 0;
         }

         totalBayar = totalHarga - diskon;

         System.out.println("Total harga:Rp" + totalHarga);
         System.out.println("Diskon   :Rp" +diskon);
         System.out.println("Total bayar :Rp" + totalBayar);

         if (uangBayar >= totalBayar) {
            kembalian = uangBayar - totalBayar;
            System.out.print("Kembalian");
         } else {
            kurang = totalBayar - uangBayar;
            System.out.print("Uang tidak cukup, kurang Rp" +kurang);
         }
         sc.close();
    }
}
