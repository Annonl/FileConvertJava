import Clothes.*;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.nio.file.Files;
import java.nio.file.Paths;

public class SerializationXML {
    public static Shop DeserializeObject(String fileName) throws IOException {
        Shop shop = null;
        XmlMapper xmlMapper = new XmlMapper();
        xmlMapper.registerSubtypes(T_shirt.class, Pant.class, Polo.class, Shirt.class, Pant.class, Sweatshirt.class);
        String readContent = new String(Files.readAllBytes(Paths.get(fileName)));
        shop = xmlMapper.readValue(readContent,Shop.class);
        return shop;
    }
    public static void SerializeObject(Shop shop, String fileName) throws IOException {
        StringWriter writer = new StringWriter();
        XmlMapper mapper = new XmlMapper();
        mapper.writeValue(writer, shop);
        String result = writer.toString();
        FileWriter writer1 = new FileWriter(fileName, false);
        writer1.write(result);
        writer1.flush();
    }
}
