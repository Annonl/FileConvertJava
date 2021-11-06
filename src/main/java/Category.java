import Clothes.Clothes;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import java.util.ArrayList;

public class Category {
    @JacksonXmlElementWrapper(localName="Clotheses")
    public ArrayList<Clothes> Clotheses;
    @JacksonXmlProperty(localName = "NameCategory")
    @JsonProperty("NameCategory")
    private String NameCategory;
    @JacksonXmlProperty(localName = "CategoryID")
    @JsonProperty("CategoryID")
    private int CategoryId;

    public Category(String nameCategory, int categoryId) {
        this.NameCategory = nameCategory;
        this.CategoryId = categoryId;
    }

    public Category() {

    }
    public void setCategoryId(int categoryId) {
        CategoryId = categoryId;
    }

    public void setClotheses(ArrayList<Clothes> clotheses) {
        Clotheses = clotheses;
    }
    public void setNameCategory(String nameCategory) {
        NameCategory = nameCategory;
    }

}
