package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SerializationApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        List<Participant> participants = new ArrayList<>();

        System.out.print("Masukkan jumlah partisipan: ");
        int jumlah = input.nextInt();

        // For loop untuk melooping sebanyak jumlah partisipan
        for (int i = 0; i < jumlah; i++) {
            System.out.println("----------------------------------------------");
            System.out.println("Masukkan data partisipan ke-" + (i + 1)); // i + 1 karena nilai i diinisiasi = 0,
                                                                          // sehingga agar bilangan dimulai dari 1 maka
                                                                          // i ditambah 1
            System.out.print("Nama depan: ");
            String firstName = input.next();

            System.out.print("Nama belakang: ");
            String lastName = input.next();

            System.out.print("Usia: ");
            int age = input.nextInt();

            // Menambahkan data ke Array List
            participants.add(new Participant(firstName, lastName, age));
        }

        input.close();

        System.out.println("----------------------------------------------");
        System.out.println("Participants: " + participants);

        SerializationDemo demo = new SerializationDemo();
        demo.serialize(participants, "src/practice/files/participantData.ser");
        System.out.println("Serialization is done");

        System.out.println("Deserialize object...");
        List<Participant> newList = demo.deserialize("src/practice/files/participantData.ser");
        System.out.println("New List: " + newList);
    }
}
