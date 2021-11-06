import Clothes.*;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.IOException;
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
}
