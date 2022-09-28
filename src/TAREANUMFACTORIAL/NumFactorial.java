package TAREANUMFACTORIAL;
import java.util.ArrayList;
import java.util.*;
import java.io.*;
public class NumFactorial implements Runnable {
    private int list;
    public NumFactorial (int n){this.list = n;}
    @Override
    public void run() {
        int factorial = 1;
        for(int i = 1; i <= list; i++ ) {
            factorial *= i;
        }
        System.out.println(Thread.currentThread().getName() + ":" + factorial);
    }
}