
public class Dragon extends Beyblade{
	private String holyBeast;
	private String secretAbility;

	public Dragon(String player, int rotSpeed, int attack, String holyBeast, String secretAbility){
		super(player, rotSpeed, attack);
		this.holyBeast = holyBeast;
		this.secretAbility = secretAbility;
	}


	// get and set for holyBeast

	public String getHolyBeast(){
		return holyBeast;
	}

	public void setHolyBeast(String holyBeast){
		this.holyBeast = holyBeast;
	}

	// get and set for secret ability

	public String getStringAbility(){
		return secretAbility;
	}

	public void setSecretAbility(String secretAbility){
		this.secretAbility = secretAbility;
	}

	// kutsal canavar - holy beast
	@Override
	public void holyBeast(){
		System.out.println(getPlayer() + " " + holyBeast + "ortaya çıkıyor...");
		System.out.println(getPlayer() + " saldırısı Hayalet Kasırgası...");
	}

	// bilgileri gösteren method
	@Override
	public void showInfo(){
		super.showInfo();
		System.out.println("Kutsal Canavar Adı: " + holyBeast);
		System.out.println("Gizli Yetenek: " + secretAbility);
	}

}