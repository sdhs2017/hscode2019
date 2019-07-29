package member.Kristen.pattern.adaptor1.Demo1;

/**
 * 这里用了2个interface
 * Adaptor class 只实现了一个接口，然后再创建了一个另一个class的object
 */
public class Adaptor implements USB {
    MacBook macBook;

    /**
     *
     * @param macBook
     */
    public Adaptor(MacBook macBook){
        this.macBook=macBook;
    }

    /**
     * 这样在main里叫USB的transFiles的时候通过adptor叫了type_c的transData
     */
    public void transFiles(){
        macBook.transData();
    }

}
