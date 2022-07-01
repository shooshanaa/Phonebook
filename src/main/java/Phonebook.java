import javax.swing.*;
import java.util.ArrayList;

public class Phonebook {

    private ArrayList<Contacts> contacts = new ArrayList<>();

    public String addContact(){
        String name = JOptionPane.showInputDialog("Enter name");
        String number = JOptionPane.showInputDialog("Enter phone number");

        Contacts contact = new Contacts(name, number);

        this.contacts.add(contact);
        return name + " added successfully";

    }


    public ArrayList<Contacts> getContacts(){
        return contacts;
    }

    public String removeContact(){
        Contacts toBeDeleted = (Contacts) JOptionPane.showInputDialog(
                null,
                "Select contact to be deleted",
                "delete",
                JOptionPane.QUESTION_MESSAGE,
                null,
                this.contacts.toArray(),
                this.contacts.toArray()[0]
        );
        return "Contact deleted" + toBeDeleted;
    }

   /* public String searchContact(){
        String name = JOptionPane.showInputDialog("Search by name: ");


    }*/


}
