import javax.swing.*;

public class Main {
    public static void main(String[] args) {



        Phonebook zanesPhonebook = new Phonebook();

        String [] availableOptions = {"add new contact", "remove contact", "search contact"};

        String welcome = (String) JOptionPane.showInputDialog(
                null,
                "Select an option",
                "What do you want to do:",
                JOptionPane.QUESTION_MESSAGE,
                null,
                availableOptions,
                availableOptions [0]
        );



        JOptionPane.showMessageDialog(null, zanesPhonebook.addContact());
        /*JOptionPane.showMessageDialog(null, zanesPhonebook.addContact());
        JOptionPane.showMessageDialog(null, zanesPhonebook.addContact());
        JOptionPane.showMessageDialog(null, zanesPhonebook.addContact());
        JOptionPane.showMessageDialog(null, zanesPhonebook.addContact());*/

        JOptionPane.showMessageDialog(null, zanesPhonebook.getContacts());

        JOptionPane.showMessageDialog(null, zanesPhonebook.removeContact());

        JOptionPane.showMessageDialog(null, zanesPhonebook.getContacts());


    }

}
