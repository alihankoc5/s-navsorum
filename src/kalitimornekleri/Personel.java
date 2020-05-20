package kalitimornekleri;

public class Personel {
    private String adi;
    private String soyadı;
    private int yasi;
    private String pozisyon;
    private int devamsızlık;
    private int maaş;
    
    //default yapılandırıcı
    public Personel(){
        adi="isim yok";
        soyadı="Soyadı yok";
        yasi=0;
        pozisyon="Pozisyon yok";
        maaş= 0;
        devamsızlık=0;
    }

    public String getPozisyon() {
        return pozisyon;
    }

    public void setPozisyon(String pozisyon) {
        this.pozisyon = pozisyon;
    }

    public int getDevamsızlık() {
        return devamsızlık;
    }

    public void setDevamsızlık(int devamsızlık) {
        this.devamsızlık = devamsızlık;
    }

    public int getMaaş() {
        return maaş;
    }

    public void setMaaş(int maaş) {
        this.maaş = maaş;
    }
    
    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getSoyadı() {
        return soyadı;
    }

    public void setSoyadı(String soyadı) {
        this.soyadı = soyadı;
    }

    public int getYasi() {
        return yasi;
    }

    public void setYasi(int yasi) {
        if ( yasi < 0) {
        this.yasi = 0;
        }
        else {
            this.yasi=yasi;
    } }
//parametre alan yapılandırıcı
    public Personel(String adi, String soyadı, int yasi,String pozisyon,int devamsızlık,int maaş) {
        this.adi = adi;
        this.soyadı = soyadı;
        setYasi(yasi);
        this.pozisyon=pozisyon;
        this.devamsızlık=devamsızlık;
        this.maaş=maaş;
    //this.yasi = yasi;
    }
    
    public void getKimlikBilgileri(){
        System.out.println("İsim: " + this.adi);
        System.out.println("Soyad: " + this.soyadı);
        System.out.println("Yaş: " + this.yasi);
        System.out.println("Pozisyon: " + this.pozisyon);
        System.out.println("Maaş: " + this.maaş);
        System.out.println("Devamsızlık Bilgisi(Gün): " + this.devamsızlık);
    }
    
    // toString metodunu çağırıp düzenleyelim
    @Override public String toString(){
        return " Bilgiler: " + adi + " " + soyadı + " " + yasi;
    }
    
    public void pozisyonDeğiştir(String yeni_pozisyon) {
        System.out.println("Yeni Pozisyona Atanıyor " + yeni_pozisyon);
        this.pozisyon = yeni_pozisyon;
        
        
    }
    
    public void devamsızlıkKontrol() {
       if(devamsızlık > 0 ) {
          int kesinti=devamsızlık * 42 ;
          maaş -= kesinti;
           System.out.println(devamsızlık +" gün devamsızlık nedemiyle maaşınızdan " + kesinti + " TL kesinti oldu.");
           System.out.println("Alacak olacağınız maaş: " + maaş);
           }
       else if(devamsızlık < 0) {
           System.out.println("Devamsızlık 0'dan küçük olamaz.");
           
       }
       
       else {
           System.out.println("Hiç devamsızlığı yok.");
       }
    }
    
    
    
    // Fonksİyon 2 
    
       // Fonksİyon 3
}
