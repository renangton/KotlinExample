package chapter3;

public class Chapter3Java {
  public static void main(String[] args) {
    HelloByKotlin helloByKotlin = new HelloByKotlin();
    helloByKotlin.printHello();

    System.out.println(CompanyConstants.Companion.getMaxEmployeeCount());
    System.out.println(CompanyConstants.getMaxEmployeeCount());
  }
}
