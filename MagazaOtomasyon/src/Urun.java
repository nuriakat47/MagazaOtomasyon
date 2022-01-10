import java.util.Scanner;

public class Urun{
	private String size;
	private String fiyat;
	private String renk;
	private String kumasturu;

	private String Stok;
	Scanner scan=new Scanner(System.in);
	public Urun(String size, String fiyat, String renk, String kumasturu) {
		super();
		this.size = size;
		this.fiyat = fiyat;
		this.renk = renk;
		this.kumasturu = kumasturu;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getFiyat() {
		return fiyat;
	}

	public void setFiyat(String fiyat) {
		this.fiyat = fiyat;
	}

	public String getRenk() {
		return renk;
	}

	public void setRenk(String renk) {
		this.renk = renk;
	}

	public String getKumasturu() {
		return kumasturu;
	}

	public void setKumasturu(String kumasturu) {
		this.kumasturu = kumasturu;
	}


	
	
}