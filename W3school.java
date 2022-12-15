public class W3school {
    public static void main(String[] args) {
    if (args.length < 1) {
        System.out.println("Please provide a double value as a command line argument");
        return;
    }

    try {
        double input = Double.parseDouble(args[0]);
        System.out.println("Your input value is: " + input);
    } catch (NumberFormatException e) {
        System.out.println("The provided argument is not a valid double value");
    }
    }

}
