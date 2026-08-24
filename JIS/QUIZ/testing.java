class testing{
  public static void main(String[] args) {
    checker test1 = new checker("hello");
    System.out.println(test1.test);
    //False
    checker test2 = new checker("192.45.7.201");
    System.out.println(test2.test);
    //True

  }
}
