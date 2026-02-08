public class MultiplyTwoNumbers {

    public static void main(String[] args) {

        // ✅ Build Version (Very useful in real projects)
        String buildVersion = "v2.0";
        System.out.println("Application Build Version: " + buildVersion);

        float first = 1.5f;
        float second = 2.0f;

        float product = first * second;

        System.out.println("The product is: " + product);

        // ✅ Jenkins Trigger Message
        System.out.println("Build triggered successfully from Jenkins!");

        // ✅ Extra Change (timestamp)
        System.out.println("Build Time: " + java.time.LocalDateTime.now());
    }
}
