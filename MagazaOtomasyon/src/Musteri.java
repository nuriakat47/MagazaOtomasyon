import java.util.Scanner;

public class Musteri {

	Scanner scan=new Scanner(System.in);
	public void AnketMagaza()  {
		
		System.out.println("Ma�azam�z Hakk�ndaki G�r��lerinizi Merak Ediyoruz.");
		System.out.println("L�tfen 1 ile 10 aras�nda bir puanlama yap�n�z.");
		
		
		System.out.print("Puan�n�z: ");  int puan1=scan.nextInt();
		System.out.println("Magaza Hakk�ndaki Puan�n�z: "+puan1);
		
		System.out.println("================================================");

		
		System.out.println("Personellerimizi Puanlaman�z� �stiyoruz...");
		
		System.out.println("L�tfen 1 ile 10 aras�nda bir puanlama yap�n�z.");

		System.out.println("Puan�n�z: "); int puan2=scan.nextInt();
		System.out.println("Personel Hakk�ndaki Puan�n�z: "+puan2);
		
		System.out.println("================================================");

		
		System.out.println("�r�nlerimizi Puanlaman�z� �stiyoruz...");
		
		System.out.println("L�tfen 1 ile 10 aras�nda bir puanlama yap�n�z.");

		System.out.println("Puan�n�z: "); int puan3=scan.nextInt();
		System.out.println("�r�nler Hakk�ndaki Puan�n�z: "+puan3);
		
		System.out.println("================================================");

		
		System.out.println("Anket Sonu�lar�....");
		System.out.println("Ma�aza Puan�:"+puan1);
		System.out.println("�r�n Kalite Puan�:"+puan3);
		System.out.println("Personel Puan�:"+puan2);
		
		System.out.println("Anketimize Kat�ld���n�z ��in Te�ekk�r Eder Yine Bekleriz........");
		
	}
	
	
	
	
}
