
public class main{
	public static void main (String[] args){
// Write your codes...

		ProductManager productManager = new ProductManager(new MySqlProductDao("MySql String"));

		productManager.add(new Product(2, "Çikolata", 5));

	}
}