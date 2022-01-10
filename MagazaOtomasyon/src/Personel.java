import java.util.Scanner;

public class Personel {
	private String personel_ad;
	private String personel_soyad;
	private int personel_maas;
	private String diller;
	private String telno;
	private String email;
	private Urun urun;


	Scanner scan=new Scanner(System.in);
	public Personel(String personel_ad)
	{
		this.personel_ad = personel_ad;
		this.personel_soyad = personel_soyad;	
		
	}
	



	public void islemsec() {
		
		switch(menusec()) {
			
		
		case 1:
			bilgiPersonel("Nuri", "Akat", "�ngilizce", "nuriakat@gmail.com");
			break;
		case 2 :
			bilgiPersonel("AHMET","Solmaz","Frans�zca", "ahet@gmail.com");
			break;
		case 3:
			bilgiPersonel("Fatih", "�zmen", "Almanca", "fatih@gmail.com");
			default:
			bilgiPersonel("Nuri", "Akat", "�ngilzice", "nuriakat@gmail.com");
			
			
			
			
		}
		System.out.println("Personel Ad�:"+getPersonel_ad() + "\nPersonel Soyad�:"+getPersonel_soyad() + "\nPersonel Dili: "+getDiller() + "\nPersonel email:"+getEmail()+"\nPersonel Maa��:"+getPersonel_maas());
	}
	
	public int menusec() {
		System.out.println("L�tfen hizmet almak istediginiz personeli se�iniz: ");
		System.out.println("1.Nuri");
		System.out.println("2.Ahmet");
		System.out.println("3.Fatih");
		System.out.println("Seciminiz: ");
		
		int personelId=scan.nextInt();
		while (personelId<1 || personelId>3) {
			System.out.println("L�tfen Ge�erli Bir ��lem Se�iniz....");
			personelId=scan.nextInt();

		}
		
		return personelId;

	}
	public void bilgiPersonel(String isim,String soyisim, String dil,String eposta) {
		
		setDiller(dil);
		setEmail(eposta);
		setPersonel_ad(isim);
		setPersonel_soyad(soyisim);
		setPersonel_maas(5000);
	}

	public String getPersonel_ad() {
		return personel_ad;
	}

	public void setPersonel_ad(String personel_ad) {
		this.personel_ad = personel_ad;
	}

	public String getPersonel_soyad() {
		return personel_soyad;
	}

	public void setPersonel_soyad(String personel_soyad) {
		this.personel_soyad = personel_soyad;
	}

	public int getPersonel_maas() {
		return personel_maas;
	}

	public void setPersonel_maas(int personel_maas) {
		this.personel_maas = personel_maas;
	}

	public String getDiller() {
		return diller;
	}

	public void setDiller(String diller) {
		this.diller = diller;
	}

	public String getTelno() {
		return telno;
	}

	public void setTelno(String telno) {
		this.telno = telno;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Urun getUrun() {
		return urun;
	}

	public void setUrun(Urun urun) {
		this.urun = urun;
	}




	

}

		
	
	
	

