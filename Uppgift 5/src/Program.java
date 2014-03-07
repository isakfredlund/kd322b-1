import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.io.File;


public class Program {

private String name;
private String code;
private int women;
private int men;

public Program(String _name, String _code, int _women, int _men){
name = _name;
code = _code;
women = _women;
men = _men;
}

@Override
public String toString(){
	return name;
}

public String getname(){
return name;
}

public String getCode(){
return code;
}

public int getWomen(){
return women;
}

public int getMomen(){
return men;
}

}
