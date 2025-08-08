public class Rock implements Move {
    @Override
    public String getName() {
        return "Piedra";
    }

    @Override
    public boolean beats(Move other) {
        return other instanceof Scissors;
    }
}