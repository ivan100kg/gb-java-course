package homeworks.hw6;

import java.util.Arrays;

public class MainApp {
    static final int SIZE = 10_000_000;
    static final int HALF = SIZE / 2;
    float[] arr = new float[SIZE];

    void method1() {
        Arrays.fill(arr, 1.0f);
        long a = System.currentTimeMillis();
        for (int i = 0; i < SIZE; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        System.out.println("method1: " + (System.currentTimeMillis() - a));
    }

    void method2() {
        Arrays.fill(arr, 1.0f);
        long a = System.currentTimeMillis();
        float[] tempArr1 = new float[HALF];
        float[] tempArr2 = new float[HALF];
        System.arraycopy(arr, 0, tempArr1, 0, HALF);
        System.arraycopy(arr, HALF, tempArr2, 0, HALF);
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < tempArr1.length; i++) {
                tempArr1[i] = (float) (tempArr1[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < tempArr2.length; i++) {
                tempArr2[i] = (float) (tempArr2[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
        });
        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.arraycopy(tempArr1, 0, arr, 0, HALF);
        System.arraycopy(tempArr2, 0, arr, HALF, HALF);
        System.out.println("method2: " + (System.currentTimeMillis() - a));
    }

    void method3() {
        Arrays.fill(arr, 1.0f);
        long a = System.currentTimeMillis();
        float[] tempArr1 = Arrays.copyOfRange(arr, 0, HALF);
        float[] tempArr2 = Arrays.copyOfRange(arr, HALF, SIZE);
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < tempArr1.length; i++) {
                tempArr1[i] = (float) (tempArr1[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < tempArr2.length; i++) {
                tempArr2[i] = (float) (tempArr2[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
        });
        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.arraycopy(tempArr1, 0, arr, 0, HALF);
        System.arraycopy(tempArr2, 0, arr, HALF, HALF);
        System.out.println("method3: " + (System.currentTimeMillis() - a));
    }

    public static void main(String[] args) {
        MainApp mainApp = new MainApp();
        mainApp.method1();
        mainApp.method2();
        mainApp.method3();
    }
}
