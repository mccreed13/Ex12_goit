import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Exercise2 {
    public static void ex2(int num) {
        ExecutorService service = Executors.newFixedThreadPool(5);
        FizzBuzzService fizzBuzzService = new FizzBuzzService(num);
        service.submit(fizzBuzzService::fizz);
        service.submit(fizzBuzzService::buzz);
        service.submit(fizzBuzzService::fizzbuzz);
        service.submit(fizzBuzzService::number);
        service.submit(fizzBuzzService::print);
    }
}