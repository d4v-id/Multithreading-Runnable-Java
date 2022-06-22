import java.util.ArrayList;
public class FindPass implements Runnable{
    ArrayList valList;
    FindPass(ArrayList value){
        valList = value;
    }
    public char[] password = "userDawin".toCharArray();

    public void run()
    {
        char nonCapital;
        // Find nonCapital
        for (int x = 0; x < password.length; x++){
            for(nonCapital='a';nonCapital <= 'z'; nonCapital++){
                if (password[x] != nonCapital){
                    System.out.println
                            ("Thread [ID-"+Thread.currentThread().getId()+"] Searching.. "+ nonCapital);
                }
                else {
                    System.out.println
                            ("non-Capital Thread [ID-"+Thread.currentThread().getId()+"] Found ->> "+ nonCapital);
                    valList.set(x,nonCapital);
                    break;
                }
            }
        }//validatePass.found(thePass);
    }
}
