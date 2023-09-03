public class Vetor {

    private int[] array;

    public Vetor(int[] array) {
        this.array = array;
    }

    public int get(int index) {
        return array[index];
    }

    public int size() {
        return array.length;
    }



}
