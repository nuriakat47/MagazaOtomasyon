import java.util.Scanner;

public class KislikUrunler extends Urun {
	
	
	private String kisurunleri;
	Scanner scan=new Scanner(System.in);
	public KislikUrunler(String size, String fiyat, String renk, String kumasturu,String kisurunleri) {
		super(size, fiyat, renk, kumasturu);
		
		this.kisurunleri=kisurunleri;
	}

	public void Kislikurunlergoster() {
		System.out.println("K��l�k �r�nler Reyonuna Ho�geldiniz.");
		System.out.println("�r�nleri G�rmek ��in 1'e Bas�n�z.");
		
		int selectkislik=scan.nextInt();
		
		while(selectkislik<1||selectkislik>1) {
			
			System.out.println("Ge�erli Bir Tu�lama Yap�n�z.");
			selectkislik=scan.nextInt();
		}
		if(selectkislik==1) {
			
			System.out.println("Kazak Bedenleri:"+this.getSize());
			System.out.println("Kazak Fiyat�:"+this.getFiyat());
			System.out.println("Kazak Renkleri:"+this.getRenk());
			System.out.println("Kazak Kuma� T�r�:"+this.getKumasturu());
			System.out.println("================================================");
			System.out.println("Mont Bedenleri: XS-S-M-L-XL-XXL");
			System.out.println("Mont Fiyat�: 300-600 TL");
			System.out.println("Mont Renkleri: Turuncu-Beyaz-Gri-Mor");
			System.out.println("Mont Kuma� T�r�: Y�n-Pamuk");
			System.out.println("================================================");
			System.out.println("Sweatshirt Bedenleri: M-l-XL");
			System.out.println("Sweatshirt Fiyat�: 85TL");
			System.out.println("Sweatshirt Renkleri: Lacivert,Gri,");
			System.out.println("Sweatshirt Kuma� T�r�: Kot,Keten ");
		}
		
		
	}
	


	public String getKisurunleri() {
		return kisurunleri;
	}

	public void setKisurunleri(String kisurunleri) {
		this.kisurunleri = kisurunleri;
	}

}
