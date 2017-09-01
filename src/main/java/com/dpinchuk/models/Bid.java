package com.dpinchuk.models;

import com.dpinchuk.tools.Tools;
import lombok.Getter;

@Getter
public class Bid {

    private int bidId;
    private int bidStep;
    private int bidCurrent;
    private int buyerId;
    private int productId;

    public Bid(String bidId, String bidStep, String bidCurrent, String buyerId, String productId) {
        this.bidId = Integer.parseInt(bidId);
        this.bidStep = Integer.parseInt(Tools.parseNull(bidStep));
        this.bidCurrent = Integer.parseInt(Tools.parseNull(bidCurrent));
        this.buyerId = Integer.parseInt(Tools.parseNull(buyerId));
        this.productId = Integer.parseInt(Tools.parseNull(productId));
    }

}