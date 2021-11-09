package Clothes;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class Size {
    @JacksonXmlProperty(isAttribute = true)
    public String SizeName;
    public Size(){}
}
