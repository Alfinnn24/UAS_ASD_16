import java.util.ArrayList;
import java.util.List;

public class Main16 {
    public static void main(String[] args) {
         List<Kendaraan16> kendaraan = new ArrayList<>();
        kendaraan.add(new Kendaraan16("IN 4511 VS", "Arta", "Mobil", 2500, 2015, 3));
        kendaraan.add(new Kendaraan16("AB 4321 A", "Wisnu", "Motor", 125, 2010, 2));
        kendaraan.add(new Kendaraan16("B 1234 AG", "Sisa", "Motor", 150, 2020, 1));

        System.out.println("--- Menu ---");
        System.out.println("1. Daftar Kendaraan");
        System.out.println("2. Bayar Pajak");
        System.out.println("3. Tampilkan seluruh transaksi");
        System.out.println("4. Urutkan Transaksi berdasar nama Pemilik");
        System.out.println("5. Keluar");
        System.out.println("Pilih (1-5):");
        System.out.println("++++++++");
        System.out.println("Daftar Kendaraan");
        System.out.println("++++++++++++++++++++++++");
        System.out.println("| Nomor TNKB\tNama Pemilik\tJenis\t|CC kendaraan\t|Tahun\t|Bulan harus Bayar");

        for (Kendaraan16 kendaraan16 : kendaraan) {
            System.out.println("| " + kendaraan16.noTNKB + "\t" + kendaraan16.nama + "\t" + kendaraan16.jenis + "\t|" + kendaraan16.cc + "\t\t|" + kendaraan16.tahun + "\t\t|" + kendaraan16.bulanHarusBayar);
        }
    }
    }
    

