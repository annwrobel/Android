package com.offcasoftware.shop2.model;

/**
 * @author maciej.pachciarek on 2017-02-18.
 */

public class Product {

    private final int mId;
    private String mName;
    private int mPrice;
    private int mImageResId;

    public Product(final int id, final String name,
            final int price, final int imageResId) {
        mId = id;
        mName = name;
        mPrice = price;
        mImageResId = imageResId;
    }

    public int getId() {
        return mId;
    }

    public String getName() {
        return mName;
    }

    public int getPrice() {
        return mPrice;
    }

    public int getImageResId() {
        return mImageResId;
    }
}
