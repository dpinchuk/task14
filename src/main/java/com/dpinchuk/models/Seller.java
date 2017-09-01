package com.dpinchuk.models;

import lombok.Getter;

@Getter
public class Seller {

    private int sellerId;
    private String sellerName;
    private String sellerLastname;

    public Seller(String sellerId, String sellerName, String sellerLastname) {
        this.sellerId = Integer.parseInt(sellerId);
        this.sellerName = sellerName;
        this.sellerLastname = sellerLastname;
    }

}