import java.util.Scanner;

public class KislikUrunler extends Urun {
	
	
	private String kisurunleri;
	Scanner scan=new Scanner(System.in);
	public KislikUrunler(String size, String fiyat, String renk, String kumasturu,String kisurunleri) {
		super(size, fiyat, renk, kumasturu);
		
		this.kisurunleri=kisurunleri;
	}

	public void Kislikurunlergoster() {
		System.out.println("Kýþlýk Ürünler Reyonuna Hoþgeldiniz.");
		System.out.println("Ürünleri Görmek Ýçin 1'e Basýnýz.");
		
		int selectkislik=scan.nextInt();
		
		while(selectkislik<1||selectkislik>1) {
			
			System.out.println("Geçerli Bir Tuþlama Yapýnýz.");
			selectkislik=scan.nextInt();
		}
		if(selectkislik==1) {
			
			System.out.println("Kazak Bedenleri:"+this.getSize());
			System.out.println("Kazak Fiyatý:"+this.getFiyat());
			System.out.println("Kazak Renkleri:"+this.getRenk());
			System.out.println("Kazak Kumaþ Türü:"+this.getKumasturu());
			System.out.println("================================================");
			System.out.println("Mont Bedenleri: XS-S-M-L-XL-XXL");
			System.out.println("Mont Fiyatý: 300-600 TL");
			System.out.println("Mont Renkleri: Turuncu-Beyaz-Gri-Mor");
			System.out.println("Mont Kumaþ Türü: Yün-Pamuk");
			System.out.println("================================================");
			System.out.println("Sweatshirt Bedenleri: M-l-XL");
			System.out.println("Sweatshirt Fiyatý: 85TL");
			System.out.println("Sweatshirt Renkleri: Lacivert,Gri,");
			System.out.println("Sweatshirt Kumaþ Türü: Kot,Keten ");
		}
		
		
	}
	


	public String getKisurunleri() {
		return kisurunleri;
	}

	public void setKisurunleri(String kisurunleri) {
		this.kisurunleri = kisurunleri;
	}

}
