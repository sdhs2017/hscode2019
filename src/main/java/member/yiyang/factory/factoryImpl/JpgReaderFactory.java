package member.yiyang.factory.factoryImpl;

import member.yiyang.factory.Reader;
import member.yiyang.factory.ReaderFactory;
import member.yiyang.factory.readerImpl.JpgReader;

public class JpgReaderFactory implements ReaderFactory {

    public Reader getReader() {
        return new JpgReader();
    }
}
