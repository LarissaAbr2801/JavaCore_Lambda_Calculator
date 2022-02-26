public class Main {

    public static void main(String[] args)throws ArithmeticException {
	Calculator calculator = Calculator.instance.get();
        int a = calculator.plus.apply(1, 2);
        int b = calculator.minus.apply(1,1);
        int c = calculator.divide.apply(a, b); //ошибка возникала из-за деления на ноль (арифметическая):
        //В строке 7 происходит деление a на b, b получается равное 0 в строке 6 (1-1=0).
        //Проблему можно решить, если добавить проверку деления на ноль (см. строку 8 класса Calculator)
        calculator.println.accept(c);
    }
}
