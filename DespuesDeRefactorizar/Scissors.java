public class Scissors implements Move {
    @Override
    public String getName() {
        return "Tijera";
    }

    @Override
    public boolean beats(Move other) {
        return other instanceof Paper;
    }
}