package eventManager;

public class Participant {
        String name;
        int age;

        @Override
        public String toString() {
                return "Participant " +
                        "name: " + name +
                        ", age: " + age;
        }
}
