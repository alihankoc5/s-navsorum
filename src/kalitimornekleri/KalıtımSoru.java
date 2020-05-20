package kalitimornekleri;
public class KalıtımSoru {

    public static void main(String[] args) {
        
  
        Ogrenci ogrenciNesne = new Ogrenci("Ali", "Koç",1907, 2014,"Öğrenci",21,0);
        ogrenciNesne.getKimlikBilgileri();
        ogrenciNesne.numaraDeğiştir(79876);
        ogrenciNesne.devamsızlıkKontrol(ogrenciNesne);
        
        
        Personel pr=new Personel("Fatih", "Özkaynak",28,"Doçent Doktor",15,4880);
         pr.getKimlikBilgileri();
         System.out.println("---------------------------------");
         pr.pozisyonDeğiştir("Profesör");
         pr.getKimlikBilgileri();
         pr.devamsızlıkKontrol();
    }
    
}
