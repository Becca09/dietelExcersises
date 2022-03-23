package assignments;

import java.util.Scanner;

public class NokiaPhone {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        displayNokia();
        mainMenu();

    }

    private static void displayNokia() {
        String nokia = """
                #  #             #       #  #######   #       #             ########            ##
                #     #          #      #              #      #     #          #              #    #
                #       #        #      #              #      #    #           #             #      #
                #         #      #      #              #      # #              #            #        #
                #           #    #      #              #      #    #           #           # # # # # #
                #             #  #      #              #      #      #         #          #           #
                #              ##       #              #      #                #         #            #
                #                        #  ########  #       #             ########    #             #
                """;
        System.out.print(nokia);
    }

    private static void mainMenu(){
        String mainMenu = """
                1 --> Phone Book
                2 --> Messages
                3 --> Chat
                4 --> Call Register
                5 --> Tones
                6 --> Settings
                7 --> Call divert
                8 --> Games
                9 --> Calculator
                10 --> Remainders
                11 --> Clock
                12 --> Profiles
                13 --> SIM services
                """;
        System.out.println(mainMenu);
        int menuPrompt = input.nextInt();
        switch (menuPrompt) {
            case 1 -> displayPhonebook();
            case 2 -> displayMessages();
            case 3 -> displayChat();
            case 4 -> displayCallRegister();
            case 5 -> displayTones();
            case 6 -> displaySettings();
            case 7 -> System.out.println(" Call divert");
            case 8 -> System.out.println(" Games");
            case 9 -> System.out.println(" Calculator");
            case 10 -> System.out.println(" Reminders");
            case 11 -> displayClock();
            case 12 -> System.out.println(" Profiles");
            case 13 -> System.out.println(" Sim services");

        }
    }



    private static void displayPhonebook() {
        String phoneBook = """
                1 --> Search
                2 --> Service Nos
                3 --> Add Name
                4 --> Erase
                5 --> Edit
                6 --> Assign Tone
                7 --> Send b' card
                8 --> Options
                9 --> Speed Dials
                10 --> Voice Tags
                """;
        System.out.println(phoneBook);
        int phoneBookOptions = input.nextInt();
        switch (phoneBookOptions) {
            case 1 -> System.out.println("Search");
            case 2 -> System.out.println(" Service Number");
            case 3 -> System.out.println("Add Name");
            case 4 -> System.out.println("Erase");
            case 5 -> System.out.println("Edit");
            case 6 -> System.out.println("Assign Tone");
            case 7 -> System.out.println("Snd Business Card");
            case 8 -> System.out.printf(" 1: Type of view %n 2: Memory Status");
            case 9 -> System.out.println("Speed Dials");
            case 10 -> System.out.println("Voice Tags");
        }
    }
    private static void displayMessages() {
        String messages = """
                1 --> Write Message
                2 --> Inbox
                3 --> Outbox
                4 --> Picture Messages
                5 --> Templates
                6 --> Smileys
                7 --> Settings
                8 --> Info Service
                9 --> Voice Mailbox Number
                10 --> Service Command Editor
                """;
        System.out.println(messages);
        int messageOptions = input.nextInt();
        switch (messageOptions) {
            case 1 -> System.out.println(" Type message");
            case 2 -> System.out.println(" Inbox");
            case 3 -> System.out.println(" Outbox");
            case 4 -> System.out.println(" Picture Messages");
            case 5 -> System.out.println(" Templates");
            case 6 -> System.out.println(" Smileys");
            case 7 -> System.out.printf("  SET %n  1: Message centre number %n  2: Message sent as %n  3: Message Validity  %nCOMMON %n  1: Delivery reports  %n  2: Reply via same centre  %n   3: Character Support");
            case 8 -> System.out.println(" Information Service");
            case 9 -> System.out.println(" Voice Mail Number");
            case 10 -> System.out.println(" Service Command Editor");
        }

    }

    private static void displayChat() {
        System.out.println( " Chat ");
    }

    private static void displayCallRegister(){
        String callRegister = """
                1 --> Missed Calls
                2 --> Received Calls
                3 --> Dialled Numbers
                4 --> Erase recent call lists
                5 --> Show call duration
                6 --> Show call cost
                7 --> Call cost settings
                8 --> Prepaid credit
                """;
        System.out.println(callRegister);
        int callRegisterList = input.nextInt();
        switch (callRegisterList){
            case 1 -> System.out.println(" 12 Missed calls");
            case 2 -> System.out.println(" 3 Received calls ");
            case 3 -> System.out.println(" 0 Dialed number");
            case 4 -> System.out.println(" Erase call log");
            case 5 -> callDuration();
            case 6 -> callCost();
            case 7 -> callCostSettings();
            case 8 -> System.out.printf(" Prepaid credit");

        }

    }
    private static void callDuration() {
        String duration = """
                1 --> Last call duration
                2 --> All  call's duration
                3 --> Received call's duration
                4 --> Dialed call's duration
                5 --> Clear Items
                """;
        System.out.println(duration);

    }

    private static void callCost() {
        String cost = """
                1 --> Last call
                2 --> All  call's cost
                3 --> Clear Counters    
                """;
        System.out.println(cost);

    }

    private static void callCostSettings() {
        String costSettings = """
                1 --> Call costs limit
                2 --> Show costs in
                """;
        System.out.println(costSettings);
    }

    private static void displayTones() {
        String tones = """
                1 --> Ringing tone
                2 --> Ringing Volume
                3 --> Incoming call alert
                4 --> Composer
                5 --> Message alert tone
                6 --> Keypad tones
                7 --> Warning and game tones
                8 --> Vibrating alert
                9 --> Screen saver          
                """;
        System.out.println(tones);
        int tonesOptions = input.nextInt();
        switch (tonesOptions) {
            case 1 -> System.out.println(" ping pong");
            case 2 -> System.out.println(" Seven (7)");
            case 3 -> System.out.println(" Incoming call");
            case 4 -> System.out.println(" Composer");
            case 5 -> System.out.println(" Duck duck");
            case 6 -> System.out.println(" tanky");
            case 7 -> System.out.println(" Red alarm");
            case 8 -> System.out.println("  Vibration");
            case 9 -> System.out.println(" Wolf Picture");
        }

    }
    private static void displaySettings() {
        String settingsMenu = """
                1 --> Call Settings
                2 --> Phone Settings
                3 --> Security Settings
                4 --> Restore Factory Settings
                """;
        System.out.println(settingsMenu);
        int settingsOption = input.nextInt();
        switch (settingsOption){
            case 1 -> callSettings();
            case 2 -> phoneSettings();
            case 3 -> securitySettings();
            case 4 -> System.out.println(" Restore Factory");
        }
    }

    private static void callSettings() {
        String  callSettings = """
                1 --> Automatic redial
                2 --> Speed dialing
                3 --> Call waiting options
                4 --> Own number sending
                5--> Phone line in use
                6 --> Automatic Answer
                """;
        System.out.println(callSettings);
    }

    private static void phoneSettings() {
        String securityMenu = """
                1 --> PIN code request
                2 --> Call barging service
                3 --> Fixed Dialing
                4 --> Closed user group
                5--> Phone security
                6 --> Change access codes
                """;
        System.out.println(securityMenu);
    }

    private static void securitySettings() {
        String phoneSettings = """
                1 --> Language
                2 --> Cell info display
                3 --> Welcome note
                4--> Network selection
                5 --> lights
                6 --> Confirm sim service actions
                """;
        System.out.println(phoneSettings);

    }
    private static void displayClock() {
        String clock = """
                1 --> Alarm Clock
                2 --> Clock setting
                3 --> Date setting
                4-->  Stopwatch
                5 --> Countdown timer
                6 --> Auto update of date and time
                """;
        System.out.println(clock);

    }


}
