package exercises.BooleanOperators;

public class BooleanOperators {
    public static void main(String[] args) {
    boolean ex1 = 2 <= 2 && !true;                                // ex1= FALSE
    boolean ex2 = !false && 3 > 2;                               //  ex2= TRUE
    //ex3    considering that t=false and f=true: !(!t || f)     // ex3= FALSE
    boolean ex3 = !(!false || true);
    boolean ex4 = 6 > 6 ^ !(true && true);                       // ex4=FALSE

        System.out.println(ex1);
        System.out.println(ex2);
        System.out.println(ex3);
        System.out.println(ex4);

    }
}
