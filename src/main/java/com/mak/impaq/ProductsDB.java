package com.mak.impaq;

import java.util.Optional;

public interface ProductsDB {

    Optional<Product> findProductByBarcode(String barcode);
}
