import java.util.ArrayList;

public class ValidatePass {
    public void found(ArrayList passNow) {
        StringBuilder buildPass = new StringBuilder();
        for(int i = 0; i < passNow.size(); i++){
            buildPass.append(passNow.get(i));
        }
        System.out.println("( Password is : "+buildPass+" )");
    }
}
