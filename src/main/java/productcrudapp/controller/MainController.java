package productcrudapp.controller;

import java.lang.ProcessBuilder.Redirect;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.jsp.PageContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import productcrudapp.Dao.ProductDao;
import productcrudapp.Model.Product;

@Controller
public class MainController {
	@Autowired
	private ProductDao pdao;
    @RequestMapping("/home")
	public String home(Model m) {
    	ArrayList<Product>list= (ArrayList<Product>) pdao.getProducts();
    	m.addAttribute("product",list);
		return "index";
	}
    @RequestMapping("/addProduct")
   public String AddNew(Model m) {
    	m.addAttribute("title", "Add Product");
    	return "AddProduct";
    }
    // handle product From
    @RequestMapping(value="/handle-product",method=RequestMethod.POST)
    public RedirectView hadleProduct(@ModelAttribute Product product ,HttpServletRequest request) {
    System.out.println(product);	
    this.pdao.CreteProduct(product);
    RedirectView rd=new RedirectView();
    rd.setUrl(request.getContextPath()+"/home");
    	return rd;
    }
    // handler to delete
    @RequestMapping("/delete-handler/{productId}")
    public RedirectView  deleteProduct(@PathVariable("productId") int id,HttpServletRequest request) {
  this.pdao.deleteProduct(id);
    	RedirectView rd=new RedirectView();
       rd.setUrl(request.getContextPath()+"/home");
    	return rd;
    }
    @RequestMapping("/update-handler/{productId}")
    public String update(@PathVariable("productId")int id,Model model) {
    	Product pr=pdao.getProduct(id);
    	model.addAttribute("pr",pr);
    	return "update";
    }
}
