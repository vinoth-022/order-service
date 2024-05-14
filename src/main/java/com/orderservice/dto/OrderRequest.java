package com.orderservice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrderRequest {
	private List<OrderLineItemsDto> orderLineItemsListDto;

    public List<OrderLineItemsDto> getOrderLineItemsListDto() {
        if (orderLineItemsListDto == null) {
            orderLineItemsListDto = new ArrayList<>(); // Initialize the list if it's null
        }
        System.out.println(orderLineItemsListDto);
        return orderLineItemsListDto;
    }
    public void setOrderLineItemsListDto(List<OrderLineItemsDto> orderLineItemsListDto) {
        this.orderLineItemsListDto = orderLineItemsListDto;
    }
    
    
}
