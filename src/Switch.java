class Switch {
    public static void main(String[] args) {
       defineLevel("dfg");
       defineLevel("guest");
        System.out.println(defineLevel("guest"));
    }

    private static int defineLevel(String role) {

        return switch (role) {
            case "guest" -> 0;
            case "client" -> 1;
            case "moderator" -> 2;
            case "admin" -> 3;
            default -> {
                System.out.println("non-authentic role = " + role);
                yield -1;
            }
        };
    }


}
