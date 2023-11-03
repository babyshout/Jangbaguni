package kopo.poly.order.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class ProductCrawlingDTO {
    private String price;
    private String productName;

    private String url;
    private String shop;
}
