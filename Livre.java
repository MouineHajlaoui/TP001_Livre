//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class Livre {
    private static int idLivre = 0;
    private String titre;
    private String auteur;
    private int prix;

    public Livre(String titre, String auteur, int prix) {
        ++idLivre;
        this.titre = titre;
        this.auteur = auteur;
        this.prix = prix;
    }

    public String getAuteur() {
        return this.auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public int getPrix() {
        return this.prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    public String getTitre() {
        return this.titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String toString() {
        return idLivre + ": " + this.titre + " est crée par " + this.auteur + " qui cout " + this.prix + "$";
    }

    public static void main(String[] args) {
        Livre livre1 = new Livre("Kalila et Demna", "Ibn Mokafaa", 25);
        livre1.toString();
    }
}
