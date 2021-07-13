package com.demo.shop;

import com.demo.shop.business.*;
import com.demo.shop.dao.*;
import com.demo.shop.entity.*;

import java.util.Optional;
import org.junit.Test;
import static org.junit.Assert.*;
import org.mockito.Mockito;

public class test1 {

    @Test
    public void shouldShowProductDetailsFromDB() {

        ProductsDB productsDB = Mockito.mock(ProductsDB.class);

        Mockito.when(productsDB.findProductByBarcode("123")).thenReturn(Optional.of(new ProductImpl("123", 2, "milk")));

        Scanner scanner = new ScannerImpl(productsDB);
        ScannerResult result = scanner.scanProduct("123");

        assertEquals(result.product().get().getName(), "milk");
        assertEquals(result.product().get().getPrice(), 2);
    }

}
