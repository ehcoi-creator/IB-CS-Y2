class testing{
    public static void main(String[] args) {
        dns test1 = new dns("google.com");
        System.out.println(test1.lookup());
        //142.250.72.14

        dns test2 = new dns("jisedu.or.id");
        System.out.println(test2.lookup());
        //hostname not on record table. Use register() to add a new hostname:IP pair

    }
}