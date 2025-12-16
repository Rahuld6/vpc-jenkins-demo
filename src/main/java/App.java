public class App {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Hello from Jenkins + ASG Java App!");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
