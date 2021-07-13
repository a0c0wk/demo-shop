package com.mak.impaq;

import java.util.Optional;

public class ScannerResultImpl implements ScannerResult {

    private Optional<Product> product;
    private Optional<String> message;
    private LCD lcd;

    public ScannerResultImpl(Optional<Product> product, Optional<String> message) {
        this.product = product;
        this.message = message;
    }

    @Override
    public Optional<Product> product() {
        return product;
    }

    @Override
    public Optional<String> message() {
        lcd.display(message.get());
        return message;
    }

}
