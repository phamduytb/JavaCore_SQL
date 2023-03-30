package model;

// Thống kê số lượng hóa đơn của product
// Làm thực tế thì nên tách ra thánh các model riêng cho mỗi chức năng thống kê

public class ReportBill {
	
	private long totalBill;
	
	private int productId;
	
	private String productName;
	
	private int month;
	
	private int categoryId;
	
	private String categoryName;
	
	private double total_money;
	
	private long total_product;

	public long gettotalBill() {
		return totalBill;
	}

	public void settotalBill(long total) {
		this.totalBill = total;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public long getTotalBill() {
		return totalBill;
	}

	public void setTotalBill(long totalBill) {
		this.totalBill = totalBill;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public double getTotal_money() {
		return total_money;
	}

	public void setTotal_money(double total_money) {
		this.total_money = total_money;
	}

	public long getTotal_product() {
		return total_product;
	}

	public void setTotal_product(long total_product) {
		this.total_product = total_product;
	}
	
	
	
}
