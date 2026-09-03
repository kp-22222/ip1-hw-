public class cincuenta_50 {
    interface Playable {
        void play();
    }
    static abstract class Instrument {
        abstract void tune();
    }
    static class Guitar extends Instrument implements Playable {
        @Override
        void tune() { System.out.println("Tuning guitar strings"); }
        @Override
        public void play() { System.out.println("Playing guitar"); }
    }

    public static void main(String[] args) {
        Guitar g = new Guitar();
        g.tune();
        g.play();
    }
}
