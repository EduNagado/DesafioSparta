package com.DesafioSparta.Eduardo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.math.BigDecimal;
@Entity
@Table(name= "taxa")
public class Taxa {

    @Id
    private Long id;
    private double percentual;


    public Long getId() {
        return id;
    }

    public double getPercentual() {
        return percentual;
    }

    public void setPercentual(double percentual) {
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
