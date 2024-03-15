package example;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ParticipantSer implements Serializable { // Class ini mengimplementasikan interface Serializable
    // Atribut
    private String firstName;
    private String lastName;
    private int age;

    // Method with 3 params, this merujuk pada atribut dari class
    public ParticipantSer(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public void printData() {
        System.out.println("Nama\t: " + firstName + " " + lastName);
        System.out.println("Usia\t: " + age);
    }

    // to serialize object and save in a file
    public void saveObject(ParticipantSer Obj) {
        try {
            FileOutputStream fos = new FileOutputStream("src/example/files/data.ser"); // Lokasi file
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(Obj);
            oos.flush();
            fos.close();
        } catch (IOException ioe) {
            System.out.println("A problem accured during serialize.\n" + ioe.getMessage());
        }
    }

    // read a file and deserialize into object
    public void readObject(ParticipantSer Obj) {
        try {
            FileInputStream fis = new FileInputStream("src/example/files/data.ser"); // Lokasi file
            ObjectInputStream ois = new ObjectInputStream(fis);
            Obj = (ParticipantSer) ois.readObject();
            Obj.printData();
            fis.close();
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println("a problem accured during deserialize.\n" + ex);
            System.exit(1);
        }
    }

    // Main method
    public static void main(String[] args) {
        ParticipantSer is = new ParticipantSer("Azizatur", "Rohma", 20);
        is.saveObject(is);
        is.readObject(is);
    }

}
