public class Fraction {
    private int numerateur;
    private int denominateur;
    
    public int getNum(){return numerateur;}
    
    public int getDenom(){return denominateur;}

    public void setNum(int num){this.numerateur=num;}

    public void setDenom(int denom){this.denominateur=denom;}

    public Fraction(int num , int denom){
        this.numerateur=num;
        this.denominateur=denom;
    }
    public String toString(){
        return "Numerateur = " + numerateur + " || Denominateur = "+ denominateur ;
    }

}