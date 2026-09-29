package ConditionalStatement;

public class BrowserHeadlessSwitch {

    public static void main(String[] args) {

        String browser = "chrome";
        boolean headless = true;

        switch (browser.toLowerCase()) {

        case "chrome":
            if (headless) {
                System.out.println("Chrome headless");
            } else {
                System.out.println("Chrome Normal");
            }
            break;

        case "firefox":
            if (headless) {
                System.out.println("FireFox headless");
            } else {
                System.out.println("Firefox normal");
            }
            break;

        case "edge":
            if (headless) {
                System.out.println("Edge headless");
            } else {
                System.out.println("Edge normal");
            }
            break;

        default:
            System.out.println("Unsupported browser");
        }
    }
}
