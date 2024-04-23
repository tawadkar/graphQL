package com.graphql.poc.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class bookVariables {

    private int limit;

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }
}
