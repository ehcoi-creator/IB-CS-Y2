class testing{
  public static void main(String[] args) {
    porter test1 = new porter("http","192.45.7.201");
    System.out.println(test1.build());

    porter test2 = new porter("xbox","192.45.7.201");
    System.out.println(test2.build());

  }
}
