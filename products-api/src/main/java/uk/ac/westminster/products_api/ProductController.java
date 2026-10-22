package uk.ac.westminster.products_api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/product")
public class ProductController {

    private int id;

    @GetMapping("/{id}")
        public Product getById(@PathVariable Long id){
        return new Product(id,"Laptop",999.99);
        }
    }

