import java.util.ArrayList;

public class Pocket implements Storage {

    private ArrayList<String> insidePocket = new ArrayList<>();

    @Override
    public void addItem(String itemName) {
        insidePocket.add(itemName);
    }

    @Override
    public void removeItem(String itemName) {
        int insideInitialSize = insidePocket.size();
        int insideAfterLoop = 0;

        for (int insideCounter = 0; insideCounter < insidePocket.size(); insideCounter++) {
            if (insidePocket.get(insideCounter).equals(itemName)) {
                insidePocket.remove(itemName);
            }
            insideAfterLoop = insidePocket.size();
        }

        if (insideInitialSize != insideAfterLoop) {
            System.out.println(itemName + " was removed from the magic pocket.");
        }
        else {
            System.out.println(itemName + " was not inside the magic pocket. No removal was necessary.");
        }
    }

    @Override
    public void printItems() {
        System.out.println(insidePocket.toString());
    }

    @Override
    public int getNumItems() {
        System.out.println("Number of items in magic pocket: " + insidePocket.size());
        return 0;
    }
}
