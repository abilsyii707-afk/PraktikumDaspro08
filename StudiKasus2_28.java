import java.util.Scanner;
public class StudiKasus2_28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input data
        System.out.print("Nama mahasiswa :");
        String nama = sc.nextLine();

        System.out.print("Jenis kegiatan(BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA):");
        String jenisKegiatan = sc.nextLine();

        System.out.print("Jumlah dokumen:");
        int jumlahDokumen = sc.nextInt();

        // Variabel penampung status & syarat
        boolean syaratLomba = false;
        int peringkat = 0;
        int statusPKM = 0;

        // Nested IF (Kedalaman max 3 tingkat)
        if (jenisKegiatan.equalsIgnoreCase("BELMAWA")
            ||
        jenisKegiatan.equalsIgnoreCase("BAKORMA") 
         ||
        jenisKegiatan.equalsIgnoreCase("MANDIRI") ) {

            System.out.print("Peringkat juara:");
            peringkat = sc.nextInt();
            if (peringkat >= 1 && peringkat <=3) {
                syaratLomba = true;
               }
               if (syaratLomba) {
                if (jumlahDokumen == 4) {
                    System.out.println("Status: Berhak memperoleh dana penghargaan.");
                } else {
                    int kurang = 4-
                    jumlahDokumen;
                    System.out.println("Status: Dokumen tidak lengkap(kurang "+ kurang +" dokumen). Dana penghargaan tidak diberikan.");
                   }
                 } else {
                    System.out.println("Status Tidak memperoleh dana penghargaan (hanya untuk Juara 1/2/3).");
                 }
                 } else if (jenisKegiatan.equalsIgnoreCase("PKM")) {
                    System.out.print("Status pendanaan PKM (1 = lolos, 0 = tidak):");
                    statusPKM = sc.nextInt();
                    if (statusPKM == 1) {
                        if(jumlahDokumen == 4) {

                            System.out.println("Status: Berhak memperoleh dana penghargaan (PKM lolos pendanaan).");
                        } else {
                            int kurang = 4 -
                            jumlahDokumen;

                            System.out.println("Status:Dokumen tidak lengkap(kurang" + kurang + "dokumen). Dana penghargaan tidak diberikan.");
                         } 
                         } else {
                            System.out.println("Status:Tidak memperoleh dana penghargaan (PKM tidak lolos pendanaan).");
                         }
                         } else {
                            System.out.println("Status: Tidak memperoleh dana penghargaan (jenis kegiatan tidak termasuk ketentuan).");
                         }
                         sc.close();

    }
}
