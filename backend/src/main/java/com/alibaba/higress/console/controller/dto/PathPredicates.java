package com.alibaba.higress.console.controller.dto;

import lombok.Data;

@Data
public class PathPredicates {

    private String path;
    
    /**
     * see RoutePredicatesTypeEnum
     */
    private String type;

    private Boolean ignoreCase;

}
