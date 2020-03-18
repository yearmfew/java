import java.util.Scanner;

public class main{
	public static void main (String[] args){

		System.out.println("Beyblade Programına hoşgeldiniz");

		System.out.println("Çıkış için q ya basın");

		Scanner scanner = new Scanner(System.in);

		while(true){
			System.out.println("Hangi Beyblade i üretmek istiyorsunuz?");
			String islem = scanner.nextLine();

			if (islem.equals("q")){
				System.out.println("Programdan çıkılıyor...");
				break;
			}
			else{
				Producer producer = new Producer();
				Beyblade beyblade = producer.produce(islem);

				if(beyblade == null){
					System.out.println("Lütfen geçerli bir beyblade ismi giriniz...");
				}

				else {
					beyblade.showInfo();
					beyblade.attack();
					beyblade.holyBeast();  
				}
			}

		}



	}
}