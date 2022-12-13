class Test3 {
    
    public static void main (String[] args){
        //Part 1
        sum(3, 79, 12);

        //Part 2
        Coche miCoche = new Coche();
        miCoche.masPuertas(4);
        System.out.println(miCoche.puertas);

    
    }

    //Part 1
    public static void sum (int a, int b, int c){
        int d = a + b + c;
        System.out.println(d);
    }

}


//Part 2
class Coche {
    int puertas;
    void masPuertas(int d) {
        puertas = d;
    }
}