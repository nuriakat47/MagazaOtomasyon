import java.util.Scanner;

public class YazlikUrun extends Urun {
	

	public YazlikUrun(String size, String fiyat, String renk, String kumasturu) {
		super(size, fiyat, renk, kumasturu);
		// TODO Auto-generated constructor stub
	}
	Scanner scan=new Scanner(System.in);
	public void urunbilgi() {
		System.out.println("Yazl�k �r�nler Reyonuna Ho�geldiniz");
		System.out.println("Yaz Sezonunda Olmad���m�z ��in Yaz Sezonu �r�nlerimiz �ndirimlidir.A");
		System.out.println("�r�nleri G�rmek ��in 1'e Bas�n");
		
		int selectyazlik=scan.nextInt();
		
		while(selectyazlik<1||selectyazlik>1) {
			
			System.out.println("Ge�erli Bir Tu�lama Yap�n�z.");
			selectyazlik=scan.nextInt();
		}
		if(selectyazlik==1) {
			
			System.out.println("T-Shirt Bedenleri:"+this.getSize());
			System.out.println("T-Shirt Fiyat�:"+this.getFiyat());
			System.out.println("T-Shirt Renkleri:"+this.getRenk());
			System.out.println("T-Shirt Kuma� T�r�:"+this.getKumasturu());
			System.out.println("================================================");
			System.out.println("G�mlek Bedenleri:"+this.getSize());
			System.out.println("G�mlek Fiyat�:"+this.getFiyat());
			System.out.println("G�mlek Renkleri:"+this.getRenk());
			System.out.println("G�mlek Kuma� T�r�:"+this.getKumasturu());
			System.out.println("================================================");
			System.out.println("Pantolon Bedenleri: M-l-XL");
			System.out.println("Pantolon Fiyat�: 85TL");
			System.out.println("Pantolon Renkleri: Lacivert,Gri,");
			System.out.println("Pantolon Kuma� T�r�: Kot,Keten ");
			
	
		}
	
			
	}

}
