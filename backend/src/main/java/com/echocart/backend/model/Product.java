package com.echocart.backend.model;

public class Product {
    private long productID;
    private String productName;
    private String url;
    private boolean deleted_flag;
    //update
    private String searchKeywords;

    public Product(long productID, String productName, String url, boolean deleted_flag,String searchKeywords) {
        this.productID = productID;
        this.productName = productName;
        this.url = url;
        this.deleted_flag = deleted_flag;
        this.searchKeywords = searchKeywords;
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

    public String getSearchKeywords(){
        return searchKeywords;
    }
}
