import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        try {
            //Membuat objek pembelian
            Pembelian pembelian = new Pembelian("0000119");
            pembelian.cetakFaktur();

            //Tampilan untuk menginput data
            System.out.println("========Input data pembelian========");
            System.out.println("");
            System.out.print("Nama Pelanggan\t: ");
            String namaPelanggan = scanner.next();

            System.out.print("No Hp\t\t: ");
            String noHp = scanner.next();

            //Membuat objek barang
            Barang barang = new Barang("Indomie", 3000);
            barang.infoBarang();

            //Tampilan untuk menginput dalam jumlah pembelian barang
            System.out.print("\nJumlah Barang\t: ");
            Integer jumlahBarang = scanner.nextInt();
            

            if (jumlahBarang <= 0){
                throw new Exception ();
            }
            
            System.out.println("\n====================================");
            Integer totalBayar = Barang.hargaBarang * jumlahBarang;
            System.out.println("\nTotal Bayar\t: Rp"+totalBayar);
            System.out.println("");   
        }

        //Apabila input jumlah barang tidak berupa angka
        catch (InputMismatchException e){
            System.out.println("\n====================================");
            System.out.println("\nInput Jumlah Barang tidak valid");
            System.out.println("");
        }

        //Apabila input jumlah barang melebihi kapasitas
        catch (Exception e){
            System.out.println("\n====================================");
            System.out.println("\nInput Jumlah Barang tidak valid");
            System.out.println("");
        }

        finally {
            scanner.close(); //Scanner selalu ditutup setelah selesai
        }
    }
}
