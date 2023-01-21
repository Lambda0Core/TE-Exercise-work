public class Test {
    public static void main(String[] args) {

        int[] arrayToLoopThrough = { 3, 4, 2, 9 };

        int counter = 0; // Must be started outside the block so that have access to it after the block

        for (int i = 0; i < arrayToLoopThrough.length; i++) {
            counter++;
            System.out.println(arrayToLoopThrough);
        }
    }
}
