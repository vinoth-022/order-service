package com.orderservice.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(value = "orders")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Order {
	@Id
    private ObjectId id ;
    private String orderNumber ;
    private List<OrderLineItems> orderLineItemsList ;
}
