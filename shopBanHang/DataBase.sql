

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

-- Tính năng thống kê BILL

-- 1. Thống kê số lượng đơn hàng theo product, có product mà không có đơn hàng nào.
SELECT p.productId, productName, COUNT(billId) AS total_bill
FROM product p LEFT JOIN bill b
ON p.productId = b.productId
GROUP BY p.productId;

--  2.Thống kê số lượng bill theo tháng
SELECT MONTH(buyDate) AS Month, COUNT(billId) AS total_bill
FROM bill
GROUP BY MONTH(buyDate);

-- 3.Thống kê số lượng bill theo category
SELECT c.categoryId, c.categoryName, COUNT(billId) AS total_bill
FROM category c LEFT JOIN product p ON c.categoryId = p.categoryId
LEFT JOIN bill b ON p.productId = b.productId
GROUP BY c.categoryId;

-- 4. tổng tiền hóa đơn theo tháng
SELECT MONTH(buyDate) AS month, SUM(productQuantity * productPrice) AS total_month_money
FROM bill
GROUP BY MONTH(buyDate);

-- 5. Sản phẩm bán chạy theo tháng
-- đưa ra số lượng bán được của các sản phẩm trong tháng
-- lọc ra sản phẩm có số lượng lớn nhất
SELECT  MONTH(buyDate) AS month, p.productId, p.productName,  SUM(b.productQuantity) AS total_productBuy
FROM product p JOIN bill b ON p.productId = b.productId
GROUP BY p.productId, MONTH(buyDate)
HAVING SUM(b.productQuantity) >= ALL( 
									 SELECT SUM(b.productQuantity)
                                     FROM product p JOIN bill b ON p.productId = b.productId
									 GROUP BY p.productId, MONTH(buyDate))