package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public class JdbcProductDao implements ProductDao {
	
	public void add(Product product) {
		//sadece db erişim kodları yazılır.SQL
		System.out.println("JDBC ile veritabanına eklendi");
	}
}
