import java.util.Scanner;

public class Stok {
	Scanner scan=new Scanner(System.in);
	
	
	private int urunmiktari;
	private String urunismi;
	
	
	public Stok(int urunmiktari, String urunismi) {
		super();
		this.urunmiktari = urunmiktari;
		this.urunismi = urunismi;
	}
	public int getUrunmiktari() {
		return urunmiktari;
	}
	public void setUrunmiktari(int urunmiktari) {
		this.urunmiktari = urunmiktari;
	}
	public String getUrunismi() {
		return urunismi;
	}
	public void setUrunismi(String urunismi) {
		this.urunismi = urunismi;
	}
	
public void StokEKle() {
	while(true) {
		int stokshirt=500;
		System.out.println("================================================");
		System.out.println("Stoklara Eklemek Ýstediðiniz Ürünün Miktarýný Ve Ýsmini Giriniz:");
		this.urunmiktari=scan.nextInt();
		this.urunismi=scan.nextLine();
		System.out.println(urunismi + " Stoðunuz:" + stokshirt);

		System.out.println("Stoklarýnýza "+ urunmiktari+ " adet"+ urunismi + " eklenmiþtir.");
		
		System.out.println("Yeni" + urunismi + " Stoðunuz: " + (stokshirt+urunmiktari));
}
	}
public void StokCikar() {
	int stokshirt=500;
	System.out.println("================================================");
	System.out.println("Stoklardan Çýkarmak Ýstediðiniz Ürünün Miktarýný Ve Ýsmini Giriniz:");
	this.urunmiktari=scan.nextInt();
	this.urunismi=scan.nextLine();
	System.out.println(urunismi + " Stoðunuz:" + stokshirt);

	System.out.println("Stoklarýnýzdan "+ urunmiktari+ " adet"+ urunismi + " çýkartýlmýþtýr.");
	
	System.out.println("Yeni" + urunismi + " Stoðunuz: " + (stokshirt-urunmiktari));
	

}
}
