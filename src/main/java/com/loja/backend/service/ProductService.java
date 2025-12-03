package com.loja.backend.service;

import com.loja.backend.model.Product;
import com.loja.backend.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> findAll() {
        return productRepository.findAll();
    }

    public Optional<Product> findById(Long id) {
        return productRepository.findById(id);
    }

    public Product save(Product product) {
        return productRepository.save(product);
    }

    public Product update(Long id, Product product) {
        return productRepository.findById(id)
                .map(existingProduct -> {
                    existingProduct.setNome(product.getNome());
                    existingProduct.setPreco(product.getPreco());
                    existingProduct.setCodigoBarras(product.getCodigoBarras());
                    return productRepository.save(existingProduct);
                })
                .orElseThrow(() -> new RuntimeException("Produto não encontrado com id: " + id));
    }

    public void delete(Long id) {
        if (!productRepository.existsById(id)) {
            throw new RuntimeException("Produto não encontrado com id: " + id);
        }
        productRepository.deleteById(id);
    }
}


