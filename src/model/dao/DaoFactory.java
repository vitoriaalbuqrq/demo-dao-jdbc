package model.dao;

import model.dao.impl.SellerDaoJDBC;

/*a classe vai expor um metodo que retorna o 
tipo da interface mas internamente ela instancia uma implementação.*/

public class DaoFactory {

	public static SellerDao createSellerDao() {
		return new SellerDaoJDBC();
	}
}
