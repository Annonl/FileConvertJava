package Clothes;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Category", visible = true)
@JsonSubTypes({
        @JsonSubTypes.Type(name = "T_Shirt", value = T_shirt.class),
        @JsonSubTypes.Type(name = "Short", value = Short.class),
        @JsonSubTypes.Type(name = "Shirt", value = Shirt.class),
        @JsonSubTypes.Type(name = "Polo", value = Polo.class),
        @JsonSubTypes.Type(name = "Pant", value = Pant.class),
        @JsonSubTypes.Type(name = "Sweatshirt", value = Sweatshirt.class)
})
public abstract class Clothes {
    public String Category;
    @JacksonXmlProperty(localName = "Name")
    public String Name;
    @JacksonXmlProperty(localName = "ProductID")
    public int ProductID;
    @JacksonXmlProperty(localName = "Cost")
    public int Cost;
    @JacksonXmlProperty(localName = "Density")
    public int Density;
    @JacksonXmlElementWrapper(localName = "AvalibleSize")
    public ArrayList<Size> AvalibleSize;
    public Clothes(){}
}
