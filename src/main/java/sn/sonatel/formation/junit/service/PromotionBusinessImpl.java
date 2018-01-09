package sn.sonatel.formation.junit.service;

/**
 * Created by ext_sow18 on 03/01/2018.
 */

public class PromotionBusinessImpl implements PromotionBusiness {

    // Peut aussi être un service web
    PromoCalculatorService promoCalculatorService;

    public PromotionBusinessImpl(PromoCalculatorService promoCalculatorService) {
        this.promoCalculatorService = promoCalculatorService;
    }

    public Double appliquerRemisePromotionnelleSurPrix(Double prix, String nomProduit) {
        // voir si promo sur produit existe
        double promoSurProduit = promoCalculatorService.getPromotionSurCategorie(nomProduit);
        // voir si promo sur montant existe et additionner
        double promo = promoCalculatorService.getPromotionSurMontant(prix, promoSurProduit);
        // retourner la valeur de la promo calculée
        return prix  - (prix * promo);
    }

}
