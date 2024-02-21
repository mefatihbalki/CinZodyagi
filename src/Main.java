import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int year,kalan;

        //Kullanıcı Girdi Noktası
        Scanner input = new Scanner(System.in);
        System.out.print("Doğdunuz Yıl: ");
        year = input.nextInt();
        //Zodyak Dizgisi
        String[] zodyak = {"Maymun", "Horoz", "Köpek", "Domuz", "Fare", "Öküz", "Kaplan", "Tavşan", "Ejderha", "Yılan", "At", "Koyun"};

        //Bölme işlemi sonucuna göre yapılan yönlendirme
        kalan =(year%12);

        //if-else başlangıç noktası
        String burc = "";

        if (kalan ==0) {
            burc = "Maymun";
        }else if (kalan ==1){
            burc = "Horoz";
        }else if (kalan ==2){
            burc = "Köpek";
        }else if (kalan ==3){
            burc = "Domuz";
        }else if (kalan ==4){
            burc = "Fare";
        }else if (kalan ==5){
            burc = "Öküz";
        }else if (kalan ==6){
            burc = "Kaplan";
        }else if (kalan ==7){
            burc = "Tavşan";
        }else if (kalan ==8){
            burc = "Ejderha";
        }else if (kalan ==9){
            burc = "Yılan";
        }else if (kalan ==10){
            burc = "At";
        }else if (kalan ==11){
            burc = "Koyun";
        }
        //program çıktı noktası
        System.out.println("Çin Zodyağınız: " + burc);
        //program bitiş
    }
}