import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String firstFile = "", secondFile = "";
        if (args.length == 0) {
            System.out.println("Enter the name of the file where you want to take data from:");

            System.out.println("Enter the name of the file where you want to write the data:");

        } else if (args.length == 1) {
            firstFile = args[0];
            System.out.println("Enter the name of the file where you want to write the data:");
        } else {
            firstFile = args[0];
            secondFile = args[1];
        }
        if (new File(firstFile).exists()) {
            var extension = firstFile.split("\\.");
            if (extension[extension.length - 1].equals("xml")) {
                var shop = SerializationXML.DeserializeObject(firstFile);
                shop = ChangeStructureShop.ChangeForJSON(shop);
                SerializationJSON.SerializeObject(shop, secondFile);
            } else if (extension[extension.length - 1].equals("json")) {

            } else {
                System.err.println("You must enter files with xml or json extension. Please, try again.");
            }
        } else {
            System.err.println("The entered files were not found. Try to enter absolute file paths.");
        }
    }
}
