#### Tests Unitaires avec JUnit

- Step 01 : Les dependances
- Step 02 : Creer un premier test JUnit
- Step 03 : First Successful JUnit. Green Bar and assertEquals
- Step 04 : Refactoring First JUnit Test
- Step 05 : Second Example JUnit : assertTrue and assertFalse
- Step 06 : @Before @After
- Step 07 : @BeforeClass @AfterClass
- Step 08 : Les assertions hamcrest : AssertThat
- Step 09 : Tester les Exceptions avec JUnit Tests


# Exercices à faire

## Gestion des promotions

Dans une classe sn.sonatel.formation.junit.service.PromotionBusiness.java :
    Ecrire une fonction qui prend deux valeurs en paramètre : prix produit et nom du produit qui applique une remise promotionnelle sur le produit.
    PromotionBusiness doit s’appuyer sur un collaborateur PromoCalculatorService,java pour le calcul des promotions sur prix et sur catégorie de produit.

Les règles métier sont :
   * Si le nom du produit commence par "A", appliquer une réduction promotionnelle de 15% sur le prix du produit.    
    * Si le produit commence par "B", appliquer une remise de 5%.    
    * Si le prix du produit est supérieur à 500 , appliquer une réduction de 2%
    * Les remises sont cumulables

Réalisez tous les cas de tests possibles. Enrichissez pour gérer les exceptions.

    
    