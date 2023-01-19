package com.alibaba.higress.console.controller.dto;

import lombok.Data;

@Data
public class ParamsPredicates {

    private String key;

    private String value;
    
    /**
     * see RoutePredicatesTypeEnum
     */
    private String type;

}
