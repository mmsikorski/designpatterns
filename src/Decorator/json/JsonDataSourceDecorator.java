package Decorator.json;

import Decorator.xml.XmlDataSource;

public class JsonDataSourceDecorator implements JsonDataSource{

    XmlDataSource xmlDataSource;

    public JsonDataSourceDecorator(XmlDataSource xmlDataSource) {
        this.xmlDataSource = xmlDataSource;
    }

    @Override
    public void saveToJson() {
        this.translateXmlParamsToJson();
        System.out.println("Some operations are performed");
        System.out.println("Data are translated to Json.");
    }

    public void translateXmlParamsToJson() {
        this.xmlDataSource.readDataFromXml();
    }
}
