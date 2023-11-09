import java.util.Scanner ;

public class project2ödev {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int sayi ;
        int toplam = 0;

        System.out.print("Sayı Giriniz: ");
        sayi = reader.nextInt();

        while (sayi%2 == 0){
            if (sayi%4 == 0){
                toplam += sayi ;
            }    
            System.out.print("Sayı Giriniz: ");
            sayi = reader.nextInt();    
            
        }
        System.out.println("Çift sayı giriniz.");
        System.out.println(toplam);


        reader.close();


















    }
}
