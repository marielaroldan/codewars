package LinkedList;

public class Linkedfy {

    private static final String CONECTOR = " -> ";

    public static String stringify(Node list) {
        StringBuilder str = new StringBuilder();
        Node current = list;
        while(current!=null){
            str.append(current.getData());
            str.append(CONECTOR);
            current = current.getNext();
        }
        str.append("null");
        return str.toString();
    }

}
