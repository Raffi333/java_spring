package forInterviewQuestions;

/*
forInterviewQuestions.Deadlock=Փակուղի
*/
public class Deadlock {
    public static void main(String[] args) {
        createDeadlockSituation();
    }

    private static void createDeadlockSituation() {
        Object lock1 = new Object();
        Object lock2 = new Object();

        Thread thread1 = new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + "\t START");
            synchronized (lock1) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                synchronized (lock2) {
                }
            }
            System.out.println(Thread.currentThread().getName() + "\t END");
        }, "Thread_1");
        Thread thread2 = new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + "\t START");
            synchronized (lock2) {
                synchronized (lock1) {
                }
            }
            System.out.println(Thread.currentThread().getName() + "\t END");
        }, "Thread_2");

        thread1.start();
        thread2.start();
    }

}
