package Company;

public class consumer extends Thread{

    Company c;
    public consumer(Company c){
        this.c=c;
    }
    @Override
    public void run(){
        while (true) {
            this.c.consume_item();
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println("Exception occur"+e.getMessage());
            }
        }
    }
}
