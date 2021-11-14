package productcrudapp.Dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import productcrudapp.Model.Product;

@Component
public class ProductDao {
	@Autowired
  private HibernateTemplate hibernatetemplate;
	@Transactional
	public void CreteProduct(Product product) {
		this.hibernatetemplate.saveOrUpdate(product);
	}
	// getAll product
	public List<Product> getProducts(){
		List<Product> list=	this.hibernatetemplate.loadAll(Product.class);
		return list;
	}
	// delete the single product
	@Transactional
	public void deleteProduct(int id) {
	Product p=	this.hibernatetemplate.load(Product.class, id);
		this.hibernatetemplate.delete(p);
	}
	// get the single product
	public Product getProduct(int id) {
	Product	p=this.hibernatetemplate.get(Product.class, id);
		return p;
	}
}
