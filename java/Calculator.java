public class Calculator {
  int a;
  int b;

  public static void main(String[] args) {
    Calculator cal = new Calculator();
    int sumOf = cal.addition(2, 56);
    System.out.println("The sum of two numbers is " + sumOf);

    Calculator substra = new Calculator();
    int minusOf = substra.subtraction(2, 56);
    System.out.println("The difference of two numbers is " + minusOf);

    Calculator multip = new Calculator();
    int mull = multip.multiplication(2, 56);
    System.out.println("The multiplication of two numbers is " + mull);

    Calculator divi = new Calculator();
    int divv = divi.division(2, 56);
    System.out.println("The division of two numbers is " + divv);
  }

  int addition(int input1, int input2) {
    a = input1;
    b = input2;
    int sum = (a + b);
    return sum;
  }

  int subtraction(int input3, int input4) {
    a = input3;
    b = input4;
    int minus = (a - b);
    return minus;
  }

  int multiplication(int input1, int input2) {
    a = input1;
    b = input2;
    int mul = (a * b);
    return mul;
  }

  int division(int input1, int input2) {
    a = input1;
    b = input2;
    int div = (a / b);
    return div;
  }
}
