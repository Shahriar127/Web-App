package com.mahim.simpleWebApp.Repository;

import com.mahim.simpleWebApp.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {

}
