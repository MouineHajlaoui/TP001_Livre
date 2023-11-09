public class Rectangle {
    private float longueur;
    private float largeur;

    public Rectangle(float longueur, float largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
    }

    public float Perimettre() {
        return (this.longueur + this.largeur) * 2.0F;
    }

    public double Diagonal() {
        return Math.sqrt((double)(this.largeur * this.largeur + this.longueur * this.longueur));
    }

    public float Doubler() {
        return this.longueur + this.largeur;
    }

    public static void main(String[] args) {
        System.out.println("exercice 1: ");
        System.out.println("bonjour tout le monde");
        System.out.println("exercice 2: ");


        int i = 0;
        int n = i++;
        System.out.println("A: i= " + i + " n= " + n);
        int i = 10;
        i = i + 1;
        System.out.println("b: i= " + i + " n= " + i);
        i = 20;
        int j = 5;
        i = i + 1;
        ++j;
        n = i * j;
        System.out.println("c :i= " + i + "j= " + j + "n= " + n);
        i = 15;
        i = i + 3;
        System.out.println("d: i= " + i + " n= " + i);
        i = 3;
        int j = 5;
        j = j - 1;
        n = i = i * j;
        System.out.println("c :i= " + i + "j= " + j + "n= " + n);
        System.out.println("exercice 3: ");
        Rectangle rectangle = new Rectangle(12.0F, 9.0F);
        System.out.println("le perimettre du rectangle est: " + rectangle.Perimettre());
        System.out.println("le diagonale du rectangle est: " + rectangle.Diagonal());
        System.out.println("le doubler du rectangle est: " + rectangle.Doubler());
    }
}

