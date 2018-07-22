package com.hellokoding.account.model;



import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
@Entity
@Table( name = "commande")
public class Commande implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long idCommande;
    private Date dateCommande;
    @OneToMany (mappedBy = "commande")
    private Collection<LigneCommande> items;
    @ManyToOne
    @JoinColumn(name = "idClient")
    private Client client;
//Constructeurs


    public Commande() {
    }

    //Selecteurs
    public Long getIdCommande() {
        return idCommande;
    }

    public void setIdCommande(Long idCommande) {
        this.idCommande = idCommande;
    }

    public Date getDateCommande() {
        return dateCommande;
    }

    public void setDateCommande(Date dateCommande) {
        this.dateCommande = dateCommande;
    }

    public Collection<LigneCommande> getItems() {
        return items;
    }

    public void setItems(Collection<LigneCommande> items) {
        this.items = items;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    @Override
    public String toString() {
        return "Commande{" +
                "idCommande=" + idCommande +
                ", dateCommande=" + dateCommande +
                '}';
    }
}
