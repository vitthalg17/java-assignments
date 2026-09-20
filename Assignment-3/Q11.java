class NumberBoard {
    private int next = 1;

    public synchronized void printOdd() {
        while (next <= 20) {
            if (next % 2 == 0) {
                try {
                    wait();
                }
                catch (InterruptedException e) {
                    System.out.println("Odd thread interrupted");
                }
            }
            else {
                System.out.println("Odd thread  : " + next);
                next++;
                notify();
            }
        }
        notify();
    }

    public synchronized void printEven() {
        while (next <= 20) {
            if (next % 2 != 0) {
                try {
                    wait();
                }
                catch (InterruptedException e) {
                    System.out.println("Even thread interrupted");
                }
            }
            else {
                System.out.println("Even thread : " + next);
                next++;
                notify();
            }
        }
        notify();
    }
}

class OddRunner implements Runnable {
    private NumberBoard board;

    OddRunner(NumberBoard board) {
        this.board = board;
    }

    public void run() {
        board.printOdd();
    }
}

class EvenRunner implements Runnable {
    private NumberBoard board;

    EvenRunner(NumberBoard board) {
        this.board = board;
    }

    public void run() {
        board.printEven();
    }
}

public class Q11 {
    public static void main(String[] args) throws InterruptedException {
        NumberBoard board = new NumberBoard();

        Thread odd = new Thread(new OddRunner(board));
        Thread even = new Thread(new EvenRunner(board));

        odd.start();
        even.start();

        odd.join();
        even.join();

        System.out.println("-------------------------");
        System.out.println("Both threads finished printing 1 to 20 alternately");
    }
}
