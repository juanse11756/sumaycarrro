public class Main {
    public static void main(String[] args) {
        int a=1;
        int b=2;
        int c=3;

        int totalSuma=a+b+c;
        System.out.println("total");
        System.out.println(totalSuma);

        Coche miCoche =new Coche();
        miCoche.setNumeroPuertas(1);

        System.out.println(miCoche.numeroPuertas);

        miCoche.setNumeroPuertas(4);
        System.out.println(miCoche.numeroPuertas);



    }
}