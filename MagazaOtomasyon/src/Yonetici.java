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
	YazlikUrun yazlikurun=new YazlikUrun("M-L", "100 TL Yerine 50 TL", "Kýrmýzý,Mavi Ve Siyah", "Pamuk, Kot");
	KislikUrunler kislikurunler=new KislikUrunler("S-M-L-XL-XXL", "100-450TL", "Mavi-Siyah-Pembe-Kýrmýzý-Lacivert", "Yün Kumaþ", "Kalýn Kýþlýk Ürün");
	Stok stok=new Stok(100, "Tshirt");
	public void login() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Maðazamýza Hoþgeldiniz....");
		System.out.println("================================================");
		System.out.println("Ýsminizi Giriniz");
		String personelismi=scan.nextLine();
		personel.islemsec();
		System.out.println("================================================");
		start();
		String islemismi=scan.nextLine();
	
	}
	

	public int start() {
		
		System.out.println();
		System.out.println("================================================");
		System.out.println("Hangi Departmana Giriþ Yapmak Ýstersiniz");
		System.out.println("1.Yönetici Departmaný");
		System.out.println("2.Alýþveriþ Departmaný");
		System.out.println("3.Müþteri Memnuniyeti Departmaný");
		
		int selectdepartment=scan.nextInt();
		
		
		while(selectdepartment<0||selectdepartment>3) {
			
			System.out.print("Hatalý Giriþ Yaptýnýz.(1-2-3) den birsini seçiniz: ");
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
		System.out.println("2.Stok Çýkar");
		System.out.println("3.Personele Zam Yap");
		System.out.println("4.Aylýk Kar Hesapla");
		System.out.println("5.Yýllýk Ciro Hesapla");
		System.out.println("6.Magaza Personel Bilgileri");
		System.out.println("7.Bir Önceki Menu Ýçin 7'ye Basýnýz");

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
			System.out.println("Lütfen Geçerli Bir Ýþlem Seçiniz....");
			islemstarsecim=scan.nextInt();
		
			}
		return islemstarsecim;
		}
	


	public int islemsecpersonel() {
		while(true) {
		System.out.println("1.Ürünlerin Fiyatýný Öðrenmek için Basýnýz....");
		System.out.println("2.Beden Bilgisi Öðren");
		System.out.println("3.Deðiþim Þartlarýný Öðren");
		System.out.println("4.Mesai Saatlerini Öðren");
		System.out.println("5.Ýndirimli Ürünleri Göster");
		System.out.println("6.Sezon Ürünleri Göster");
		System.out.println("7.Çýkýþ Ýçin Basýnýz..");
		System.out.println("================================================");
		
		int secimpers=scan.nextInt();
		if(secimpers==1) {

			System.out.println("Kazak: 75TL\n"
					+ "Mont: 100TL\n"
					+ "T-Shirt: 30TL\n"
					+ "Pantolon: 90Tl\n"
					+ "Ayakkabýlar: 100-500 TL Arasýnda deðiþiyor.\n"
					+ "Cüzdan: 55-250 TL\n");
			System.out.println("================================================");
			
		}
		else if(secimpers==2) {
			
			System.out.println("Kazak Bedenleri: XS S M L\n"
					+ "Mont Bedenleri: M L\n"
					+ "Pantolon Bedenleri: S M L\n"
					+ "Ayakkabý Numaralarý: 36-37-38-39-40-42-43-44\n");
			System.out.println("================================================");
				
		}
		else if(secimpers==3) {
			System.out.println("================================================");
			System.out.println("Deðiþim Yapabilmeniz Ýçin Gerekli Þartlar");
			System.out.println("1.Fiþiniz Olmadan Deðiþim Yapamazsýnýz.\n"
					+ "2.Aldýðýnýz Ürünü Kullanmamanýz Gerekli\n"
					+ "3.Ürünü Aldýktan Sonra 15 Gün Ýçersinde Deðiþim Yapabilirsiniz..");
		}
		else if(secimpers==4) {
			
			System.out.println("Maðazamýzýn Çalýþma Saatleri:\n"
					+ "Sabah: 08:00\n"
					+ "Akþam: 21.00");
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
				System.out.println("Lütfen Geçerli Bir Ýþlem Seçiniz....");
				islempersonelsecim=scan.nextInt();

		}
		
		
		return islempersonelsecim;
		}
		
	}
	public int musterislem() {
		System.out.println("Magaza Memnuniyet Anketine Giriþ Ýçin 1'e Basýn..");
		
		
		int islemmusteri=scan.nextInt();
		while(true) {
		if(islemmusteri==1) {
			
			musteri.AnketMagaza();
		
			
			
		}
		while (islemmusteri<1 || islemmusteri>3) {
			System.out.println("Lütfen Geçerli Bir Ýþlem Seçiniz....");
			islemmusteri=scan.nextInt();

		}
	
		return islemmusteri;
		
		}
	}
	
	public void zamYap() {
		int maas=5000;
		System.out.println("Bu Yýl Personele Yapýlacak Olan Zam Oranýný Giriniz");
		int zamyaptir=scan.nextInt();
		System.out.println("Personele %" + zamyaptir + " Oranýnda Zam Yapýlýyor.");
		
		System.out.println("Yapýlan Zam Sonucu Oluþan Yeni Bilanço.");
		System.out.println("NURÝ AKAT ESKÝ MAAÞ: " + maas);
		System.out.println("NURÝ AKAT YENÝ MAAÞ: " + (maas+maas*zamyaptir/100) );	
	}	
		public void aylikgiderhesabi() {
			System.out.println("Bu Ay Maðazamýzýn Kazandýðý Yaklaþýk Parayý Öðrenmek 7 Günlük Kazancý Giriniz.");	
			int day1=scan.nextInt();
			int day2=scan.nextInt();
			int day3=scan.nextInt();
			int day4=scan.nextInt();
			int day5=scan.nextInt();
			int day6=scan.nextInt();
			int day7=scan.nextInt();
			

			
			int oratalmayedigunluk=day1+day2+day3+day4+day5+day6+day7;
			System.out.println("Sonucu Görmek Ýçin 1'e Basýnýz");
			int sonucgor=scan.nextInt();
			if(sonucgor==1) {
				System.out.println("Magazamýzýn Yaklaþýk Aylýk Kazancý: "+oratalmayedigunluk*4);
			}
			System.out.println("================================================");

		}public void yiilikkazanchesabi() {
			System.out.println("Yýllýk Kazancý Hesaplamak Ýçin Öncelikle Aylýk Kazancý Hesaplayýn..");
			System.out.println("Bu Ay Maðazamýzýn Kazandýðý Yaklaþýk Parayý Öðrenmek 7 Günlük Kazancý Giriniz.");	
			int day1=scan.nextInt();
			int day2=scan.nextInt();
			int day3=scan.nextInt();
			int day4=scan.nextInt();
			int day5=scan.nextInt();
			int day6=scan.nextInt();
			int day7=scan.nextInt();
			

			
			int oratalmayedigunluk=day1+day2+day3+day4+day5+day6+day7;
			System.out.println("Sonucu Görmek Ýçin 1'e Basýnýz");
			int sonucgor=scan.nextInt();
			if(sonucgor==1) {
				System.out.println("Magazamýzýn Yaklaþýk Aylýk Kazancý: "+oratalmayedigunluk*4);
				System.out.println("================================================");

				System.out.println("Yýllýk Hesabý Görmek Ýçin 1'e Basýnýz");
				int sonucgor2=scan.nextInt();
		if(sonucgor2==1) {
				System.out.println("Maðazamýzýn Yýllýk Geliri: " + oratalmayedigunluk*36);
		}
		
	}
			

	}
		public void hangipersonelislemsec() {
			switch(personelsecim()) {
				
			
			case 1:
				personelýnfos("Ýngilizce", "nuriakat028@gmail.com", "Nuri", "Akat", 5000);
				break;
			case 2 :
				personelýnfos("Fransýzca", "burak@gmail.com", "Burak", "Vatan", 10850);
				break;
			case 3:
				personelýnfos("Türkçe", "ankaralý@gmail.com", "Enes", "AGU", 7500);
				break;
			case 4:
				personelýnfos("Türkçe", "mehemt@gmail.com", "Mehmet ", "AKAT", 4000);
			break;
			case 5:
				personelýnfos("Türkçe", "memati@gmail.com", "Memati", "Baþ", 7500);
					break;
			case 6:
				personelýnfos("Türkçe", "abdülhey@gmail.com", "Abdülhey", "Çoban", 7500);
				break;
				
				default:
				System.out.println("Geçersiz Ýþlem Yaptýnýz....");
				
				
				
			}
			System.out.println("Personel Adý:"+getPersonel_ad() + "\nPersonel Soyadý:"+getPersonel_soyad() + "\nPersonel Dili: "+getDiller() + "\nPersonel email:"+getEmail()+"\nPersonel Maaþý:"+getPersonel_maas());
		}
		
		
	
		public  void personelýnfos(String dil1,String eposta1,String isim1,String soyisim1,int maas1) {
			
			setDiller(dil1);
			setEmail(eposta1);
			setPersonel_ad(isim1);
			setPersonel_soyad(soyisim1);
			setPersonel_maas(5000);

		}public int personelsecim() {
			System.out.println("Bilgilerine Ulaþmak Ýstediðiniz Personeli Seçiniz ");
			System.out.println("Yönetici 1: ");
			System.out.println("Yönetici 2: ");
			System.out.println("Personel 1: ");
			System.out.println("Personel 2: ");
			System.out.println("Personel 3: ");
			System.out.println("Personel 4: ");
			System.out.println("Seciminiz: ");
			
			int personelId=scan.nextInt();
			while (personelId<1 || personelId>6) {
				System.out.println("Lütfen Geçerli Bir Ýþlem Seçiniz....");
				personelId=scan.nextInt();

			}
			
			return personelId;

		}
		
		
}