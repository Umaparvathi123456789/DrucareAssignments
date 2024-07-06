--Query for userEntity
CREATE TABLE User_Table (
    user_id BIGINT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(100) NOT NULL,
    password VARCHAR(255) NOT NULL,
    email VARCHAR(100) NOT NULL UNIQUE,
    product_id BIGINT

);
--query for uderTable enetity
CREATE TABLE Users (
   userId BIGINT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(100),
    password VARCHAR(255),
    email VARCHAR(100),
    productId BIGINT
    );
