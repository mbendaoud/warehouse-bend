package com.warehouse.manager.model;


import javax.persistence.*;


@Entity
@Table(name = "product")
public class Product {

    private Long id;
    private String code;
    private String name;
    private String description;
    private boolean suggestedUnitPrice;
    private float buyUnitPrice;
    private long unitsInStock;
    private long unitsOnOrder;
    private String recorderLevel;
    private String supplierId;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }




    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isSuggestedUnitPrice() {
        return suggestedUnitPrice;
    }

    public void setSuggestedUnitPrice(boolean suggestedUnitPrice) {
        this.suggestedUnitPrice = suggestedUnitPrice;
    }

    public float getBuyUnitPrice() {
        return buyUnitPrice;
    }

    public void setBuyUnitPrice(float buyUnitPrice) {
        this.buyUnitPrice = buyUnitPrice;
    }

    public long getUnitsInStock() {
        return unitsInStock;
    }

    public void setUnitsInStock(long unitsInStock) {
        this.unitsInStock = unitsInStock;
    }

    public long getUnitsOnOrder() {
        return unitsOnOrder;
    }

    public void setUnitsOnOrder(long unitsOnOrder) {
        this.unitsOnOrder = unitsOnOrder;
    }

    public String getRecorderLevel() {
        return recorderLevel;
    }

    public void setRecorderLevel(String recorderLevel) {
        this.recorderLevel = recorderLevel;
    }

    public String getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(String supplierId) {
        this.supplierId = supplierId;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
