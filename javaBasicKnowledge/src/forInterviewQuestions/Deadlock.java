package forInterviewQuestions;

import java.util.Comparator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
forInterviewQuestions.Deadlock=Փակուղի
*/
public class Deadlock {
    public static void main(String[] args) {

        createDeadlockSituation();

        //solveDeadlockProblem
//        Object lock3 = new Object();
//        Object lock4 = new Object();
//        ExecutorService _solveDeadlockProblem = Executors.newFixedThreadPool(2);
//        _solveDeadlockProblem.execute(new Thread(() -> solveDeadlockProblem(lock3, lock4),"Thread_3"));
//        _solveDeadlockProblem.execute(new Thread(() -> solveDeadlockProblem(lock4, lock3),"Thread_4"));
    }

    private static void createDeadlockSituation() {
        Object lock1 = new Object();
        Object lock2 = new Object();

        Thread thread1 = new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + "\t START");
            synchronized (lock1) {
                try {
                    Thread.sleep(500);
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


    private static void solveDeadlockProblem(Object res1, Object res2) {
        Object lock1 = res1;
        Object lock2 = res2;
        if (res1.hashCode() < res2.hashCode()) {
            lock2 = res1;
            lock1 = res2;
        }

        System.out.println(Thread.currentThread().getName() + " start");
        synchronized (lock1) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (lock2) {
            }
        }
        System.out.println(Thread.currentThread().getName() + " end");
    }

}
