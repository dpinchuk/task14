package com.dpinchuk.models;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;

@Getter
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
@RequiredArgsConstructor
public class Product {

    int productId;
    String productName;
    int productStartPrice;
    int productSalePrice;
    int idSeller;

}