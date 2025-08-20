import java.util.Scanner;

public class BelanjaSehari {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //input untuk nama barang 
        System.out.println("nama barang :");
        String barang = input.nextLine();
        String a = "=====================";
        System.out.println(a);
        //input untuk harga barang 
        System.out.println("harga "+ barang);
        int hargaBarang = input.nextInt();
        System.out.println(a);
        //input untuk jumlah barang
        System.out.println("jumlah "+barang);
        int jumlahBarang = input.nextInt();
        System.out.println(a);
        //hitung total 
        int totalHargaBarang = hargaBarang * jumlahBarang;
        System.out.println("total:" + totalHargaBarang);
        System.out.println(a);
        //hitung total 
        int totalBarang = hargaBarang * jumlahBarang;
        System.out.println("total:" + totalBarang);
        System.out.println(a);
        //hitung pembayaran
        System.out.println ("pembayaran");
        int pembayaran = input.nextInt();
        System.out.println(a);
        //hitung kembalian
        int kembalian = pembayaran - totalBarang;
        System.out.println("kembalian:" +kembalian);
    }
}
