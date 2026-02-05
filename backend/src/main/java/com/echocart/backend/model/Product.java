package com.echocart.backend.model;

public class Product {
    private long productID;
    private String productName;
    private String url;
    private boolean deleted_flag;

    public Product(long productID, String productName, String url, boolean deleted_flag) {
        this.productID = productID;
        this.productName = productName;
        this.url = url;
        this.deleted_flag = deleted_flag;
    }

    public long getProductID(){
        return productID;
    }

    public String getProductName(){
        return productName;
    }

    public String getUrl(){
        return url;
    }

    public boolean isDeleted(){
        return deleted_flag;
    }
}
