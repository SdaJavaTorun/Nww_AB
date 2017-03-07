package sdajava.nww_ab;

public class Main {

    public static int euk(int a, int b) {

        while (a!=b)
            if (a > b) {
                a = a - b;
            }
            else {
                b = b - a;
            }
        return a;
    }

    public static int nww(int a, int b){

        return a/euk(a,b)*b;
    }

    public static void main(String[] args) {
        int a = 36;
        int b= 24;
        //System.out.println("Wynik   " + euk(a,b));
        System.out.println("Nww   "+ nww(a,b));
    }
}