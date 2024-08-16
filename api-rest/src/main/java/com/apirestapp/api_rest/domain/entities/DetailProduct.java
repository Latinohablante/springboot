package com.apirestapp.api_rest.domain.entities;


import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name ="detail_products")
public class DetailProduct {
    @EmbeddedId
    ProductInvoicePk id;
    private Integer quantity;
    private Double price;

    @ManyToOne
    @JoinColumn(name = "id_invoice", insertable = false, updatable = false)
    private Invoice invoices;

    @ManyToOne
    @JoinColumn(name = "id_product", insertable = false, updatable = false)
    private Product products;

    public DetailProduct() {
    }

    public ProductInvoicePk getId() {
        return id;
    }

    public void setId(ProductInvoicePk id) {
        this.id = id;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
  

    public Product getProducts() {
        return products;
    }

    public void setProducts(Product products) {
        this.products = products;
    }

    public Invoice getInvoices() {
        return invoices;
    }

    public void setInvoices(Invoice invoices) {
        this.invoices = invoices;
    }

    
}
