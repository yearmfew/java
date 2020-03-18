public class BaseProductDao{
	// Write your codes here...
	private String connectionString;

	public BaseProductDao(String connectionString){
		this.connectionString = connectionString;
	}

	// getter and setter for connectionString
	public String getConnectionString(){			
		return connectionString;
	}

	public void setConnectionString(String connectionString){
		this.connectionString = connectionString;
	}

	public void add(Product product){
		System.out.println("Default Database: " + product.getName());
		
	}


}

