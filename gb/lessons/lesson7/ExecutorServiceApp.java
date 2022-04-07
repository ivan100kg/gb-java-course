package lessons.lesson7;

import java.util.concurrent.*;

public class ExecutorServiceApp {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        ExecutorService service = Executors.newFixedThreadPool(4);
//        for (int i = 0; i < 10; i++) {
//            final int w = i;
//            service.execute(new Runnable() {
//                @Override
//                public void run() {
//                    System.out.println(w + " begin");
//                    try {
//                        Thread.sleep(100 + (int) (3000 * Math.random()));
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                    System.out.println(w + " end");
//                }
//            });
//        }
//        service.shutdown();

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Future<?> future1 = executorService.submit(new Runnable() {
            public void run() {
                System.out.println("Асинхронная задача");
            }
        });
        System.out.println("future.get() = " + future1.get()); // возвращает данные

        Future<?> future2 = executorService.submit(new Callable<>() {
            public Object call() throws Exception {
                System.out.println("Асинхронный вызов");
                return "Результат из потока";
            }
        });
        System.out.println("future.get() = " + future2.get()); // возвращает данные

        executorService.shutdown();
    }
}
