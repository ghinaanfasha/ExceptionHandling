public class Barang {
    static String namaBarang;
    static Integer hargaBarang;

    //Construktor
    public Barang (String namaBarang, Integer hargaBarang){
        Barang.namaBarang = namaBarang;
        Barang.hargaBarang = hargaBarang;
    }

    public void infoBarang (){
        System.out.println("");
        System.out.println("------------------------------------");
        System.out.println("Nama barang\t: " + namaBarang);
        System.out.println("Harga barang\t: Rp" + hargaBarang);
        System.out.println("------------------------------------");
    }
}
