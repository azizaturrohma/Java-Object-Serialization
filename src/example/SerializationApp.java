package example;

import java.util.ArrayList;
import java.util.List;

public class SerializationApp {
    public static void main(String[] args) {
        List<Participant> participants = new ArrayList<Participant>();
        participants.add(new Participant("Azizatur", "Rohma", 20));
        participants.add(new Participant("David", "Mahbubi", 22));
        participants.add(new Participant("Ayu", "Listiyo", 20));
        participants.add(new Participant("Ilham", "Mubarok", 12));

        System.out.println("Participants: " + participants);

        SerializationDemo demo = new SerializationDemo();
        demo.serialize(participants, "src/example/files/participantData.ser"); // Lokasi file
        System.out.println("Serialization is done");

        System.out.println("Deserialize obejct...");
        List<Participant> newList = demo.deserialize("src/example/files/participantData.ser"); // Lokasi file
        System.out.println("New List: " + newList);
    }
}
