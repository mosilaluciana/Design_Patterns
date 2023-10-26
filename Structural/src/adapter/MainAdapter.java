package adapter;

public class MainAdapter {
    public static void main(String[] args) {
        RoundHole hole = new RoundHole(5);
        RoundPeg rpeg = new RoundPeg(5);
        System.out.println("Fits rpeg: " + hole.fits(rpeg)); // true

        SquarePeg small_sqpeg = new SquarePeg(5);
        SquarePeg large_sqpeg = new SquarePeg(10);

        // You can't directly use square pegs with round holes
        // hole.fits(small_sqpeg); // This won't compile (incompatible types)

        // Use the SquarePegAdapter to make square pegs compatible with round holes
        SquarePegAdapter small_sqpeg_adapter = new SquarePegAdapter(small_sqpeg);
        SquarePegAdapter large_sqpeg_adapter = new SquarePegAdapter(large_sqpeg);

        System.out.println("Fits small_sqpeg_adapter: " + hole.fits(small_sqpeg_adapter)); // true
        System.out.println("Fits large_sqpeg_adapter: " + hole.fits(large_sqpeg_adapter)); // false
    }
}
