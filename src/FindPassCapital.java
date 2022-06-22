import java.util.ArrayList;

public class FindPassCapital implements Runnable{

    ArrayList valList;
    FindPassCapital(ArrayList value){
        valList = value;
    }
    public void run() {
        // Find Capital
        char capital;
        FindPass findPass = new FindPass(null);
        for (int x = 0; x < findPass.password.length; x++) {
            for(capital='A';capital <= 'Z'; capital++) {
                if (findPass.password[x] != capital) {
                    System.out.println("Thread [ID-"+Thread.currentThread().getId()+"] Searching.. " + capital);
                } else {
                    System.out.println("Capital Thread [ID-"+Thread.currentThread().getId()+"] Found ->> " + capital);
                    valList.set(x,capital);
                    break;
                }
            }
        }
    }
}
