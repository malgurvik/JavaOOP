package org.example.seminar1;

import java.util.List;

public interface VendingMachine {
    Product getProduct(String name);
    void initProduct(List<Product> list);


}
