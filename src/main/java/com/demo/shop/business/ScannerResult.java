package com.mak.impaq;

import java.util.Optional;

public interface ScannerResult {
    
    Optional<Product> product();
    Optional<String> message();
    
}
