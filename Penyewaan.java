public class Penyewaan {
    private int tglsewa;
    private int lamasewa;
    private String tujuan;
    private int total;

    public int getTglsewa() {
        return tglsewa;
    }

    public void setTglsewa(int tglsewa) {
        this.tglsewa = tglsewa;
    }

    public int getLamasewa() {
        return lamasewa;
    }

    public void setLamasewa(int lamasewa) {
        this.lamasewa = lamasewa;
    }

    public String getTujuan() {
        return tujuan;
    }

    public void setTujuan(String tujuan) {
        this.tujuan = tujuan;
    }

    public int getTotal() {
        total = lamasewa*harga_sewa;
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
