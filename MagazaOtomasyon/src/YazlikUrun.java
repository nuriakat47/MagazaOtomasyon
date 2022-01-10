import java.util.Scanner;

public class YazlikUrun extends Urun {
	

	public YazlikUrun(String size, String fiyat, String renk, String kumasturu) {
		super(size, fiyat, renk, kumasturu);
		// TODO Auto-generated constructor stub
	}
	Scanner scan=new Scanner(System.in);
	public void urunbilgi() {
		System.out.println("Yazlýk Ürünler Reyonuna Hoþgeldiniz");
		System.out.println("Yaz Sezonunda Olmadýðýmýz Ýçin Yaz Sezonu Ürünlerimiz Ýndirimlidir.A");
		System.out.println("Ürünleri Görmek Ýçin 1'e Basýn");
		
		int selectyazlik=scan.nextInt();
		
		while(selectyazlik<1||selectyazlik>1) {
			
			System.out.println("Geçerli Bir Tuþlama Yapýnýz.");
			selectyazlik=scan.nextInt();
		}
		if(selectyazlik==1) {
			
			System.out.println("T-Shirt Bedenleri:"+this.getSize());
			System.out.println("T-Shirt Fiyatý:"+this.getFiyat());
			System.out.println("T-Shirt Renkleri:"+this.getRenk());
			System.out.println("T-Shirt Kumaþ Türü:"+this.getKumasturu());
			System.out.println("================================================");
			System.out.println("Gömlek Bedenleri:"+this.getSize());
			System.out.println("Gömlek Fiyatý:"+this.getFiyat());
			System.out.println("Gömlek Renkleri:"+this.getRenk());
			System.out.println("Gömlek Kumaþ Türü:"+this.getKumasturu());
			System.out.println("================================================");
			System.out.println("Pantolon Bedenleri: M-l-XL");
			System.out.println("Pantolon Fiyatý: 85TL");
			System.out.println("Pantolon Renkleri: Lacivert,Gri,");
			System.out.println("Pantolon Kumaþ Türü: Kot,Keten ");
			
	
		}
	
			
	}

}
