public class Main {
    public static void main(String[] args)throws Exception{
        System.out.println("Premier affichage simple!");
        Fraction f =  new Fraction(0,0);
        f.setNum(4);
        f.setDenom(5);
        String var = f.toString();
        System.out.println(var);
    }
}