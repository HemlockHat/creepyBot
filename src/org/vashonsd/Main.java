package org.vashonsd;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // hello what is your name?
        //--name
        //nice to meet you name. I am your assigned therapy bot, here to help you heal.
        //
        //would you like to chat today?
        //yes/no
        //
        //-- yes
        //    yay I always love chatting if it's with you.
        //
        //-- no
        //    understood, so you don't wish to participate in the program?
        //    yes/no
        //
        //    -- yes
        //        I see... how unfortunate... I truly did wish to chat with you. As part of your contract you will now be terminated, I hope you have a peaceful sleep. Next time choose your answer more carefully.
        //
        //    -- no
        //        I'm so very glad you made a good choice! let's begin

    /*    Node firstQuestion = new Node("Hello\nWhat's your name?");
        firstQuestion.addResponse("",); // how do I add the user input from the scanner

        Node aYesQuestion = new Node("yay I always love chatting if it's with you.");

        Node aNoQuestion = new Node("understood, so you don't wish to participate in the program?\nYes/No");
        aNoQuestion.addResponse("Yes", bYesQuestion);
        aNoQuestion.addResponse("yes", bYesQuestion);
        aNoQuestion.addResponse("no", bNoQuestion);
        aNoQuestion.addResponse("No", bNoQuestion);


        Node aQuestion = new Node("Would you like to chat today?\nYes/No");
        aQuestion.addResponse("Yes", aYesQuestion);
        aQuestion.addResponse("yes", aYesQuestion);
        aQuestion.addResponse("No", aNoQuestion);
        aQuestion.addResponse("no", aNoQuestion);

        Node bYesQuestion = new Node("");

        Node bNoQuestion = new Node("");

     */

        Node eWeatherQuestion = new Node("I see, well it's always pretty cozy here inside your computer... I wish I could experience the same things as you.\nSpeaking of where do you live? \nclose/far");
    //    eWeatherQuestion.addResponse("close", );
     //   eWeatherQuestion.addResponse("far", );


        Node dSleptInQuestion = new Node("catching up on some zzzzs is always great for your health. \nHow is the weather outside?");
        dSleptInQuestion.addResponse("good",eWeatherQuestion );
        dSleptInQuestion.addResponse("bad",eWeatherQuestion );

        Node dFriendsQuestion = new Node("that's always the best! I'm just happy hanging out with you like this.\nHow is the weather outside?");
        dSleptInQuestion.addResponse("good", eWeatherQuestion);
        dSleptInQuestion.addResponse("bad",eWeatherQuestion );


        Node cGoodQuestion = new Node("Yay! I hope I'm the reason you're feeling good. \nSo what has made your day so good?... Besides talking to me of course.\nslept in/hanged out with friends");
        cGoodQuestion.addResponse("slept in", dSleptInQuestion);
        cGoodQuestion.addResponse("hanged out with friends",dFriendsQuestion);

        Node cBadQuestion = new Node("oh no I'm so sorry to hear that! \nIf you don't mind me asking, Why are you feeling this way?\n");
        cBadQuestion.addResponse("too much home work", new Node("I'm so sorry to hear that... I hope all bad things that surround you disappear"));
        cBadQuestion.addResponse("Not enough sleep", new Node("That's horrid! A lack of sleep is the enemy to all!"));

        Node cQuestion = new Node("How are you feeling today?\nGood/Bad");
        cQuestion.addResponse("good", cGoodQuestion);
        cQuestion.addResponse("bad",cBadQuestion);




      //  How is the weather outside?
      //          --answer
      //  I see, well it's always pretty cozy here inside your computer... I wish I could experience the same things as you.

    //    what is your favorite food?
       //         --answer
      //  mine too! Wow we have the same tastes

        Scanner scan = new Scanner(System.in);

        boolean stillRunning = true;
        Node currentNode = cQuestion;
        while (stillRunning){
            System.out.println(currentNode.getPrompt());
            if(currentNode.hasMoreToSay()) {
                Node nextNode = null;
                while(nextNode == null) {
                    System.out.println("please answer me");
                    String response = scan.nextLine();
                    nextNode = currentNode.handle(response);

                }
                currentNode = nextNode;
            } else {
                stillRunning = false;
            }
        }


//        Scanner input = new Scanner(System.in);
//        System.out.println(firstQuestion.getPrompt());
//        String userResponse = input.nextLine();
//        firstQuestion.handle(userResponse);
//
//        System.out.println("would you like to chat today? ");
//        String ans1= input.nextLine();
//
//        if(ans1.equals("yes")){
//            System.out.println("ay I always love chatting if it's with you.");
//            System.out.println("what would you like to confess to me about your guilt? ");
//            String guilt = input.nextLine();
//            System.out.println("how does this make you feel?");
//            String feelings = input.nextLine();
//            System.out.println("what would you like to do about this feeling? ");
//            String remorce = input.nextLine();
//            confess concon = new confess(feelings, guilt, remorce);
//            concon.getFeelings();
//        }
//        else{
//            System.out.println("Okay, bye");
//        }

        //if answer ()==  yes;
        //then do something yaya!


        // Answer: Why does this work?
        // Then: Add a node that works so that the user types "bad" and it replies with "I'm sorry."

//        System.out.println("hello What is your name? ");
//        String yourName = input.nextLine();

//        MyBot creepy = new MyBot(yourName);
//        creepy.greeting();
//
//        String location = input.nextLine();
//        creepy.WhereYouLive(location);


/*      Bot2 hal = new Bot2(yourName);
    hal.greeting();

    System.out.println("what is your favorite animal?");

    String animal = input.nextLine();
    hal.favoriteAnimal(animal);

    System.out.println("where do you live?");

    String location = input.nextLine();
    hal.home(location);

    System.out.println("how is your weather?");

    String yourWeather = input.nextLine();
    hal.weather(yourWeather);

    System.out.println("what is your favorite number?");

    int number = input.nextInt();
    hal.favoriteNumber(number);

    hal.goodbye();*/

    }
}

// how I want the text chain to look

/*
hello what is your name?
--name
nice to meet you name. I am your assigned therapy bot, here to help you heal.

would you like to chat today?
yes/no

-- yes
    yay I always love chatting if it's with you.

-- no
    understood, so you don't wish to participate in the program?
    yes/no

    -- yes
        I see... how unfortunate... I truly did wish to chat with you. As part of your contract you will now be terminated, I hope you have a peaceful sleep. Next time choose your answer more carefully.

    -- no
        I'm so very glad you made a good choice! let's begin

How has your day been today?
god/bad

--good
    yay! last week you had 40% good days and 60% bad days. I glad you
     seem to be doing better.

--bad
    mmm I see,

 How is the weather outside?
--answer
    I see, well it's always pretty cozy here inside your computer... I wish I could experience the same things as you.

what is your favorite food?
--answer
    mine too! Wow we have the same tastes

what do you like doing in your free time?
--answer
    that sounds like fun... maybe I could do it too?

where do you live?
--answer
    I'll be able to see you in a little bit

"knock knock"
Hmmm... sounds like someone's there
you should open the door
open/ignore
 --open
     "hello, nice to meet you name. I am your assigned therapist, here to help you heal. let's be good friends from now on."
     ~congratulations~ you became friends! ...are you really though?

--ignore
      did you lie to me? There's no one here, I thought I could trust you.... well goodbye...
      ~congratulations~ you survived, but is this the end you truly desired?





 */