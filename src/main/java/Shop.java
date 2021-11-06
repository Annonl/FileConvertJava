import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;

public class Shop {
    @JacksonXmlElementWrapper(localName="Categories")
    private ArrayList<Category> Categories;

    public void setCategories(ArrayList<Category> categories) {
        Categories = categories;
    }

    public ArrayList<Category> getCategories() {
        return Categories;
    }
}
