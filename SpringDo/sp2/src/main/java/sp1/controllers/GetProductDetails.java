package sp1.controllers;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import sp1.dto.GetProductDetailsResponse;

@Tag(name = "GetProductDetails", description = "Rest API for getting product details")
public interface GetProductDetails {
    @RequestMapping(
            method = RequestMethod.POST,
            value = "/getProductDetails",
            produces = "application/json")
    ResponseEntity<GetProductDetailsResponse> getProductDetails();

}
