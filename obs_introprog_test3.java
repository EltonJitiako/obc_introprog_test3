class Test3 {
    
    public static void main (String[] args){
        //Part 1
        System.out.println(sum(3, 79, 12));

        //Part 2
        Coche miCoche = new Coche();
        miCoche.masPuertas();
        System.out.println(miCoche.puertas);

    
    }

    //Part 1
    public static int sum (int a, int b, int c){
        return a + b + c;
    }

}


//Part 2
class Coche {
    int puertas;
    void masPuertas() {
        puertas +=1;
    }
}