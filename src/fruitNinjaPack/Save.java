package fruitNinjaPack;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.Text;
import org.jdom2.input.SAXBuilder;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;
    
public class Save {
static int lives,highscore,score;

public Save(int lives1,int score1,int highscore1) {
	
lives=lives1;
score=score1;
highscore=highscore1;
}
	

	 

	        private static void readXML(){
	               
	            }
	    
	    
	    
	    public static void writeXML(){
	        try{
	        Document doc = new Document();
	        Element theRoot = new Element("Save");
	        doc.setRootElement(theRoot);
	        
	        Element scene= new Element ("scene");
	        Element save_info= new Element ("save_info");
	        save_info.setAttribute("lives",lives+"");
	        save_info.setAttribute("score",score+"");
	        save_info.setAttribute("highscore",highscore+"");

	         scene.addContent(save_info);
	         
	         theRoot.addContent(scene);
	         

	         
	         XMLOutputter xmlOutput = new XMLOutputter(Format.getPrettyFormat());
	         xmlOutput.output(doc,new FileOutputStream(new File("./src/FruitNinja_saveFile.xml")));
	            System.out.println("Wrote to file");
	        }
	        catch(Exception ex){
	            ex.printStackTrace();
	        }
	        
	    }
	}
