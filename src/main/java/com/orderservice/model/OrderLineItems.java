package com.orderservice.model;



import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
//import javax.persistence.*;
import org.springframework.data.annotation.Id;
import java.math.BigDecimal;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(value = "orderLineItems")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrderLineItems {

	@Id
    private ObjectId id;
    private String skuCode ;
    private BigDecimal price;
    private Integer quantity ;
}
