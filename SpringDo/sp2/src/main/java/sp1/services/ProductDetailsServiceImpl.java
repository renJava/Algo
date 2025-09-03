package sp1.services;

import org.springframework.stereotype.Service;
import sp1.dto.GetProductDetailsResponse;

@Service
public class ProductDetailsServiceImpl implements ProductDetailsService {
    @Override
    public GetProductDetailsResponse getProductDetails() {
        return new GetProductDetailsResponse();
    }

}
