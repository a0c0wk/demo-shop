package com.demo.shop;

import com.demo.shop.business.*;
import com.demo.shop.dao.*;
import java.util.Optional;
import org.junit.Test;
import static org.junit.Assert.*;
import org.mockito.Mockito;

public class test4 {

    @Test
    public void shouldShowMessageInvalidBarcode() {
        
        ProductsDB productsDB = Mockito.mock(ProductsDB.class);

        Scanner scanner = new ScannerImpl(productsDB);
        ScannerResult result = scanner.scanProduct("");
        
        Optional<String> errorMessage = result.message();
                      
        assertEquals(errorMessage, Optional.of("Invalid barcode"));
        
    }
}
