
package if1.pkg10118042.latihan52.siapakamu;


public class Mahasiswa extends Manusia{
    private String nim;
    private String kelas;

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public void kelasApa() {
        System.out.println("Saya "+nama+" umur "+umur+" tahun sedang belajar di kelas "+kelas);
    }
    
    @Override
    public void siapaKamu() {
        System.out.println("Saya Mahasiswa");
    }    
}