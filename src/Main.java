public class Main {
    public static void main(String[] args) {
        /*
        1. W Main dodaj strukturę try catch finally w której powstanie błąd w wyniku
           dzielenia przez zero. Złap ArithmeticException i wywołaj na wyjątku printStackTrace()
           W finally pokaż informację o wywołaniu tego bloku kodu w konsoli.
        2. Dodaj strukturę try catch i stwórz oraz wywołaj włąsny wyjątek TestException.
           Stwórz klasę wyjątku w osobnym pliku. Wywołaj printStackTrace na wyjątku.
        */

        try {
            int x = 1/0;

    }
        catch (ArithmeticException e){
            e.printStackTrace();
        }
        finally {
            System.out.println("Program wykonuje się do końca");
        }


        try {
            throw new TestException();
            } catch (TestException e) {
            e.printStackTrace();
        }

    }
}