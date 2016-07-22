package estudiantes;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import net.sf.json.JSON;
import net.sf.json.xml.XMLSerializer;
import org.apache.commons.io.IOUtils;

public class toJSON {
    private URL url = null;
    private InputStream inputStream = null;    
    
    public void getXMLfromJson() {
        try{
            url = toJSON.class.getClassLoader().getResource("estudiantes.xml");
            inputStream = url.openStream();
            String xml = IOUtils.toString(inputStream);
            toJSON objJson = new XMLSerializer().read(xml);
            System.out.println("Estudiante: " + objJson);
        }catch(Exception e){
            e.printStackTrace();
        }
        finally{
        	try {
                if (inputStream != null) {
                    inputStream.close();
                }
                url = null;
            } catch (IOException ex) {}
        	}
    }
}