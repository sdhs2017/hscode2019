package member.savilio.basic.generics.generics_class;

public class DataHolderDemo {

    public static void main(String[] args) {
        DataHolder2 data = new DataHolder2();
        DataHolder2<Integer,String> data2 = new DataHolder2<Integer,String>();

        data.setData("1","一");
        data2.setData(1,"one");

        System.out.println(data.getValue(""));
        System.out.println(data2.getValue(1));
        System.out.println(data2.getData().getValue(1));
    }

}
