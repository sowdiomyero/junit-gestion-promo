package sn.sonatel.formation.junit.service;

/**
 * Created by ext_sow18 on 03/01/2018.
 */
public interface PromoCalculatorService {

    public double getPromotionSurCategorie (String nomProduit);
    public double getPromotionSurMontant(Double prix, Double promo);

}
