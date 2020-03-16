
public class Producer{

	public Beyblade produce(String beybladeType){

		if (beybladeType.equals("Dragon")){
			return new Dragon("Takao", 800, 300, "Mavi Ejderha", "Kutsal Canavarla Konuşma");
		}

		else if(beybladeType.equals("Dranza")){
			return new Dranza("Kai", 600, 400, "Kırmızı Anka Kuşu");
		}
		else if(beybladeType.equals("Drayga")){
			return new Drayga("Rai", 800, 250, "Beyaz Kaplan");
		}
		else if(beybladeType.equals("Draciel")){
			return new Draciel("Max", 400, 1000, "Kara Kaplumbağa");
		}
		else {
			return null;
		}
	}
}