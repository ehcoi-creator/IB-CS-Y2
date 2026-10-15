class testing{
    public static void main(String[] args) {
        filter test1 = new filter("127.0.0.1");
        System.out.println(test1.check());
        //accepted ip:127.0.0.1 hostname:localhost

        filter test2 = new filter("time.com"); System.out.println(test2.check());
        //rejected

        filter test3 = new filter("example.com"); System.out.println(test3.check());
        //accepted with ip:7.7.7.7 hostname:example.com

    }
}