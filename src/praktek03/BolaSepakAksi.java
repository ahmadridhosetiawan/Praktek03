package praktek03;

public class BolaSepakAksi {
    public static void main(String[] args) {
        
        BolaSepak bs = new BolaSepak();
        bs.setMerk("Adidas");
        bs.setWarna("Merah");
        bs.setHarga(1000);
       // gak bisa  bs.setJenisBolaVoly();
        
        bs.cetakInfo();
        System.out.print("Merknya \t:");
        System.out.println(bs.getMerk());
        System.out.print("Warnanya \t:");
        System.out.println(bs.getWarna());
        System.out.print("Harganya \t:");
        System.out.println(bs.getHarga());
        
        BolaVoly bv = new BolaVoly();
        
        bv.setMerk("Nike");
        bv.setWarna("Biru");
        bv.setHarga(10000);
        bv.setJenisBolaVoly("Kulit");
        bv.cetakInfo();
        System.out.println("Jenis\t :"+bv.getJenisBolaVoly());
        bv.throttle();
        
        
    }
    
}

