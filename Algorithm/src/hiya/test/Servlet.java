package hiya.test;

public class Servlet {

    private static Servlet instance = new Servlet();

    private Servlet() {

    }

    public static Servlet getInstance() {
        return instance;
    }

    public void services() {
        System.out.println("Do something.");
    }

    static class Client extends Thread {

        private Servlet servlet;

        public Client(Servlet servlet) {
            this.servlet = servlet;
        }

        public void run() {
            servlet.services();
        }

    }

    public static void main(String[] args) {

        Servlet servlet = Servlet.getInstance();
        for (int i = 0; i < 10; i++) {
            Client client = new Client(servlet);
            client.start();
        }
    }
}
