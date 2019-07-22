package member.yiyang.factory;

import member.yiyang.factory.factoryImpl.JpgReaderFactory;
import member.yiyang.factory.factoryImpl.PngReaderFactory;

public class Test {
    public static void main(String[] args){

        ReaderFactory factory=new JpgReaderFactory();
        Reader  reader=factory.getReader();
        reader.read();

        ReaderFactory factory1=new PngReaderFactory();
        Reader  reader1=factory1.getReader();
        reader1.read();
    }
}
