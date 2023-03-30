public class Main {
    public static void main(String[] args) {
        printMultiples(multiples(7, 5));

        printMultiples(multiples(12, 10));

        printMultiples(multiples(17, 6));
    }

    public static int[] multiples(int num, int length) {
        int[] numMultiples = new int[length];
        int multiple = 1;

        for (int i = 0; i < length; i++) {
            numMultiples[i] = num * multiple;
            multiple++;
        }

        return numMultiples;
    }

    public static void printMultiples(int[] numMultiples) {
        int length = numMultiples.length;

        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < length; i++) {
            int temp = numMultiples[i];
            sb.append(temp);

            if (i < length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");

        System.out.println(sb);
    }
}
