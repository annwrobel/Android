package com.offcasoftware.shop2.repository;

import com.offcasoftware.shop2.R;
import com.offcasoftware.shop2.model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author maciej.pachciarek on 2017-02-18.
 */

public class ProductRepository implements ProductRepositoryInterface {

    private static ProductRepository mInstance = new ProductRepository();

    private final Map<Integer, Product> mPorducts = new HashMap<>();

    private ProductRepository() {
        Product product1 = new Product(1, "dom 1", 1000, R.drawable.dom1);
        Product product2 = new Product(2, "dom 2", 2000, R.drawable.dom2);
        Product product3 = new Product(3, "dom 3", 3000, R.drawable.dom3);

        mPorducts.put(1, product1);
        mPorducts.put(2, product2);
        mPorducts.put(3, product3);
    }

    public static ProductRepositoryInterface getInstance() {
        return mInstance;
    }

    @Override
    public List<Product> getProducts() {
        return new ArrayList<>(mPorducts.values());
    }

    @Override
    public Product getProduct(final int productId) {
        return mPorducts.get(productId);
    }
}
