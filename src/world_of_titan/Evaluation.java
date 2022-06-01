package world_of_titan;

import static java.lang.Math.abs;
import java.util.*; // PriorityQueue, Scanner, ArrayList

public class Evaluation {

    /**
     * findKillPriority(): accepts an Integer to generate titans and compute
     * kill sequence & distance moved.
     *
     * required helper function: generateTitan()
     */
    public void findKillPriority() {
        Scanner s = new Scanner(System.in);
        boolean t;
        int a = 0;

        do {
            try {
                System.out.print("Number of Titans: ");
                a = s.nextInt();
                t = false;

                if (a < 0) {
                    System.out.println("Positive integer only");
                    t = true;
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("Please key in an integer only......");
                t = true;
            }
        } while (t);

        generateTitan(a);
    }

    /**
     * generateTitan(int numOfTitan): generates given number of titans and
     * compute kill sequence & distance moved
     *
     * @param numOfTitan: value provided by evaluate(), used to generate given
     * number of titans
     */
    private void generateTitan(int numOfTitan) {
        System.out.println("\nGenerating " + numOfTitan + " Titans ....");

        PriorityQueue<Titan> pq = new PriorityQueue<>();
        PriorityQueue<Titan> pqtmp = new PriorityQueue<>();

        for (int i = 1; i <= numOfTitan; i++) {
            pqtmp.add(new Titan(i));
        }

        while (!pqtmp.isEmpty()) {
            pq.add(pqtmp.poll());
        }

        System.out.print("\nSequence to be killed: ");

        int initial = 0;
        int distance = 0;
        int sequence;
        int counter = 0;

        for (Titan titan : pq) {
            sequence = titan.getIndex();
            if (counter == pq.size() - 1) {
                System.out.print("Titan " + sequence);
            } else {
                System.out.print("Titan " + sequence + " --> ");
            }
            distance += abs(sequence - initial);
            initial = sequence;

            counter++;
        }

        System.out.println("\nTotal distance moved: " + distance);
    }

    /**
     * findWeakWall(): accepts an Integer to accept a following number of brick
     * layers, then output the weakest part of the wall.
     *
     * Requires helper function computeWeakWall().
     */
    public void findWeakWall() {
        boolean t;
        int b = 0;

        do {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter number of layers: ");
                b = scanner.nextInt();
                if ((b >= -2147483647 && b <= 2147483646)) {
                    t = false;
                } else {
                    t = true;
                }
            } catch (InputMismatchException e) {
                System.out.println("Please enter an integer.");
                t = true;
            }
        } while (t);

        computeWeakWall(b);
    }

    /**
     * computeWeakWall(int numOfLayer): accepts given number of brick layer data
     * to find the weakest part of the wall.
     *
     * @param numOfLayer: value given by findWeakWall, to accept following
     * number of brick layer data.
     */
    private void computeWeakWall(int numOfLayer) {
        String input;
        List<List<Integer>> walls = new ArrayList<>();
        List<Integer> edges = new ArrayList<>();

        int max = 0;
        do {
            edges.clear();
            for (int i = 1; i <= numOfLayer; i++) {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter brick edges of layer " + i + ": ");
                input = scanner.nextLine();
                if (!input.isBlank()) {
                    String[] arr = input.split(" ");
                    for (String string : arr) {
                        int temp = Integer.parseInt(string);
                        edges.add(temp);
                        if (temp >= max) {
                            max = temp;
                        }
                    }
                } else {
                    System.out.println("Please enter a number...");
                    break;
                }
                if (max == 0) {
                    System.out.println("Please enter any number larger than 0.");
                    break;
                }
            }
        } while (max == 0);

        walls.add(edges);
        List<Integer> index = walls.get(0);
        WallOfMaria wom = new WallOfMaria();

        System.out.println("\nWeakest part of the wall is at position " + wom.getMost(index, max + 1));
    }
}
