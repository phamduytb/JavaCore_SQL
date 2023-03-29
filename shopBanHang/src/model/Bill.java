package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import service.IProduct;
import service.ProductImpl;
import validate.ValidateData;

public class Bill {
	IProduct iProduct = new ProductImpl();
	
	private int billId;
	private int productQuantity;
	private double productPrice; // Giá lúc mua
	private Date buyDate;
	private Product product;
	
	public Bill() {
		
	}

	public int getBillId() {
		return billId;
	}

	public void setBillId(int billId) {
		this.billId = billId;
	}

	public int getProductQuantity() {
		return productQuantity;
	}

	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	public Date getBuyDate() {
		return buyDate;
	}

	public void setBuyDate(Date buyDate) {
		this.buyDate = buyDate;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	
	public void input() throws ParseException {
		
		while (true) {
			System.out.println("Enter the id number of product: ");
			int id = ValidateData.validateInteger();
			Product product = iProduct.searchById(id);
			if (product == null) {
				System.out.println("No exist product with the id number: " + id + " , please re-enter:");
			} else {
				this.product = product;
				System.out.println("Enter the product quantity want buy: ");
				while (true) {
					int quantity = ValidateData.validateInteger();
					if (quantity <= product.getProductQuantity()) {
						this.productQuantity = quantity;
						
						break;
					} else {
						System.out.println("Not enough quantity, re-enter <= " + product.getProductQuantity() );
					}
				}
				
				this.productPrice = product.getProductPrice();
				
				this.buyDate = ValidateData.validateDate();
				break;
			}
		}
		
		
	}
	
	public void inputUpdate() {
		
		Product product = iProduct.searchById(this.getProduct().getProductId());
		
		//trả lại sô sluowng product trước khi tạo bill
		product.setProductQuantity(product.getProductQuantity() + this.productQuantity);
		
		System.out.println("Update the product quantity want buy: ");
		while (true) {
			// Cập nhật số lượng sản phẩm cho hóa đơn
			int quantity = ValidateData.validateInteger();
			
			if (quantity <= product.getProductQuantity()) {
				
				this.productQuantity = quantity;
				
				// trả lại số lượng product sau khi update bill
				product.setProductQuantity(product.getProductQuantity() - this.getProductQuantity());
				
				System.out.println("Update product quantity after update bill");
				
				iProduct.update(product);
				
				break;
			} else {
				System.out.println("Not enough quantity, re-enter <= " + product.getProductQuantity() );
			}
			
		}
		
		this.setProduct(product);
		
	}
	
	public void info() {
		
		System.out.println("BillId: " + billId + " |productId:" + product.getProductId() + " |product'name: " + product.getProductName()
						
						+ " |Product'price: " 	+  String.format("%.2f", productPrice)+ " |Product'quantity: " + productQuantity 
							
						+  " |buy date: " + new SimpleDateFormat("dd/MM/yyyy").format(buyDate) 
							
						+ " |price total:" + String.format("%.2f", productPrice * productQuantity));
	}

	
}
