
package if1.pkg10118042.latihan52.siapakamu;

/**
 * @author
 * Nama  : Dhimas Aji Ghairrahmat
 * Kelas : IF1
 * NIM   : 10118042
 * Deskripsi Program : Program ini berfungsi untuk Menjelaskan Siapa Kamu
 */
public class IF110118042Latihan52SiapaKamu {

    public static void main(String[] args) {
     
        Dosen dosen = new Dosen();
        dosen.setNip("41227829930");
        dosen.setNama("Rizki Adam Kurniawan");
        dosen.setUmur(27);
        dosen.setMataKuliah("PBO");

        System.out.println("NIP DOSEN : "+dosen.getNip());
        dosen.siapaKamu();
        dosen.mengajarApa();

        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.setNim("10118042");
        mahasiswa.setNama("Dhimas Aji Ghairrahmat");
        mahasiswa.setUmur(19);
        mahasiswa.setKelas("IF-01");

        System.out.println("\nNIM MAHASISWA : "+mahasiswa.getNim());
        mahasiswa.siapaKamu();
        mahasiswa.kelasApa();
    }
    
}
