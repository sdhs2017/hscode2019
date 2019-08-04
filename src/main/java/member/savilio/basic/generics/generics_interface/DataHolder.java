package member.savilio.basic.generics.generics_interface;

/**
 * 如果泛型接口传入类型参数时，实现该泛型接口的实现类，则所有使用泛型的地方都要替换成传入的实参类型。
 */
class DataHolder implements Generator<String>{
    @Override
    public String next() {
        return "空";
    }

    @Override
    public String next2(String s) {
        return s;
    }
}