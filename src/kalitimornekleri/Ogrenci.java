package kalitimornekleri;

public class Ogrenci extends Personel {

    private int ogrenciNo = 0;
    private int devamsızlık = 0;

    public Ogrenci() {
       super();
    }

    public Ogrenci(String adi, String soyadı, int yasi, int ogrenciNo,String pozisyon,int devamsızlık,int maaş) {

        super(adi, soyadı, yasi,pozisyon,devamsızlık,maaş);
        this.ogrenciNo=ogrenciNo;
        this.devamsızlık=devamsızlık;
    }
    
    public int getOgrenciNo() {
        return ogrenciNo;
    }

    public void setOgrenciNo(int ogrenciNo) {
        if (ogrenciNo < 0) {
            ogrenciNo = 0;
        } else {
            this.ogrenciNo = ogrenciNo;
        }
    }

    @Override
    public void getKimlikBilgileri() {
        super.getKimlikBilgileri(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Ögrenci No: " + this.ogrenciNo);
    }
    
    public void pozisyonDeğiştir() {
         System.out.println("Öğrencilerde bu özellik kullanılamaz.");
         
    }

    public void numaraDeğiştir(int yeni_numara) {
        if(yeni_numara < 0 ) {
            System.out.println("Numara 0'dan küçük olamaz.");       
        }else{
            System.out.println("Numara değiştiriliyor.");
            this.ogrenciNo=yeni_numara;
            System.out.println("Yeni Numara: " + ogrenciNo);
        }
        
       
        
        
    }

   
    public void devamsızlıkKontrol(Personel öğrenci) {
        int devamsızlık_hakkı=20;
        if(devamsızlık > 0 ) {
            if (devamsızlık > 20) {
                System.out.println("Sınıfta Kaldınız.Devamsızlığınız " + devamsızlık + " gün");
            }
            else{
                System.out.println("Kalan devamsızlık hakkınız: " + (devamsızlık_hakkı - devamsızlık));
            }
        }else if(devamsızlık < 0) {
            System.out.println("Devamsızlık 0'dan küçük olamaz.");
            }
        else {
            System.out.println("Hiç devamsızlığı yok.");
        }
        
        
    }

        
    }
   




