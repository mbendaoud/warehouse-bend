package com.warehouse.manager.model;




import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Panier implements Serializable {

    private Map<Long,LigneCommande> items=new HashMap<Long,LigneCommande>();
    public  void addProduit(Produit p, int quantite){

        if(items.get(p.getIdProduit())==null){
            LigneCommande lc=new LigneCommande();
            lc.setProduit(p);
            lc.setQuantite(quantite);
            lc.setPrix(p.getPrix());
            items.put(p.getIdProduit(),lc);
        }
        else{

            LigneCommande lc= items.get(p.getIdProduit());
            lc.setQuantite(lc.getQuantite()+quantite);
        }
    }


    public Collection<LigneCommande> getItems(){

        return  items.values();
    }
    public  double getTotal(){

        double total=0;
        for (LigneCommande lc:items.values() ) {
            total+=lc.getPrix()*lc.getQuantite();
        }
        return  total;
    }

    public  int getSize(){
        return  items.size();

    }

    public void deleteItems(Long idProduit){
        items.remove(idProduit);

    }


}
