class testing{
  public static void main(String[] args) {
    dns test1 = new dns("google.com");
    System.out.println(test1.lookup());

    dns test2 = new dns("jisedu.or.id");
    System.out.println(test2.lookup());

  }
}
