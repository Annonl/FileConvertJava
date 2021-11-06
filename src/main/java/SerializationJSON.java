import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;

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
}
