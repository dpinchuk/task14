package com.dpinchuk.models;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;

@Getter
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
@RequiredArgsConstructor
public class Bid {

    int bidId;
    int bidStep;
    int bidCurrent;
    int buyerId;
    int productId;

}