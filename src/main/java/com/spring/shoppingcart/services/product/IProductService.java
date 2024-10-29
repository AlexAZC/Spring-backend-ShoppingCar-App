package com.spring.shoppingcart.services.product;

import com.spring.shoppingcart.dto.ProductDto;
import com.spring.shoppingcart.model.Product;
import com.spring.shoppingcart.request.AddProductRequest;
import com.spring.shoppingcart.request.ProductUpdateRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IProductService {
    Product addProduct(AddProductRequest product);
    Product getProductById(Long id);
    void deleteProductById(Long id);
    Product updateProduct(ProductUpdateRequest product, Long productId);
    List<Product> getAllProducts();
    List<Product> getProductsByCategory(String category);
    List<Product> getProductsByBrand(String brand);
    List<Product> getProductsByCategoryAndBrand(String category, String brand);

    List<ProductDto> getConvertedProducts(List<Product> products);

    ProductDto convertToDto(Product product);

    List<Product> getProductsByBrandAndCategory(String brand, String category);
    List<Product> getProductsByName(String name);
    List<Product> getProductsByBrandAndName(String brand, String name);
    Long countProductsByBrandAndName(String brand, String name);

}
