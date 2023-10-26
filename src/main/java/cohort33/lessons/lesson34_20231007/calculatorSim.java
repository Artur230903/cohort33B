package cohort33.lessons.lesson34_20231007;

public class calculatorSim {

  public int add(int a, int b) {
    return a + b;
  }

  public int substract(int a, int b) {
    return a - b;
  }

  public int multyply(int a, int b) {
    return a * b;
  }

  public double divide(int a, int b) {
    if (b == 0){
      System.out.println("Divide 0!!!");
      return -1;
    }
    else{
      return (double) a / b;
    }
  }


}
