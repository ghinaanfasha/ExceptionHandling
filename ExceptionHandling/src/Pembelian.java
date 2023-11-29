public class Pembelian extends Barang implements Faktur{
    String noFaktur;

    //Construktor
    public Pembelian (String noFaktur){
        super(namaBarang, hargaBarang);
        this.noFaktur = noFaktur;
    }

    //Bentuk polimorfisme
    @Override
    public void cetakFaktur(){
        System.out.println("\nNo Faktur\t: "+ noFaktur);
        System.out.println("");        
    }
}
