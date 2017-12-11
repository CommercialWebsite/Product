package com.product.product;

import java.util.List;


public interface ProductService {
    public List<ProductDto> getAllProducts();
    public List<ProductDto> getSelectedProducts(String name, String brand, String typeId);

    public ProductDto createProduct(ProductDto productDto);

    public ProductDto deleteProduct(String id);
    public ProductDto updateProduct(ProductDto productDto);

    public ProductDto getProductById(String id);
}
