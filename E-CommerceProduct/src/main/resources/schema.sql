--ProductEntity table query
CREATE TABLE Product_Table (
    productId BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    description VARCHAR(255) NOT NULL,
    price DOUBLE NOT NULL,
    order_id BIGINT,
    FOREIGN KEY (user_id) REFERENCES User(user_id),  
    );
 
--ProductTable Entity query
CREATE TABLE products (
    productId BIGINT AUTO_INCREMENT PRIMARY KEY,  
    name VARCHAR(255) ,                    
    description VARCHAR(255),            
    price DOUBLE                           
);