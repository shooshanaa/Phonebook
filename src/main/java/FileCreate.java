import javax.imageio.IIOException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileCreate {
    public static void main(String[] args) {

       //creating File
        try {
           File contacts = new File("C:\\Users\\zane\\OneDrive\\Desktop\\contacts.txt");
           if (contacts.createNewFile()) {
               System.out.println("File created: " + contacts.getName());
               System.out.println("Absolute path: " + contacts.getAbsolutePath());
           } else {
               System.out.println("File already exists.");
           }
       } catch (IOException e) {
           System.out.println("An error occured.");
           e.printStackTrace();
       }

       //writing to file
        try {
           FileWriter myWriter = new FileWriter("C:\\Users\\zane\\OneDrive\\Desktop\\contacts.txt");
           myWriter.write ("Zane 2954");
           myWriter.close();
           System.out.println("Successfully wrote to the file.");
       }catch (IOException e) {
           System.out.println("An error occurred.");
           e.printStackTrace();
       }


        //reading file

        try {
            File contacts = new File("C:\\Users\\zane\\OneDrive\\Desktop\\contacts.txt");
            Scanner myReader = new Scanner(contacts);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();

        }





    }
}
