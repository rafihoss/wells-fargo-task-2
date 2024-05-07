package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;
public class Portfolio {

    @Id
    @GeneratedValue()
    public long portfolioId;

    @ManyToOne
    @JoinColumn(name =  "clientId")
    private Client client;

    @Column(nullable = false)
    private String creationDate;

    public Portfolio(String creationDate){
        this.creationDate = creationDate;
    }

    public long getPortfolioId(){ return portfolioId; }
    public String getCreationDate(){return creationDate; }

    public void setCreationDate(String creationDate){ this.creationDate = creationDate; }

}