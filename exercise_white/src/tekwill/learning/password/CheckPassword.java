package tekwill.learning.password;

import java.util.Scanner;

public class CheckPassword {
    Scanner in = new Scanner(System.in);
    boolean rulesMet = false;
    int numberOfDigits = 0;

    public void enterPassword(){
        System.out.println("Enter new password: ");
        String password = in.nextLine();
        do {
            if (password.length() < 8){
                rulesNotMetMessage();
            }else password.matches("[a-zA-Z0-9]+"); {
                rulesMetMessage();
                ++numberOfDigits;
                if (numberOfDigits + 1 < 2){
                    rulesNotMetMessage();
                }
            }
        } while (rulesMet);
    }

    public void rulesMetMessage(){
        rulesMet = true;
        System.out.println("You entered a Valid password");
    }

    public void rulesNotMetMessage(){
        rulesMet = false;
        System.out.println("You entered an Invalid password");
    }
}
