package Company;

public class Company {

    int n; // shared resourses
    boolean flag = false;
    //false-->producer_chance
    //true-->consumer_chance
    synchronized public void produce_item(int n){
        if (flag) {
            try {
                wait();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        this.n=n;
        System.out.println("produced :"+this.n);
        flag=true;  
        notify();
    }
    synchronized public int consume_item(){
        if(!flag){
            try {
                wait();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("consume :"+this.n);
        flag=false;
        notify();
        return this.n;
    }
}
