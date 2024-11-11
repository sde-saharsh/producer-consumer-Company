package Company;

public class producer extends Thread{

    Company c;
    public producer(Company c){
        this.c = c;
    }
    @Override
    public void run(){
        int i=1;
        while(true){
            this.c.produce_item(i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println("Exception Occur"+e.getMessage());
            }
            i++;
        }
    }

}
