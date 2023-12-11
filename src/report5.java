class report5 {
    public static void main(String[] args) {
        try {
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException a) {
            System.out.println("NullPointerException occurred.");
            System.out.println(a.getMessage());
        }
    }
}
