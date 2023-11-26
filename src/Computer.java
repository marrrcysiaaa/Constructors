public class Computer {
    String processor;
    int memory;
    double price;

Computer(String processor, int memory){ // konstruktor, któremu nadajemy parametry//
    this.processor = processor;
    this.memory = memory;


}

    void printInfo() {
        System.out.println(processor + ", " + memory + " GB RAM," + " cena: " + price + " zł");}

}
