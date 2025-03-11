public class main {
    public static void main(String[] args) {
        SimpleLogger a = new SimpleLogger();
        SmartLogger b = new SmartLogger();
        a.log("я простой");
        b.log("я сложный");
        b.log("я очень сложный и умею считать");
        b.log("eRRor");
    }
}
