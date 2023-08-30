package Adapter;
import org.json.JSONObject;
import org.json.XML;


public class XmlToJsonConverter { // adaptee
    public String convertXmlToJson(String xmlData) {
        JSONObject jsonObject = XML.toJSONObject(xmlData);
        return jsonObject.toString(4); // Indentation for readability
    }
}
