public class TestException extends Exception {
    public TestException() {
        super("Własna treść błędu!");
    }
/*
    public TestException(String message) {
        super(message);
    }

    public int test(int number) throws TestException {
        if (1 == 1) throw new TestException();
        return 1;
    }
    */
}