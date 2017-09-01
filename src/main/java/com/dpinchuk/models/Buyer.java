package com.dpinchuk.models;

import lombok.Getter;

@Getter
public class Buyer {

    private int buyerId;
    private String buyerName;
    private String buyerLastname;

    public Buyer(String buyerId, String buyerName, String buyerLastname) {
        this.buyerId = Integer.parseInt(buyerId);
        this.buyerName = buyerName;
        this.buyerLastname = buyerLastname;
    }

}