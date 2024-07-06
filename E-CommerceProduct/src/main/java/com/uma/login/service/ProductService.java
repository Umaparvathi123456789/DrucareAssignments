package com.uma.login.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.uma.login.entity.Product;
import com.uma.login.entity.ProductTable;
import com.uma.login.repo.ProductRepo;
import com.uma.login.repo.ProductRepository;

@Service
public class ProductService {
	 @Autowired
	 private ProductRepository productRepository;
	 @Autowired

	 private ProductRepo repo;
	 
//Rest Template
//ProductTable
	  public Optional<ProductTable> getProductById(Long productId) {
	        return repo.findById(productId);
	    }

		public ProductTable savedProducts(ProductTable product) {
			// TODO Auto-generated method stub
			return repo.save(product);
		}
	   
	 
//GetMapping
	    public List<Product> findAll() {
	        return productRepository.findAll().stream()
                    .collect(Collectors.toList());
	        }
//PostMapping
	    public Product saveProduct(Product product) {
	        return Stream.of(product)  
	                     .map(productRepository::save) 
	                     .findFirst()  
	                     .orElseThrow(); 
	    }
//GetMapping
	    public Optional<Product> getProduct(Long productId) {
	        return Stream.of(productRepository.findById(productId))  
                    .flatMap(Optional::stream)  
                    .findFirst();  
	    }
//PutMapping
		public Optional<Product> updateProduct(Product product, Long productId) {
			return Stream.of(productRepository.findById(productId)).flatMap(Optional::stream)
                    .peek(existingProduct -> {
                       System.out.println("Found product for update: " + existingProduct);
                    }).map(existingProduct -> {
                        existingProduct.setName(product.getName());
                        existingProduct.setPrice(product.getPrice());
                        return productRepository.save(existingProduct);  
                    }).peek(updatedProduct -> {
                        System.out.println("Updated product: " + updatedProduct);
                    }).findFirst(); 
   }		
//DeleteMapping
		 public String deleteProduct1(Long productId) {
		        return Stream.of(productId).peek(existingId -> productRepository.deleteById(existingId))  
		                     .map(existingId -> "Deleted successfully")  
		                     .findFirst()  
		                     .orElse("Failed to delete product"); 
		    }
//Paging
		public Page<Product> getProductByPage(Optional<Integer> pageNo, Optional<String> sortBy) {
			return productRepository.findAll(PageRequest.of(pageNo.orElse(0),2,Direction.DESC,sortBy.orElse("productId")));

		}
//Searching
		public List<Product> searchProduts(String query) {
			  return productRepository.searchProduct1(query).stream() 
                      .collect(Collectors.toList()); 
		}
//Filtering
		 public List<Product> getFilteredProducts(String name, String description, Double price) {
		        return productRepository.findByCriteria(name, description, price);
		    
		}
//Sorting
		public  Page<Product> getProductsSorted(int pageNo, int pageSize, String sortBy) {
//			  PageRequest pageRequest = PageRequest.of(pageNo, pageSize, Sort.by(sortBy));
//			    return productRepository.findAll(pageRequest);
//		}
	      Sort sort = Sort.by(sortBy).ascending();
// Create a PageRequest object with the given page number, page size, and sort configuration
	      PageRequest pageable = PageRequest.of(pageNo, pageSize, sort);
	        return productRepository.findAll(pageable);
	    }
		
//@Mapping PostMapping 
		public Product saveProduct(Product product, Long userId) {
	return productRepository.save(product);
		}
//@Mapping GetMapping 
		    public List<Product> getAllProducts() {
		        return productRepository.findAll();
		    }
//@Mapping GetMapping particular id 
		    public Optional<Product> getProductById(Long userId,Long productId) {
		        return productRepository.findById(productId);
		    }
//@Mapping PutMapping 
		    public Optional<Product> updateProduct(Product product, Long productId,Long userId) {
		        Product existingProduct = productRepository.findById(productId)
		            .orElseThrow(() -> new RuntimeException("Product not found with id: " + productId));
		        existingProduct.setName(product.getName());
		        existingProduct.setDescription(product.getDescription());
		        existingProduct.setPrice(product.getPrice());
		        productRepository.save(existingProduct);
		        return Optional.of(existingProduct);
		    }
//@Mapping DeleteMapping 
		    public String deleteProduct(Long productId) {
		        Product existingProduct = productRepository.findById(productId)
		            .orElseThrow(() -> new RuntimeException("Product not found with id: " + productId));
		        productRepository.delete(existingProduct);
		        return "Product deleted successfully";
		    }




		
}
