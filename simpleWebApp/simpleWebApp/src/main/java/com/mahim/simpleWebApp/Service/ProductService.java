package com.mahim.simpleWebApp.Service;
import com.mahim.simpleWebApp.Model.Product;
import com.mahim.simpleWebApp.Repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductService {
//    List<Product> products = Arrays.asList(new Product(101,
//            "Iphone", 50000),
//            new Product(102, "Canon Camera", 70000),
//            new Product(103,"Shure Mic",10000));
    @Autowired
     ProductRepo repo;

    public List<Product> getProducts() {
        return repo.findAll();
    }
    public Product getProductById(int prodId) {
        return repo.findById(prodId).orElse(new Product());
    }

    public void addProduct(Product prod) {
        repo.save(prod);
    }

    public void updateProduct(Product prod) {
        repo.save(prod);
    }

    public void deleteProduct(int prodId) {
        repo.deleteById(prodId);
    }
}
