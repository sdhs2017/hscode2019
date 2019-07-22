package member.yiyang.factory.factoryImpl;

import member.yiyang.factory.Reader;
import member.yiyang.factory.ReaderFactory;
import member.yiyang.factory.readerImpl.PngReader;

public class PngReaderFactory implements ReaderFactory {

    public Reader getReader() {
        return new PngReader();
    }
}