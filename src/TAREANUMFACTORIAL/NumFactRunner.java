package TAREANUMFACTORIAL;

public class NumFactRunner {

    public static void main(String[] args) {
        for (String s : args) {
            int n = Integer.parseInt(s);
            Thread t = new Thread(new NumFactorial(n));
            t.start();
        }
    }
}