package DesignPatterns.AdapterDesignPattern;

public class AdapterPatternTesting {
    public static void main(String[] args) {
        ReportProvider reportProvider = new XmlDataProviderAdapter(new XmlDataProvider());
        System.out.println(reportProvider.getJsonData());
    }


}
