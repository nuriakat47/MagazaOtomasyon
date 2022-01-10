import java.util.Scanner;

public class Musteri {

	Scanner scan=new Scanner(System.in);
	public void AnketMagaza()  {
		
		System.out.println("Maðazamýz Hakkýndaki Görüþlerinizi Merak Ediyoruz.");
		System.out.println("Lütfen 1 ile 10 arasýnda bir puanlama yapýnýz.");
		
		
		System.out.print("Puanýnýz: ");  int puan1=scan.nextInt();
		System.out.println("Magaza Hakkýndaki Puanýnýz: "+puan1);
		
		System.out.println("================================================");

		
		System.out.println("Personellerimizi Puanlamanýzý Ýstiyoruz...");
		
		System.out.println("Lütfen 1 ile 10 arasýnda bir puanlama yapýnýz.");

		System.out.println("Puanýnýz: "); int puan2=scan.nextInt();
		System.out.println("Personel Hakkýndaki Puanýnýz: "+puan2);
		
		System.out.println("================================================");

		
		System.out.println("Ürünlerimizi Puanlamanýzý Ýstiyoruz...");
		
		System.out.println("Lütfen 1 ile 10 arasýnda bir puanlama yapýnýz.");

		System.out.println("Puanýnýz: "); int puan3=scan.nextInt();
		System.out.println("Ürünler Hakkýndaki Puanýnýz: "+puan3);
		
		System.out.println("================================================");

		
		System.out.println("Anket Sonuçlarý....");
		System.out.println("Maðaza Puaný:"+puan1);
		System.out.println("Ürün Kalite Puaný:"+puan3);
		System.out.println("Personel Puaný:"+puan2);
		
		System.out.println("Anketimize Katýldýðýnýz Ýçin Teþekkür Eder Yine Bekleriz........");
		
	}
	
	
	
	
}
