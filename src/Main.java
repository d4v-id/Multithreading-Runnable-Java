import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList thePass = new ArrayList();
        ValidatePass validatePass =  new ValidatePass();
        FindPass findPass = new FindPass(thePass);
        FindPassCapital secondFindPass = new FindPassCapital(thePass);
        // Set size list
        for(int i=1; i <= findPass.password.length; i++){
            thePass.add(i);
        }
        Thread runScan0 = new Thread(findPass);
        Thread runScan1 = new Thread(secondFindPass);

        runScan0.start();
        runScan1.start();
        try{
            runScan0.join();
            runScan1.join();
        }catch (Exception e){System.out.println(e);}
        validatePass.found(thePass);

    }
}
