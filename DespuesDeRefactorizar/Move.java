public interface Move {
    String getName();

    boolean beats(Move other);
}