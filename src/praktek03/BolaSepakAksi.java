package praktek03;

public class BolaSepakAksi {
    public static void main(String[] args) {
        
        BolaSepak bs = new BolaSepak();
        bs.setMerk("Adidas");
        bs.setWarna("Merah");
        bs.setHarga(1000);
        
        bs.cetakInfo();
        System.out.print("Merknya \t:");
        System.out.println(bs.getMerk());
        System.out.print("Warnanya \t:");
        System.out.println(bs.getWarna());
        System.out.print("Harganya \t:");
        System.out.println(bs.getHarga());
        
    }
    
}

