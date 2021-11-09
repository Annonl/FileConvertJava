import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.FileWriter;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SerializationJSON {
    public static void SerializeObject(Shop shop, String fileName) throws IOException {
        StringWriter writer = new StringWriter();
        ObjectMapper mapper = new ObjectMapper();
        mapper.writerWithDefaultPrettyPrinter().writeValue(writer, shop);
        String result = writer.toString();
        FileWriter writer1 = new FileWriter(fileName, false);
        writer1.write(result);
        writer1.flush();
    }
    public static Shop DeserializeObject(String fileName) throws IOException {
        Shop shop = null;
        String jsonText = new String(Files.readAllBytes(Paths.get(fileName)));
        ObjectMapper mapper = new ObjectMapper();
        StringReader reader = new StringReader(jsonText);
        shop = mapper.readValue(reader, Shop.class);
        return shop;
    }
}
