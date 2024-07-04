package com.uma.login.comtroller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uma.login.entity.Order;
import com.uma.login.entity.UserOrders;
import com.uma.login.service.OrderService;
@RestController
@RequestMapping("/orders")
public class OrderController {
	
	 @Autowired
    private OrderService orderService;
	 
//Rest Template to get orders by userId
	 @GetMapping("data/users/{userId}")
		public ResponseEntity<UserOrders>  getUserOrders(@PathVariable String userId) {
			List<Order> orderList =orderService.getUserOrder(userId);
			UserOrders user = new UserOrders();
			user.setUserOrders(orderList);
			return new ResponseEntity<>(user, HttpStatus.OK);
		}
//API to fetch all products
    @GetMapping("/all")
    public List<Order> getAllOrders() {
        return orderService.findAllOrders();
    }

//API to save product
    @PostMapping("/add")
	public ResponseEntity<Order> addProduct(@RequestBody Order order) {
		return new ResponseEntity<>(orderService.saveOrder(order),HttpStatus.CREATED);
    }
    
//API to to get particular product based id and for rest rest template
    @GetMapping("/{orderId}")
    public ResponseEntity<Order> getOrder(@PathVariable Long orderId) {
        return orderService.getOrder(orderId)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
    
//API to update product
    @PutMapping("/update/{orderId}")
	public  ResponseEntity<Order>  updateOrder(@RequestBody Order order, @PathVariable Long orderId) {
		Optional<Order> orderDetails=orderService.updateOrder(order,orderId);
		return orderDetails.map(details->new ResponseEntity<>(details, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
    
//API to delete product
    @DeleteMapping("delete/{orderId}")
	public ResponseEntity<String> deleteOrder(@PathVariable Long orderId) {
		return new ResponseEntity<>(orderService.deleteOrder(orderId),HttpStatus.OK);
    }
}
