public class ComputerStore {
    public static void main(String[] args) {
        Computer comp1 = new Computer("Intel i5", 16); // wpisujemy parametry
        // zgodnie z tymi zadeklarowanymi w konstruktorze
        comp1.price = 3.599;
        Computer comp2 = new Computer("AMD RYZEN 135", 32);

        comp1.printInfo();
        comp2.printInfo();
    }
}
