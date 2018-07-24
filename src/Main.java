import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> squadList = new ArrayList<String>();
        squadList.add("bob");
        squadList.add("john");
        squadList.add("kenn");
        squadList.add("kevin");
        squadList.remove("kenn");
        System.out.println(squadList);
        System.out.println(squadList.size());
        System.out.println(squadList.get(2));
    }
}
