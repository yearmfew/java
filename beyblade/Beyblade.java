
public class Beyblade{


	private String player;
	private int rotSpeed;
	private int attack;


	public Beyblade(String player, int rotSpeed, int attack){
		this.player 	= player;
		this.rotSpeed 	= rotSpeed;
		this.attack 	= attack;
	}

	// get and set for player

	public String getPlayer(){
		return player;
	}

	public void setPlayer(String player){
		this.player = player;
	}

	// get and set for rotSpeed

	public int getRotSpeed(){
		return rotSpeed;
	}

	public void setRotSpeed(int rotSpeed){
		this.rotSpeed = rotSpeed;
	}

	// get and set for attack

	public int getAttack(){
		return attack;
	}

	public void setAttack(int attack){
		this.attack = attack;
	}

	// saldırı metodu

	public void attack(){
		System.out.println(player + " " + attack + " ve " + rotSpeed + " ile saldırıyor..." );
	}

	// kutsal canavar - holy beast

	public void holyBeast(){
		System.out.println("Bu beyblade de kutsal canavar bulunmuyor...");
	}

	// bilgileri gösteren method
	
	public void showInfo(){
		System.out.println("Oyuncu İsmi: " + player);
		System.out.println("Saldırı Gücü: " + attack);
		System.out.println("DÖnüş Hızı: " + rotSpeed);
	}

}
