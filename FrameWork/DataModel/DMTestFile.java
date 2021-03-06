package DataModel;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by renim on 14/07/2017.
 * Represents the test file to check for the presence of the vulnerability in a JSON WAVE data model entry
 */
public class DMTestFile {

    private String technology;
    private File file;

    public String getTechnology() {
        return technology;
    }

    public void setTechnology(String technology) {
        this.technology = technology;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }
}
