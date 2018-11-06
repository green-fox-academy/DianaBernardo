public class ToDoPrint {
    public static void main(String... args) {

        String todoText = " - Buy milk\n";
        // Add "My todo:" to the beginning of the todoText
        // Add " - Download games" to the end of the todoText
        // Add " - Diablo" to the end of the todoText but with indention

        // Expected outpt:

        // My todo:
        //  - Buy milk
        //  - Download games
        //      - Diablo

        StringBuilder a = new StringBuilder(todoText);
        a.insert(0, "My todo:\n");

        StringBuilder b = new StringBuilder(todoText);
        b.append(" - Download games \n");
        b.append("  - Diablo");

        todoText = a.toString()+b.toString();

        System.out.println(todoText);
    }

}
