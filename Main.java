public class Main {
    public static void main(String[] args) {
        Mobil mbl = new Mobil();
        Supir spr = new Supir();
        Penyewa p = new Penyewa();
        Penyewaan pnw = new Penyewaan();

        p.setNama_penyewa("Dudung");
        p.setNohp_penyewa("85321454");
        p.setAlamat_penyewa("Bandung");
        mbl.setMerk("Avanza");
        mbl.setNopol("AB 1762 AW");
        mbl.setHarga_sewa(300.000);
        spr.setNama_supir("-");
        pnw.setTujuan("Gunung Kidul");
        pnw.setTglsewa("17 November 2022");
        pnw.setLamasewa(2);
        pnw.getTotal();

        System.out.println("Nama penyewa        : "+p.getNama_penyewa());
        System.out.println("No Hp               : "+p.getNohp_penyewa());
        System.out.println("Alamat              : "+p.getNohp_penyewa());
        System.out.println("Mobil yang disewa   : "+mbl.getMerk());
        System.out.println("Tujuan              : "+pnw.getTujuan());
        System.out.println("Tanggal sewa        : "+pnw.getTglsewa());
        System.out.println("Nopol               : "+mbl.getNopol());
        System.out.println("Total Pembayaran    : "+pnw.getTotal());

    }
}