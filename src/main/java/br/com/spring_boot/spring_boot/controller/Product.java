package br.com.spring_boot.spring_boot.controller;
import org.springframework.web.bind.annotation.RestController;

import br.com.spring_boot.spring_boot.domain.product.ProductRepository;
import br.com.spring_boot.spring_boot.domain.product.RequestProduct;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/product")
public class Product {
    @Autowired
    private ProductRepository repository;
    
    @GetMapping
    public ResponseEntity getAllProduct(){
        var allProduct = repository.findAll();

        return ResponseEntity.ok(allProduct);
    }

    @PostMapping
    public ResponseEntity registerProduct(@RequestBody @Valid RequestProduct data){
        System.out.println(data);
        br.com.spring_boot.spring_boot.domain.product.Product newProduct = new br.com.spring_boot.spring_boot.domain.product.Product(data);
        repository.save(newProduct);
        return ResponseEntity.ok().build();
    }

}
