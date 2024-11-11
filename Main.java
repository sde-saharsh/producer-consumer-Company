package Company;

public class Main {
    public static void main(String[] args) {
        Company comp = new Company();
        producer p = new producer(comp);
        consumer c = new consumer(comp);

        p.start();
        c.start();
    }
}
