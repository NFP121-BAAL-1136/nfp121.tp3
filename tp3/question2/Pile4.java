package question2;

import question1.PilePleineException;
import question1.PileVideException;

import java.util.Stack;

public class Pile4 implements PileI, Cloneable {
    /** la liste des Maillons/Elements */
    private Maillon stk;
    /** la capacit� de la pile */
    private int capacite;
    /** le nombre */
    private int nombre;

    /**
     * Classe interne "statique" contenant chaque �l�ment de la chaine c'est une
     * proposition, vous pouvez l'ignorer !
     */
    private static class Maillon implements Cloneable {
        private Object element;
        private Maillon suivant;

        public Maillon(Object element, Maillon suivant) {
            this.element = element;
            this.suivant = suivant;
        }

        public Maillon suivant() {
            return this.suivant;
        }

        public Object element() {
            return this.element;
        }

        public Object clone() throws CloneNotSupportedException {
            Maillon m = (Maillon) super.clone();
            m.element = element;
            return m;
        }
    }

    /**
     * Cr�ation d'une pile.
     * 
     * @param taille
     *            la taille de la pile, la taille doit �tre > 0
     */
    public Pile4(int taille) {
        if (taille <= 0)
            taille = CAPACITE_PAR_DEFAUT;
        this.stk = null;
        this.capacite = taille;
    }

    public Pile4() {
        this(PileI.CAPACITE_PAR_DEFAUT);
    }

    public void empiler(Object o) throws PilePleineException {
        if (estPleine())
            throw new PilePleineException();
        // � compl�ter
        stk = new Maillon (o,stk);     
        this.nombre++;  
    }

    public Object depiler() throws PileVideException {
        if (estVide())
            throw new PileVideException();
        // � compl�ter
        Maillon temp = this.stk;
        this.stk = this.stk.suivant;
        nombre--;
        return temp.element;
    }

    public Object sommet() throws PileVideException {
        if (estVide())
            throw new PileVideException();
        return stk.element ;
    }

    /**
     * Effectue un test de l'�tat de la pile.
     * 
     * @return vrai si la pile est vide, faux autrement
     */
    public boolean estVide() {
         return stk == null; // � compl�ter
    }

    /**
     * Effectue un test de l'�tat de la pile.
     * 
     * @return vrai si la pile est pleine, faux autrement
     */
    public boolean estPleine() {
       return this.taille() >= capacite;  // � compl�ter
    }

    /**
     * Retourne une repr�sentation en String d'une pile, contenant la
     * repr�sentation en String de chaque �l�ment.
     * 
     * @return une repr�sentation en String d'une pile
     */
    public String toString() {

        String s = "[";
        // � compl�ter
        Maillon temp = stk;
        while (temp != null){
            s = s + temp.element() ;
            temp = temp.suivant();
            if (temp !=null) {s = s + ", ";}  
        }  
        return s + "]";
    }

    public boolean equals(Object o) {
        boolean result = true;
        Pile4 p1;
        if (o instanceof Pile4) {
            p1 = (Pile4) o;
            Maillon m1;
            Maillon m2;
            try{
                if (p1.taille() == this.taille() && p1.capacite() == this.capacite()){
                m1 = stk;
                m2 = p1.stk;
                    for (int i = this.nombre - 1; i >= 0; i--) {
                        if(!(m1.element() == m2.element())){
                            result = false;
                        }
                        m1 = m1.suivant();
                        m2 = m2.suivant();
                    }
                }
                else{
                    result = false;
                }
            }catch (Exception e){
                result = false;
            }
            
        }else{
            result = false;
        }
        return result;
    }

    public int capacite() {
        return this.capacite;
    }

    public int hashCode() {
        return toString().hashCode();
    }

    public int taille() {
        return nombre;
    }
}