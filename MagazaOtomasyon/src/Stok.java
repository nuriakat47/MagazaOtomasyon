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
		System.out.println("Stoklara Eklemek �stedi�iniz �r�n�n Miktar�n� Ve �smini Giriniz:");
		this.urunmiktari=scan.nextInt();
		this.urunismi=scan.nextLine();
		System.out.println(urunismi + " Sto�unuz:" + stokshirt);

		System.out.println("Stoklar�n�za "+ urunmiktari+ " adet"+ urunismi + " eklenmi�tir.");
		
		System.out.println("Yeni" + urunismi + " Sto�unuz: " + (stokshirt+urunmiktari));
}
	}
public void StokCikar() {
	int stokshirt=500;
	System.out.println("================================================");
	System.out.println("Stoklardan ��karmak �stedi�iniz �r�n�n Miktar�n� Ve �smini Giriniz:");
	this.urunmiktari=scan.nextInt();
	this.urunismi=scan.nextLine();
	System.out.println(urunismi + " Sto�unuz:" + stokshirt);

	System.out.println("Stoklar�n�zdan "+ urunmiktari+ " adet"+ urunismi + " ��kart�lm��t�r.");
	
	System.out.println("Yeni" + urunismi + " Sto�unuz: " + (stokshirt-urunmiktari));
	

}
}
