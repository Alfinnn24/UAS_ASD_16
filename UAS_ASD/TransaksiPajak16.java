public class TransaksiPajak16 {
    int kode, bulanBayar;
    long nominalBayar, denda;
    Kendaraan16 kendaraan;

    public TransaksiPajak16(long nominalBayar, long denda, int bulanBayar, Kendaraan16 kendaraan) {
        this.nominalBayar = nominalBayar;
        this.denda = denda;
        this.bulanBayar = bulanBayar;
        this.kendaraan = kendaraan;

    }

    public int getKode() {
        return kode;
    }

    public long getNominalBayar() {
        return nominalBayar;
    }

    public void setNominalBayar(long nominalBayar) {
        this.nominalBayar = nominalBayar;
    }

    public long getDenda() {
        return denda;
    }

    public void setDenda(long denda) {
        this.denda = denda;
    }

    public int getBulanBayar() {
        return bulanBayar;
    }

    public void setBulanBayar(int bulanBayar) {
        this.bulanBayar = bulanBayar;
    }

    public Kendaraan16 getKendaraan() {
        return kendaraan;
    }

    public void setKendaraan(Kendaraan16 kendaraan) {
        this.kendaraan = kendaraan;
    }
}