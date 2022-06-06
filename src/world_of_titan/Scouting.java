package world_of_titan;

import java.io.*; // FileInputStream, FileNotFoundException
import java.util.*; // ArryaList, LinkedList, Scanner, InputMismatchException

public class Scouting {

    // set up 2.3 Scouting Mission inside the Wall data here
    // store all mapNode data
    private ArrayList<LinkedList> map = new ArrayList();
    private int start, numOfVertices;
    private boolean hasCycle = false;
    private ArrayList<Integer> cycle = new ArrayList();
    private String error;

    /**
     * mapNode(): constructs a new mapNode to be added to map. A complete
     * mapNode will be in the format: [a, b, c...] a = current mapNode's value
     * b, c = subsequent adjacent mapNode's value For example, [0, 1, 5, 7]
     * means mapNode "0" is adjacent to "1", "5" and "7".
     *
     * @param startingValue: current mapNode's own value
     * @param numberOfAdjacentNodes: number of mapNodes adjacent to current
     * mapNode
     * @param values: an array of every adjacent mapNode value
     */
    public void mapNode(int startingValue, int numberOfAdjacentNodes, int[] values) {
        LinkedList mapNode = new LinkedList();

        mapNode.addLast(startingValue);
        for (int i = 0; i < numberOfAdjacentNodes; i++) {
            mapNode.addLast(values[i]);
        }

        map.add(mapNode);
    }

    // to view current map data
    @Override
    public String toString() {
        return "Map: " + map.toString()
                + "\nNodes: " + map.size();
    }

    // getter method for mapNode
    private LinkedList getMapNode(int index) {
        return map.get(index);
    }

    /**
     * loadMap(String filename): reads a .txt file to initialize a map for
     * various uses.
     *
     * this function should be invoked as early as possible, as a lot of
     * functions rely on map data.
     *
     * @param filename: name of the .txt file, case sensitive
     */
    public void loadMap(String filename) {
        try {
            Scanner read = new Scanner(new FileInputStream(filename));
            while (read.hasNextLine()) {
                String input = read.nextLine();
                String[] inputList = input.split(" ");
                int[] numberList = new int[inputList.length];

                for (int i = 0; i < numberList.length; i++) {
                    numberList[i] = Integer.parseInt(inputList[i]);
                }

                int[] values = new int[numberList.length - 2];
                System.arraycopy(numberList, 2, values, 0, numberList.length - 2);

                mapNode(numberList[0], numberList[1], values);
            }
            numOfVertices = map.size();

            read.close();
            System.out.println("\nMap fully loaded.");
        } catch (FileNotFoundException e) {
            System.out.println("\nFile not found");
        }
    }

    /**
     * scoutPath(): accepts one integer then construct a path to search all
     * points without repetition, aka Hamiltonian cycle. output path if found,
     * else output no path found. may output multiple paths. required helper
     * function: findCycle(), solve()
     */
    public void scoutPath() {
        int input = -1;
        boolean incorrectInput;
        // while loop to make sure user provide a logical input
        do {
            // loops if non-integer
            try {
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter starting point: ");
                input = sc.nextInt();
                // break loop if all conditions are fulfilled
                incorrectInput = false;
                // loops if out of range
                if (input < 0 || input >= map.size()) {
                    System.out.println("Exceed range");
                    System.out.printf("Currently available: 0~%d\n", map.size() - 1);
                    incorrectInput = true;
                }
            } catch (InputMismatchException e) {
                System.out.println("Accept integer only");
                incorrectInput = true;
            }
        } while (incorrectInput);

        findCycle(input);
        System.out.println("");
    }

    /**
     * findCycle(int input): initialize variables to start searching a
     * Hamiltonian cycle. output failure if no cycle is found over here accepts
     * argument from findPath()
     *
     * @param input: starting point to find a Hamiltonian cycle.
     */
    public void findCycle(int input) {
        start = input;
        cycle.add(start);
        boolean[] visited = new boolean[numOfVertices];
        visited[start] = true;
        solve(start, visited);

        if (!hasCycle) {
            System.out.println("\nNo path found.\n");
        }

        cycle.clear(); // in case reuse
    }

    /**
     * solve(int vertex, Boolean[] visited): search path for Hamiltonian cycle.
     * navigate mapNode once at a time, it checks all adjacent mapNode then
     * jumps to the next available mapNode. if reach dead end, it back tracks
     * and choose next available mapNode. output success if there is any
     * possible cycle found
     *
     * @param vertex: current mapNode pointer value
     * @param visited: checklist for whether a mapNode has been saved into the
     * path or not.
     */
    private void solve(int vertex, boolean[] visited) {
        if (vertex == start && cycle.size() == numOfVertices + 1) {
            hasCycle = true;
            System.out.println("\nPath found!\n");
            for (int i = 0; i < cycle.size() - 1; i++) {
                System.out.print(cycle.get(i) + "-->");
            }
            System.out.println(cycle.get(cycle.size() - 1));
            return;
        }

        if (cycle.size() == numOfVertices) {
            visited[start] = false;
        } else {
            visited[start] = true;
        }

        for (int i = 1; i < getMapNode(vertex).size(); i++) {
            int neighbourVertex = (int) getMapNode(vertex).get(i);

            if (!visited[neighbourVertex]) {
                visited[neighbourVertex] = true;
                cycle.add(neighbourVertex);

                solve(neighbourVertex, visited);

                visited[neighbourVertex] = false;
                cycle.remove(cycle.size() - 1);
            }
        }
    }

    /**
     * findTitan() : looks for the shortest path between zero and titan.
     *
     * It prompts the user to provide Titan's location in positive integer, and
     * will loop the prompt if the user provides input other than that. After
     * the input is accepted, it will invoke BFS() to compute.
     */
    public void findTitan() {
        int input = -1;
        boolean incorrectInput;

        do {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter location of Titan: ");
                input = sc.nextInt();
                incorrectInput = false;
                if (input < 0 || input >= map.size()) {
                    System.out.println("Exceed range");
                    System.out.printf("Currently available: 0~%d\n", map.size() - 1);
                    incorrectInput = true;
                }
            } catch (InputMismatchException e) {
                System.out.println("Accept integer only");
                incorrectInput = true;
            }
        } while (incorrectInput);

        BFS(input);
    }

    /**
     * BFS(int input) : computes the shortest path from zero to the given input.
     *
     * BFS aka Breadth First Search, uses a queue to traverse through the map.
     * It enqeueues all neighboring vertex before moving on to the next level,
     * then dequeues to enqueue all neighboring vertex in the next level. After
     * a path is found, it will invoke findShortestPath() to output.
     *
     * @param input : value provided from findTitan(), set as destination.
     */
    public void BFS(int input) {
        boolean[] visited = new boolean[numOfVertices];
        int[] prevVertex = new int[numOfVertices];
        // int[] distance is used to verify whether it is the shortest path, as it may found a longer path earlier.
//        int[] distance = new int[numOfVertices];
        Queue<Integer> queue = new Queue();
        int vertex = 0;

        // initialise value for later use
        for (int i = 0; i < numOfVertices; i++) {
            prevVertex[i] = -1;
//            distance[i] = Integer.MAX_VALUE;
        }

        queue.enqueue(vertex);
        visited[vertex] = true;
//        distance[vertex] = 0;

        while (!queue.isEmpty()) {
            vertex = queue.dequeue();

            if (vertex == input) {
                break;
            }

            for (int i = 1; i < getMapNode(vertex).size(); i++) {

                int neighbourVertex = (int) getMapNode(vertex).get(i);

                if (!visited[neighbourVertex]) {
                    visited[neighbourVertex] = true;
//                    distance[neighbourVertex] = distance[vertex] + 1;
                    prevVertex[neighbourVertex] = vertex;
                    queue.enqueue(neighbourVertex);
                }
            }
        }

        findShortestPath(input, prevVertex);
    }

    /**
     * findShortestPath(int destination, int[] prevVertex, int[]distance) :
     * accepts result from BFS() and print it in a clear manner.
     *
     * This function initializes an ArrayList to save the path when tracing back
     * from data given by BFS(), then outputs the ArrayList in an easy way to
     * observe.
     *
     * @param int destination : value carried over from findTitan(), used to
     * locate data required to be output.
     * @param int[] prevVertex : data processed by BFS(), used to trace the
     * found path.
     */
    private void findShortestPath(int destination, int[] prevVertex) {
        ArrayList<Integer> path = new ArrayList();
        int current = destination;
        path.add(current);

        while (prevVertex[current] != -1) {
            path.add(prevVertex[current]);
            current = prevVertex[current];
        }

        System.out.println("Best path:");
        for (int i = path.size() - 1; i > 0; i--) {
            System.out.print(path.get(i) + "-->");
        }
        System.out.println(path.get(0));

        // Assumption map won't change
        // Attempt to show multiple path
        boolean hasSix = false;
        for (int element : path) {
            if (element == 6) {
                hasSix = true;
                break;
            }
        }
        if (hasSix) {
            for (int i = 0; i < path.size(); i++) {
                if (path.get(i) == 1) {
                    path.set(i, 5);
                    break;
                }
                if (path.get(i) == 5) {
                    path.set(i, 1);
                    break;
                }
            }
            for (int i = path.size() - 1; i > 0; i--) {
                System.out.print(path.get(i) + "-->");
            }
            System.out.println(path.get(0));
        }

        System.out.println("");
    }

    /**
     * isNumeric(String text): checks whether the given string can be converted
     * to an integer.
     *
     * @param text: string to be checked
     */
    public boolean isNumeric(String text) {
        try {
            Integer.parseInt(text);
        } catch (NumberFormatException e) {
            error = "Positive integer only";
            return false;
        }
        return true;
    }

    /**
     * withinRange(String text): checks whether the given value is within the
     * map's range.
     *
     * This function assumes the string is guaranteed to be able to convert into
     * an integer.
     *
     * @param text: string to be checked
     */
    public boolean withinRange(String text) {
        int value = Integer.parseInt(text);
        try {
            if (value < 0 || value >= map.size()) {
                throw new Exception("Exceed range\nCurrently available: 0~" + (map.size() - 1));
            }
            return true;
        } catch (Exception e) {
            error = e.getMessage();
            return false;
        }
    }

    /**
     * getErrorMessage(): getter method for Scouting 'error' field.
     */
    public String getErrorMessage() {
        return error;
    }
}
