public class ComputeInitials {
    public static void main(String[] args) {
        String name = String.valueOf(args[0]);

        // Take out the first letter of the name
        String initials = "";
        for (int i = 0; i < name.length(); i++) {
            char c = name.charAt(i);
            if (Character.isUpperCase(c)) {
                initials += c;
            }
        }
        System.out.println("My initials are: " + initials);
    }

}