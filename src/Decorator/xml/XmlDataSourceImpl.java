package Decorator.xml;

import java.nio.file.Path;
import java.util.ArrayList;

public class XmlDataSourceImpl implements XmlDataSource{

    String path;

    public XmlDataSourceImpl(String path) {
        this.path = path;
    }

    @Override
    public void readDataFromXml() {

        System.out.println("Read Xml data - here is a place to proper usage a data source files");
    }

    @Override
    public void writeDataToXml() {
        System.out.println("Save data to Xml - here is a place to good usage a data source files");
    }
}
