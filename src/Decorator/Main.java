package Decorator;

import Decorator.json.JsonDataSource;
import Decorator.json.JsonDataSourceDecorator;
import Decorator.xml.XmlDataSource;
import Decorator.xml.XmlDataSourceImpl;

public class Main {
    public static void main(String... string) {
        XmlDataSource xmlDataSource = new XmlDataSourceImpl("my_path");
        //xmlDataSource.readDataFromXml();

        JsonDataSource jsonDataSource = new JsonDataSourceDecorator(xmlDataSource);
        jsonDataSource.saveToJson();
    }
}
