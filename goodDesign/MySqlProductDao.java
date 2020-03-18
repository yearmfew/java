public class MySqlProductDao extends BaseProductDao{
	
		public MySqlProductDao(String connectionString){
			super(connectionString);
		}

		@Override

		public void add(Product product){
			System.out.println("MySql Database: " + product.getName() + " eklendi");
		}
	
}