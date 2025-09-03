package sp1.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.UUID;

public class GetProductDetailsResponse {
    @JsonProperty("product_id")
    private UUID productId = UUID.randomUUID();

    @JsonProperty("product_type")
    private String productType;

    @JsonProperty("product_name")
    private String productName;

    @JsonProperty("product_price")
    private BigDecimal productPrice;

    @JsonProperty("product_description")
    private String productDescription;
}
