public interface IRedBlackTree<T extends Comparable<T>> {
    void add(T o);
    boolean remove(T o);
    boolean contains(T o);
}