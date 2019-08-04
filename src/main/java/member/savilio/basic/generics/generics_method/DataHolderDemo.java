package member.savilio.basic.generics.generics_method;


public class DataHolderDemo {

    public static void main(String[] args) {
        DataHolder data = new DataHolder();
        data.PrinterInfo(1);
        data.PrinterInfo("HelloWorld");
        data.PrinterInfo(6.66f);

        DataHolder<String> data2 = new DataHolder<String>();
//        data2.PrinterInfo(1);
//        data2.PrinterInfo("HelloWorld");
//        data2.PrinterInfo(6.66f);

        DataHolder data3 = new DataHolder();
        data3.PrinterInfo2(1,"one");

    }

}
