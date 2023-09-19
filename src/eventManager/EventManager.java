package eventManager;

public class EventManager {
    public static void main(String[] args) {
        new EventManager().run();
    }

    private void run() {
        String [] eventBirthday = {"Arfi", "Sussanne", "Hana"};
        String [] eventFuneral = {"Ifra", "Bob", "Otto"};

        for (int i = 0; i < eventBirthday.length; i++){
            System.out.println(eventBirthday[i]);
        }


        for (int i = 0; i < eventFuneral.length; i++){
            System.out.println(eventFuneral[i]);
        }

        Participant participant1 = new Participant();
        participant1.name = "Steve";
        participant1.age = 33;
        System.out.println(participant1);

        Participant participant2 = new Participant();
        participant2.name = "Patrick";
        participant2.age = 44;
        System.out.println(participant2);

        Participant participant3 = new Participant();
        participant3.name = "Anna";
        participant3.age = 55;
        System.out.println(participant3);

        Event event1 = new Event();
        event1.name = "Birthday";
        event1.date = "19 October 2023";
        event1.place = "7 eleven parking lot";
        event1.participants = 7;
        System.out.println(event1);

        Event event2 = new Event();
        event2.name = "Funereal";
        event2.date = "30 May 2024";
        event2.place = "My bed";
        event2.participants = 3;
        System.out.println(event2);




    }
}
