import java.util.Scanner;

import org.w3c.dom.ls.LSOutput;

public class Yonetici extends Personel {
	public Yonetici(String personel_ad) {
		super(personel_ad);
	}

	Personel personel=new Personel(null);
	Scanner scan=new Scanner(System.in);
	Urun urun;
	Personel personel1;
	Musteri musteri=new Musteri();
	YazlikUrun yazlikurun=new YazlikUrun("M-L", "100 TL Yerine 50 TL", "K�rm�z�,Mavi Ve Siyah", "Pamuk, Kot");
	KislikUrunler kislikurunler=new KislikUrunler("S-M-L-XL-XXL", "100-450TL", "Mavi-Siyah-Pembe-K�rm�z�-Lacivert", "Y�n Kuma�", "Kal�n K��l�k �r�n");
	Stok stok=new Stok(100, "Tshirt");
	public void login() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Ma�azam�za Ho�geldiniz....");
		System.out.println("================================================");
		System.out.println("�sminizi Giriniz");
		String personelismi=scan.nextLine();
		personel.islemsec();
		System.out.println("================================================");
		start();
		String islemismi=scan.nextLine();
	
	}
	

	public int start() {
		
		System.out.println();
		System.out.println("================================================");
		System.out.println("Hangi Departmana Giri� Yapmak �stersiniz");
		System.out.println("1.Y�netici Departman�");
		System.out.println("2.Al��veri� Departman�");
		System.out.println("3.M��teri Memnuniyeti Departman�");
		
		int selectdepartment=scan.nextInt();
		
		
		while(selectdepartment<0||selectdepartment>3) {
			
			System.out.print("Hatal� Giri� Yapt�n�z.(1-2-3) den birsini se�iniz: ");
			selectdepartment=scan.nextInt();	
		}
		
		
			if(selectdepartment==1) {
				
				islemsecstart();
			}
		

		else if(selectdepartment==2) {
			
			islemsecpersonel();
			
			}
			
		else if(selectdepartment==3) {
			
			musterislem();
		}
		
		return selectdepartment;
		}
	
		
	public int islemsecstart() {
		System.out.println("1.Stok Ekle");
		System.out.println("2.Stok ��kar");
		System.out.println("3.Personele Zam Yap");
		System.out.println("4.Ayl�k Kar Hesapla");
		System.out.println("5.Y�ll�k Ciro Hesapla");
		System.out.println("6.Magaza Personel Bilgileri");
		System.out.println("7.Bir �nceki Menu ��in 7'ye Bas�n�z");

		int islemstarsecim=scan.nextInt();
		if(islemstarsecim==1) {
		
			stok.StokEKle();
		
		}
		if(islemstarsecim==2) {
			stok.StokCikar();
		}
		else if(islemstarsecim==3) {
			
			zamYap();
		}
		else if(islemstarsecim==4) {
			
			aylikgiderhesabi();
		}
		else if(islemstarsecim==5) {
			
			yiilikkazanchesabi();
		}
		else if(islemstarsecim==7) {
			
			start();
		}
		else if(islemstarsecim==6) {
			hangipersonelislemsec();
		}
		while (islemstarsecim<1 || islemstarsecim>6) {
			System.out.println("L�tfen Ge�erli Bir ��lem Se�iniz....");
			islemstarsecim=scan.nextInt();
		
			}
		return islemstarsecim;
		}
	


	public int islemsecpersonel() {
		while(true) {
		System.out.println("1.�r�nlerin Fiyat�n� ��renmek i�in Bas�n�z....");
		System.out.println("2.Beden Bilgisi ��ren");
		System.out.println("3.De�i�im �artlar�n� ��ren");
		System.out.println("4.Mesai Saatlerini ��ren");
		System.out.println("5.�ndirimli �r�nleri G�ster");
		System.out.println("6.Sezon �r�nleri G�ster");
		System.out.println("7.��k�� ��in Bas�n�z..");
		System.out.println("================================================");
		
		int secimpers=scan.nextInt();
		if(secimpers==1) {

			System.out.println("Kazak: 75TL\n"
					+ "Mont: 100TL\n"
					+ "T-Shirt: 30TL\n"
					+ "Pantolon: 90Tl\n"
					+ "Ayakkab�lar: 100-500 TL Aras�nda de�i�iyor.\n"
					+ "C�zdan: 55-250 TL\n");
			System.out.println("================================================");
			
		}
		else if(secimpers==2) {
			
			System.out.println("Kazak Bedenleri: XS S M L\n"
					+ "Mont Bedenleri: M L\n"
					+ "Pantolon Bedenleri: S M L\n"
					+ "Ayakkab� Numaralar�: 36-37-38-39-40-42-43-44\n");
			System.out.println("================================================");
				
		}
		else if(secimpers==3) {
			System.out.println("================================================");
			System.out.println("De�i�im Yapabilmeniz ��in Gerekli �artlar");
			System.out.println("1.Fi�iniz Olmadan De�i�im Yapamazs�n�z.\n"
					+ "2.Ald���n�z �r�n� Kullanmaman�z Gerekli\n"
					+ "3.�r�n� Ald�ktan Sonra 15 G�n ��ersinde De�i�im Yapabilirsiniz..");
		}
		else if(secimpers==4) {
			
			System.out.println("Ma�azam�z�n �al��ma Saatleri:\n"
					+ "Sabah: 08:00\n"
					+ "Ak�am: 21.00");
		}
		else if(secimpers==5) {
			yazlikurun.urunbilgi();
			
		}
		else if(secimpers==6) {
			kislikurunler.Kislikurunlergoster();
			
		}
		else	if(secimpers==7) {
			
			islemsecpersonel();
		}
		int islempersonelsecim=scan.nextInt();

			while (islempersonelsecim<1 || islempersonelsecim>6) {
				System.out.println("L�tfen Ge�erli Bir ��lem Se�iniz....");
				islempersonelsecim=scan.nextInt();

		}
		
		
		return islempersonelsecim;
		}
		
	}
	public int musterislem() {
		System.out.println("Magaza Memnuniyet Anketine Giri� ��in 1'e Bas�n..");
		
		
		int islemmusteri=scan.nextInt();
		while(true) {
		if(islemmusteri==1) {
			
			musteri.AnketMagaza();
		
			
			
		}
		while (islemmusteri<1 || islemmusteri>3) {
			System.out.println("L�tfen Ge�erli Bir ��lem Se�iniz....");
			islemmusteri=scan.nextInt();

		}
	
		return islemmusteri;
		
		}
	}
	
	public void zamYap() {
		int maas=5000;
		System.out.println("Bu Y�l Personele Yap�lacak Olan Zam Oran�n� Giriniz");
		int zamyaptir=scan.nextInt();
		System.out.println("Personele %" + zamyaptir + " Oran�nda Zam Yap�l�yor.");
		
		System.out.println("Yap�lan Zam Sonucu Olu�an Yeni Bilan�o.");
		System.out.println("NUR� AKAT ESK� MAA�: " + maas);
		System.out.println("NUR� AKAT YEN� MAA�: " + (maas+maas*zamyaptir/100) );	
	}	
		public void aylikgiderhesabi() {
			System.out.println("Bu Ay Ma�azam�z�n Kazand��� Yakla��k Paray� ��renmek 7 G�nl�k Kazanc� Giriniz.");	
			int day1=scan.nextInt();
			int day2=scan.nextInt();
			int day3=scan.nextInt();
			int day4=scan.nextInt();
			int day5=scan.nextInt();
			int day6=scan.nextInt();
			int day7=scan.nextInt();
			

			
			int oratalmayedigunluk=day1+day2+day3+day4+day5+day6+day7;
			System.out.println("Sonucu G�rmek ��in 1'e Bas�n�z");
			int sonucgor=scan.nextInt();
			if(sonucgor==1) {
				System.out.println("Magazam�z�n Yakla��k Ayl�k Kazanc�: "+oratalmayedigunluk*4);
			}
			System.out.println("================================================");

		}public void yiilikkazanchesabi() {
			System.out.println("Y�ll�k Kazanc� Hesaplamak ��in �ncelikle Ayl�k Kazanc� Hesaplay�n..");
			System.out.println("Bu Ay Ma�azam�z�n Kazand��� Yakla��k Paray� ��renmek 7 G�nl�k Kazanc� Giriniz.");	
			int day1=scan.nextInt();
			int day2=scan.nextInt();
			int day3=scan.nextInt();
			int day4=scan.nextInt();
			int day5=scan.nextInt();
			int day6=scan.nextInt();
			int day7=scan.nextInt();
			

			
			int oratalmayedigunluk=day1+day2+day3+day4+day5+day6+day7;
			System.out.println("Sonucu G�rmek ��in 1'e Bas�n�z");
			int sonucgor=scan.nextInt();
			if(sonucgor==1) {
				System.out.println("Magazam�z�n Yakla��k Ayl�k Kazanc�: "+oratalmayedigunluk*4);
				System.out.println("================================================");

				System.out.println("Y�ll�k Hesab� G�rmek ��in 1'e Bas�n�z");
				int sonucgor2=scan.nextInt();
		if(sonucgor2==1) {
				System.out.println("Ma�azam�z�n Y�ll�k Geliri: " + oratalmayedigunluk*36);
		}
		
	}
			

	}
		public void hangipersonelislemsec() {
			switch(personelsecim()) {
				
			
			case 1:
				personel�nfos("�ngilizce", "nuriakat028@gmail.com", "Nuri", "Akat", 5000);
				break;
			case 2 :
				personel�nfos("Frans�zca", "burak@gmail.com", "Burak", "Vatan", 10850);
				break;
			case 3:
				personel�nfos("T�rk�e", "ankaral�@gmail.com", "Enes", "AGU", 7500);
				break;
			case 4:
				personel�nfos("T�rk�e", "mehemt@gmail.com", "Mehmet ", "AKAT", 4000);
			break;
			case 5:
				personel�nfos("T�rk�e", "memati@gmail.com", "Memati", "Ba�", 7500);
					break;
			case 6:
				personel�nfos("T�rk�e", "abd�lhey@gmail.com", "Abd�lhey", "�oban", 7500);
				break;
				
				default:
				System.out.println("Ge�ersiz ��lem Yapt�n�z....");
				
				
				
			}
			System.out.println("Personel Ad�:"+getPersonel_ad() + "\nPersonel Soyad�:"+getPersonel_soyad() + "\nPersonel Dili: "+getDiller() + "\nPersonel email:"+getEmail()+"\nPersonel Maa��:"+getPersonel_maas());
		}
		
		
	
		public  void personel�nfos(String dil1,String eposta1,String isim1,String soyisim1,int maas1) {
			
			setDiller(dil1);
			setEmail(eposta1);
			setPersonel_ad(isim1);
			setPersonel_soyad(soyisim1);
			setPersonel_maas(5000);

		}public int personelsecim() {
			System.out.println("Bilgilerine Ula�mak �stedi�iniz Personeli Se�iniz ");
			System.out.println("Y�netici 1: ");
			System.out.println("Y�netici 2: ");
			System.out.println("Personel 1: ");
			System.out.println("Personel 2: ");
			System.out.println("Personel 3: ");
			System.out.println("Personel 4: ");
			System.out.println("Seciminiz: ");
			
			int personelId=scan.nextInt();
			while (personelId<1 || personelId>6) {
				System.out.println("L�tfen Ge�erli Bir ��lem Se�iniz....");
				personelId=scan.nextInt();

			}
			
			return personelId;

		}
		
		
}