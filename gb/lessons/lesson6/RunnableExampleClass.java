package lessons.lesson6;

public class RunnableExampleClass implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("thread-" + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Thread t = new ThreadExampleClass();
        t.start();                              // запуск в отдельном потоке
        // код продолжается выполняться дальше
    }
}
