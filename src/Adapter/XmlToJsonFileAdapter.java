package Adapter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class XmlToJsonFileAdapter implements JsonFile{ // adapter
    private XmlToJsonConverter xmlToJsonConverter;

    public XmlToJsonFileAdapter(XmlToJsonConverter xmlToJsonConverter) {
        this.xmlToJsonConverter = xmlToJsonConverter;
    }

    @Override
    public void saveToJsonFile(String xmlData, String filePath) throws IOException {
        String jsonData = xmlToJsonConverter.convertXmlToJson(xmlData);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(jsonData);
        }
        System.out.println("JSON data stored in file: " + filePath);
    }
}
