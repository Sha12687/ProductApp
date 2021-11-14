package productcrudapp.Model;

import javax.persistence.*;

@Entity
@Table(name = "Product")
public class Product {
	@Id
	@Column(name = "Id")
	@GeneratedValue(strategy = GenerationType.IDENTITY )
private int id;
	@Column(name="name")
private String name;
	@Column(name="description")
private String description;
	@Column(name="price")
private long price;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public long getPrice() {
	return price;
}
public void setPrice(long price) {
	this.price = price;
}
@Override
public String toString() {
	return "Product [id=" + id + ", name=" + name + ", description=" + description + ", price=" + price + "]";
}
	
	
}
