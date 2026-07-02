package travelumrah;

public class JamaahTravel extends Jamaah {

    public JamaahTravel(String nama, String nik, String paket, int lamaHari) {
        super(nama, nik, paket, lamaHari);
    }

    public String statusKeberangkatan() {

        if (getPaket().equalsIgnoreCase("Umrah")) {
            return "Keberangkatan Reguler";
        } else {
            return "Keberangkatan Sesuai Kuota";
        }

    }

    public String fasilitas() {

        switch (getPaket().toLowerCase()) {

            case "umrah":
                return "Hotel Bintang 4 + Bus + Makan";

            case "haji":
                return "Hotel Bintang 5 + Bus + Makan + Tenda Mina";

            default:
                return "Belum tersedia";

        }

    }

    // Override
    @Override
    public String tampilInfo() {

        return super.tampilInfo() +
                "\nFasilitas    : " + fasilitas() +
                "\nStatus       : " + statusKeberangkatan() +
                "\nBiaya        : Rp " + String.format("%,.0f", hitungBiaya());

    }

}