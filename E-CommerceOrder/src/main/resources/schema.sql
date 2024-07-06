
--OrderEntity table query
CREATE TABLE Order_Table (
    order_id BIGINT AUTO_INCREMENT PRIMARY KEY,
    date VARCHAR(255) NOT NULL UNIQUE,
    total DOUBLE UNIQUE,
    user_id BIGINT,
);

--OrderTableEntity table query
CREATE TABLE orders (
    orderId BIGINT AUTO_INCREMENT PRIMARY KEY,
    userId BIGINT,
    orderDetails VARCHAR(255),
);