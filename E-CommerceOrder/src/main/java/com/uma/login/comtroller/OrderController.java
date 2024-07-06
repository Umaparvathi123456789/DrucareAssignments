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
import com.uma.login.entity.OrderTable;
import com.uma.login.entity.UserOrders;
import com.uma.login.service.OrderService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/orders")
public class OrderController {
	
	 @Autowired
    private OrderService orderService;
	 
//Rest Template to get orders by userId
	  @Tag
	    (name = "get orders",description="get methods for product API")
	 @GetMapping("data/users/{userId}")
		public ResponseEntity<UserOrders>  getUserOrders(@PathVariable String userId) {
			List<Order> orderList =orderService.getUserOrder(userId);
			UserOrders user = new UserOrders();
			user.setUserOrders(orderList);
			return new ResponseEntity<>(user, HttpStatus.OK);
		}
	 
//OrdeTable 
	  @GetMapping("/data/users/rest/{userId}")
	    public ResponseEntity<OrderTable> getOrderByUserId(@PathVariable Long userId) {
		  OrderTable order = orderService.getOrderByUserId(userId);

	        if (order != null) {
	            return ResponseEntity.ok(order);
	        } else {
	            return ResponseEntity.notFound().build();
	        }
	    }
	    @PostMapping("/add/order")
	    public ResponseEntity<OrderTable> addProduct(@RequestBody OrderTable order) {
			return new ResponseEntity<>(orderService.saveOrderTable(order),HttpStatus.CREATED);
	    }
	    
//API to fetch all products
	    @Tag
	    (name = "get orders",description="get methods for product API")
    @GetMapping("/all")
    public List<Order> getAllOrders() {
        return orderService.findAllOrders();
    }

//API to save product
	    @Operation(summary = "added product",
				description = "Added product into product table")
    @PostMapping("/add")
	public ResponseEntity<Order> addProduct(@RequestBody Order order) {
		return new ResponseEntity<>(orderService.saveOrder(order),HttpStatus.CREATED);
    }
    
//API to to get particular product based id and for rest rest template
    @Tag
    (name = "get orders",description="get methods  to get particular product for product table")
    @GetMapping("/{orderId}")
    public ResponseEntity<Order> getOrder(@PathVariable Long orderId) {
        return orderService.getOrder(orderId)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
    
//API to update product
    @Tag
    (name = "update order",description="update methods for product API")
    @PutMapping("/update/{orderId}")
	public  ResponseEntity<Order>  updateOrder(@RequestBody Order order, @PathVariable Long orderId) {
		Optional<Order> orderDetails=orderService.updateOrder(order,orderId);
		return orderDetails.map(details->new ResponseEntity<>(details, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
    
//API to delete product
    @ApiResponses({@ApiResponse(responseCode = "200",
			description = "hello uma ok",
			content = {@Content(mediaType = "application/json",
			schema = @Schema(implementation = Order.class))}),
	@ApiResponse(responseCode = "404",
		description = "order data not found",
		content = @Content)})
    @Operation(summary = "delete product",
			description = "deleting a existing product")
    @Tag
    (name = "delete order",description="delete methods for product API")
    @DeleteMapping("delete/{orderId}")
	public ResponseEntity<String> deleteOrder(@PathVariable Long orderId) {
		return new ResponseEntity<>(orderService.deleteOrder(orderId),HttpStatus.OK);
    }
}
