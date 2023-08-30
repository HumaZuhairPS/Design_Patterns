package Adapter;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String xmlData = "<data><item>Value 1</item><item>Value 2</item></data>";
        String filePath = "output.json";

        XmlToJsonConverter xmlToJsonConverter = new XmlToJsonConverter();
        JsonFile jsonFileAdapter = new XmlToJsonFileAdapter(xmlToJsonConverter);
        jsonFileAdapter.saveToJsonFile(xmlData, filePath);
    }
}
