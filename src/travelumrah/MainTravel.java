package travelumrah;

import java.util.Scanner;

public class MainTravel {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        try {

            System.out.println("========================================");
            System.out.println(" SISTEM MANAJEMEN TRAVEL UMRAH & HAJI");
            System.out.println("========================================");

            System.out.print("Jumlah Jamaah : ");
            int jumlah = Integer.parseInt(input.nextLine());

            JamaahTravel[] data = new JamaahTravel[jumlah];

            for (int i = 0; i < data.length; i++) {

                System.out.println("\nData Jamaah Ke-" + (i + 1));

                System.out.print("Nama          : ");
                String nama = input.nextLine();

                System.out.print("NIK           : ");
                String nik = input.nextLine();

                System.out.print("Paket (Umrah/Haji) : ");
                String paket = input.nextLine();

                System.out.print("Lama Perjalanan : ");
                int hari = Integer.parseInt(input.nextLine());

                data[i] = new JamaahTravel(nama, nik, paket, hari);

            }

            System.out.println("\n========================================");
            System.out.println("DATA SELURUH JAMAAH");
            System.out.println("========================================");

            for (JamaahTravel j : data) {

                System.out.println(j.tampilInfo("Ustadz Ahmad"));

                System.out.println("--------------------------------------");

            }

        } catch (Exception e) {

            System.out.println("Terjadi Kesalahan : " + e.getMessage());

        }

    }

}