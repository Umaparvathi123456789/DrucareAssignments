package com.uma.login.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.uma.login.entity.Product;
import com.uma.login.entity.User;
import com.uma.login.service.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private ProductService productService;
    
//API to fetch all products
    @GetMapping("/all")
    public List<Product> getAll() {
        return productService.findAll();
    }

//API to save product
    @PostMapping("/add")
	public ResponseEntity<Product> addProduct(@RequestBody Product product) {
		return new ResponseEntity<>(productService.saveProduct(product),HttpStatus.CREATED);
    }
    
//API to to get particular product based id and for rest rest template
    @GetMapping("/{productId}")
    public ResponseEntity<Product> getProduct(@PathVariable Long productId) {
        return productService.getProduct(productId)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
    
//API to update product
    @PutMapping("/update/{productId}")
	public  ResponseEntity<Product>  updateProduct(@RequestBody Product product, @PathVariable Long productId) {
		Optional<Product> productDetails=productService.updateProduct(product,productId);
		return productDetails.map(details->new ResponseEntity<>(details, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
    
//API to delete product
    @DeleteMapping("delete/{productId}")
	public ResponseEntity<String> deleteProduct(@PathVariable Long productId) {
		return new ResponseEntity<>(productService.deleteProduct(productId),HttpStatus.OK);
    }
    
//Paging
  	@GetMapping("/page/number")
  	public  ResponseEntity<Page<Product>> getProducts(@RequestParam("pageNo") Optional<Integer> pageNo,@RequestParam("sortBy") Optional<String> sortBy) {
          Page<Product> products = productService.getProductByPage(pageNo, sortBy);
          return new ResponseEntity<>(products, HttpStatus.OK);
  	}
  	
//Searching
  	@GetMapping("/search")
  	public ResponseEntity<List<Product>> searchProduct(@RequestParam("query") String query) {
      List<Product> products = productService.searchProduts(query);
      if (products.isEmpty()) {
          return new ResponseEntity<>(HttpStatus.NO_CONTENT);
      }
      return new ResponseEntity<>(products, HttpStatus.OK);
  	}
  	
//Sorting
      @GetMapping("/sorted")
      public ResponseEntity<Page<Product>> getProductsSorted(
              @RequestParam("pageNo") int pageNo,
              @RequestParam("pageSize") int pageSize,
              @RequestParam("sortBy") String sortBy) {
          Page<Product> sortedProducts = productService.getProductsSorted(pageNo, pageSize, sortBy);
          return ResponseEntity.ok(sortedProducts);
      }
      
//Filter
      @GetMapping("/filter")
      public ResponseEntity<List<Product>> getFilteredProducts(
              @RequestParam(value = "name", required = false) String name,
              @RequestParam(value = "description", required = false) String description,
              @RequestParam(value = "price", required = false) Double price) {
          List<Product> filteredProducts = productService.getFilteredProducts(name, description, price);
          return ResponseEntity.ok(filteredProducts);   
      }
// for one user to many products FOR MAPPING
//@Mapping PostMapping 
      @PostMapping("/user/{userId}")
      public ResponseEntity<Product> createProduct1(@RequestBody Product product, @PathVariable Long userId) {
    	  product.setUser(new User(userId,"","","","",0.0,null,"","",0.0));
    	         return new ResponseEntity<>(productService.saveProduct(product),HttpStatus.CREATED);
      }
      
//@Mapping GetMapping
      @GetMapping("/allProducts")
      public ResponseEntity<List<Product>> getAllProducts1() {
          List<Product> products = productService.getAllProducts();
          return new ResponseEntity<>(products, HttpStatus.OK);
      }
//@Mapping GetMapping for particular Id
      @GetMapping("/users/{userId}/products/{productId}")
      public ResponseEntity<Product> getProductById1( @PathVariable Long userId, @PathVariable Long productId) {
          Optional<Product> product = productService.getProductById(userId,productId);
          return product.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                        .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
      }

//@Mapping PutMapping 
      @PutMapping("/users/{userId}/products/{productId}")
      public ResponseEntity<Product> updateProduct1(@RequestBody Product product, @PathVariable Long userId, @PathVariable Long productId) {
          Optional<Product> updatedProduct = productService.updateProduct(product,userId, productId);
          return updatedProduct.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                               .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
      }

 //@Mapping DeleteMapping      
      @DeleteMapping("/user/delete/product/{productId}")
      public ResponseEntity<String> deleteProduct1(@PathVariable Long productId) {
          try {
              String response = productService.deleteProduct(productId);
              return new ResponseEntity<>(response, HttpStatus.OK);
          } catch (RuntimeException e) {
              return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
          }
      }


}
