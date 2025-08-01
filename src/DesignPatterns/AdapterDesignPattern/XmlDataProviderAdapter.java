package DesignPatterns.AdapterDesignPattern;
/** Adapter has is a relationship with our interface or class and has a relationship with 3 rd parties interface or class
 * */
public class XmlDataProviderAdapter implements ReportProvider{
    private XmlDataProvider xmlDataProvider;
    public XmlDataProviderAdapter(XmlDataProvider xmlDataProvider){
        this.xmlDataProvider = xmlDataProvider;
    }
    @Override
    public String getJsonData() {
        return "Converted to JSON format " + xmlDataProvider.getXmlData();

    }
}
