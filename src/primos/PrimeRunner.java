package primos;

public class PrimeRunner {
    public static void main(String args[]) {

        for( String s: args) {
            int n = Integer.parseInt(s);

            Thread t = new Thread( new PrimeThread(n) );
            t.start();
        }

    }
}

