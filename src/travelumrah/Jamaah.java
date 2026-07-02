package travelumrah;

public class Jamaah {

    // Encapsulation
    private String nama;
    private String nik;
    private String paket;
    private int lamaHari;

    // Constructor
    public Jamaah(String nama, String nik, String paket, int lamaHari) {
        this.nama = nama;
        this.nik = nik;
        this.paket = paket;
        this.lamaHari = lamaHari;
    }

    // Mutator
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public void setPaket(String paket) {
        this.paket = paket;
    }

    public void setLamaHari(int lamaHari) {
        this.lamaHari = lamaHari;
    }

    // Accessor
    public String getNama() {
        return nama;
    }

    public String getNik() {
        return nik;
    }

    public String getPaket() {
        return paket;
    }

    public int getLamaHari() {
        return lamaHari;
    }

    // Method
    public double hitungBiaya() {

        if (paket.equalsIgnoreCase("Umrah")) {
            return 35000000;
        } else if (paket.equalsIgnoreCase("Haji")) {
            return 75000000;
        } else {
            return 0;
        }
    }

    // Polymorphism Overloading
    public String tampilInfo(String pembimbing) {

        return tampilInfo() +
                "\nPembimbing : " + pembimbing;

    }

    public String tampilInfo() {

        return "Nama          : " + nama +
                "\nNIK           : " + nik +
                "\nPaket         : " + paket +
                "\nLama          : " + lamaHari + " Hari";
    }

}