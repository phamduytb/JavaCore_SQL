

CREATE DATABASE SHOPBANHANG;

USE SHOPBANHANG;

-- category :id, name
CREATE TABLE category (
	categoryId 		INT AUTO_INCREMENT NOT NULL,
    categoryName	VARCHAR(100)		NOT NULL,
    
    CONSTRAINT	PK_CATEGORY	PRIMARY KEY (categoryId)
);

-- product : id, name, quantity, price, category
-- 1 category  có nhiều sản phẩm
CREATE TABLE product (
	productId		INT AUTO_INCREMENT 	NOT NULL,
    productName		VARCHAR(100) 		NOT NULL,
    productQuantity	INT 				NOT NULL,
    productPrice	DOUBLE 				NOT NULL,
    categoryId		INT					NOT NULL,
    
    CONSTRAINT PK_PRODUCT	PRIMARY KEY (productId),
    CONSTRAINT	FK_categoryId	FOREIGN KEY (categoryId) REFERENCES category (categoryId)
);

-- bill: id, quantity, price, product, buyDate
-- 1 sản phẩm nằm trong nhiều hóa đơn
CREATE TABLE bill (
	billId			INT AUTO_INCREMENT 	NOT NULL,
    productQuantity	INT 				NOT NULL,
    productPrice	DOUBLE 				NOT NULL,
    productId		INT 				NOT NULL,
    buyDate			DATE 				NOT NULL,
    
    CONSTRAINT PK_BILL 		PRIMARY KEY (billId),
    CONSTRAINT FK_productId	FOREIGN KEY (productId)  REFERENCES product(productId)
    
);



