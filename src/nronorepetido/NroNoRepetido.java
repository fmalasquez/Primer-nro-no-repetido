package nronorepetido;

public class NroNoRepetido {
    // 0  1  2

    public static void main(String[] args) {// 5  4  8 = 3
        Integer lista[] = new Integer[]{22, 10, 10, 25, 10, 22};
        //System.err.println("VALOR: "+lista[0]);

        for (int i = 0; i < lista.length; i++) {
            boolean repetido = false;
            for (int j = 0; j < lista.length; j++) {
                if (lista[i] == lista[j] && i != j) {
                    //System.err.println("VALOR: "+lista[i]+" en la posicion "+j);
                    repetido = true;
                    break;
                }
            }
            if (!repetido) {
                System.out.println("el primer numero no repetido es " + lista[i] + " en la posicion " + i);
                break;
            }
        }
    }
}
