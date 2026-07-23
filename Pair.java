public class Pair {
        String word;
        int count;

        Pair(String word, int count) {
            this.word = word;
            this.count=count;
        }

        @Override
        public String toString() {
            return "(" + word + "," + count + ")";
        }
    }