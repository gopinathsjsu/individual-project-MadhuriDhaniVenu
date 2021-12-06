package com.inventory;

public class Categories {

    private String categoryType;
    private String quantity;
    private String price;

    public Categories(String categoryType, String quantity, String price) {
        this.categoryType = categoryType;
        this.quantity = quantity;
        this.price = price;
    }

    public String getCategoryType() {
        return categoryType;
    }

    public void setCategoryType(String categoryType) {
        this.categoryType = categoryType;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
