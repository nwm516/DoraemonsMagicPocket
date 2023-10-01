public class Main {
    public static void main(String[] args) {

        Pocket magicPocket = new Pocket();

        magicPocket.addItem("Infinite ladder");
        magicPocket.addItem("Tanuki Suit");
        magicPocket.addItem("Eye of Dracula");
        magicPocket.printItems();
        System.out.println();

        magicPocket.removeItem("Eye of Dracula");
        magicPocket.printItems();
        magicPocket.getNumItems();
        System.out.println();

        magicPocket.removeItem("Super Yo-yo");
        System.out.println();

        magicPocket.addItem("Super Yo-yo");
        magicPocket.printItems();
        magicPocket.getNumItems();
    }
}
