public class ExampleClass {
    public int triangle(int a, int b, int c) throws MyException {
        if (testValue(a, b, c)) throw new MyException("Длина стороны треугольника не может быть 0 или меньше");
        int p = (a + b + c) / 2;
        double result = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        int result2 = (int) result;
        return result2;
    }
    public boolean testValue(int a, int b, int c){
        return a <= 0 || b <= 0 || c <= 0;
    }
}
