package org.vashonsd;
import java.util.Scanner;

public class confess {
    String feelings;
    String guilt;
    String remorse;

    public confess(String feelings, String guilt, String remorse) {
        this.feelings = feelings;
        this.guilt = guilt;
        this.remorse = remorse;
    }

    public void getFeelings() {
        Scanner scanny = new Scanner(System.in);
        String ans2 = scanny.nextLine();
        System.out.println("I am sorry you are feeling this way. would you like to elaborate more on " + feelings);

        if(ans2.equals("yes")){
            System.out.println("then please tell me more!");
        }
        else{
            System.out.println("that's just fine... after all we have all the time in the world ");
        }
    }

    public String getGuilt() {
        return guilt;
    }

    public String getRemorse() {
        return remorse;
    }
}
