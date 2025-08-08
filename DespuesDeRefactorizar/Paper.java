public class Paper implements Move {
    @Override
    public String getName() {
        return "Papel";
    }

    @Override
    public boolean beats(Move other) {
        return other instanceof Rock;
    }
}