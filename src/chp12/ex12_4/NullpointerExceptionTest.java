package chp12.ex12_4;

import java.util.ArrayList;

public class NullpointerExceptionTest {
    ArrayList<String> listNames = new ArrayList<>();

    public void addName(String name) {
        listNames.add(name);
    }

    public void printAllNames() {
        for (String name : listNames) {
            System.out.println(name);
        }
    }
}
