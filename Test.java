public class Test {
    public Test() {
    }

    public static void main(String[] args) {
        Livre livre1 = new Livre("Kalila et Demna", "Ibn Mokafaa", 42);
        System.out.println("avant modification");
        System.out.println("apres modification");
        System.out.println("l'auteur avec la methode get: " + livre1.getAuteur());
        System.out.println("le prix avec la methode get: " + livre1.getPrix());
        System.out.println("le titre avec la methode get: " + livre1.getTitre());
        livre1.setAuteur("Ibn Mofakaa");
        System.out.println(livre1.toString());
        Livre livre2 = new Livre("Les mésirables", "Victor Hugo", 42);
        System.out.println(livre2.toString());
    }
}