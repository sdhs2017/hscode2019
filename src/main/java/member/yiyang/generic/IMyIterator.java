package member.yiyang.generic;

/**
 * 根据迭代器扩展泛型
 * 接口泛型
 * @param <T>
 */
public interface IMyIterator<T> {
    boolean hasNext();
    T next();
}
