package com.DesafioSparta.Eduardo.model;

import java.math.BigDecimal;

public class Taxa {
    private Long id;
    private double percentual;


    public Long getId() {
        return id;
    }

    public double getPercentual() {
        return percentual;
    }

    public Taxa(double percentual) {
        this.percentual = percentual;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Taxa{");
        sb.append("percentual=").append(percentual);
        sb.append(", id=").append(id);
        sb.append('}');
        return sb.toString();
    }
}
