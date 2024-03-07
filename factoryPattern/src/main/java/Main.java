import cn.hutool.core.util.XmlUtil;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import java.io.File;
import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws Exception {
        Factory f = (Factory) getBean();
        f.product();
    }
    public static Object getBean() throws Exception {
        Document document = XmlUtil.readXML(new File("factoryPattern/src/main/resources/config.xml"));
        Element root = XmlUtil.getRootElement(document);
        String className = XmlUtil.elementText(root, "className");


        Class c = Class.forName(className);
        return c.getDeclaredConstructor().newInstance();
    }
}
