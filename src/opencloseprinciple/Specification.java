package opencloseprinciple;

public interface Specification<T> {
    boolean isSatisfied(T item);
}
