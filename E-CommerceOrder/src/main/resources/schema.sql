
Copy code
CREATE TABLE Order_Table (
    orderId BIGINT AUTO_INCREMENT PRIMARY KEY,
    date VARCHAR(255) NOT NULL UNIQUE,
    total DOUBLE UNIQUE,
    productId BIGINT
);