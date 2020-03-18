
public class Product{
		private int id;
		private String name;
		private int price;

		public Product(int id, String name, int price){
			this.id 	= id;
			this.name 	= name;
			this.price 	= price;
		}


		// getter and setter for id
		public int getId(){
			return id;
		}

		public void setId(int id){
			this.id = id;
		}

		// getter and setter for name

		public String getName(){
			return name;
		}

		public void setName(String name){
			this.name = name;
		}

		// getter and setter for price

		public int getPrice(){
			return price;
		}

		public void setPrice(int price){
			this.price = price;
		}

}