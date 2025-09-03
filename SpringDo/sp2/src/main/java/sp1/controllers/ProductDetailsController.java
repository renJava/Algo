package sp1.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import sp1.dto.GetProductDetailsResponse;
import sp1.services.ProductDetailsService;

@RestController
public class ProductDetailsController implements GetProductDetails {
    private final ProductDetailsService productDetailsService;

    public ProductDetailsController(ProductDetailsService productDetailsService) {
        this.productDetailsService = productDetailsService;
    }

    @Override
    public ResponseEntity<GetProductDetailsResponse> getProductDetails() {
        return ResponseEntity.ok(productDetailsService.getProductDetails());
    }
}
