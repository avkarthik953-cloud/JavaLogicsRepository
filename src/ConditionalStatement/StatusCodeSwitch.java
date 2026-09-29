package ConditionalStatement;

public class StatusCodeSwitch {

    public static void main(String[] args) {

        int statuscode = 204;

        switch (statuscode) {
        case 200:
            System.out.println("Success");
            break;
        case 201:
            System.out.println("Created");
            break;
        case 400:
            System.out.println("Bad Request");
            break;
        case 401:
            System.out.println("Unauthorized");
            break;
        case 403:
            System.out.println("Forbidden");
            break;
        case 404:
            System.out.println("Not found");
            break;
        case 500:
            System.out.println("Internal Server Error");
            break;
        default:
            System.out.println("Unknown Status");
        }
    }
}
