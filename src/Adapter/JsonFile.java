package Adapter;

import java.io.IOException;

public interface JsonFile { // target
    void saveToJsonFile(String jsonData, String filePath) throws IOException;
}
