package primos;

import java.util.ArrayList;

public class PrimeThread implements Runnable{
    //generar lista de los n primeros numeros primos

    private int max;
    public PrimeThread(int n) {
        this.max = n;
    }

    @Override
    public void run() {
        ArrayList<Integer> primos = new ArrayList<Integer>();
        primos.add(2);

        for (int i = 3; i < max; i++) {
            boolean es_primo = true;
            double limite = Math.ceil( Math.sqrt(i) );
            for (int j = 0; j < primos.size(); j++) {
                if (i % primos.get(j) == 0) {
                    es_primo = false;
                    break;
                }
                if (primos.get(j) > limite)
                    break;
            }
            if (es_primo)
                primos.add(i);
        }

        System.out.println( Thread.currentThread().getName() + ":" + primos);
    }
}

