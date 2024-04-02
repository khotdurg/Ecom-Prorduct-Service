package LLD1.Concurrency.Callable;

import java.util.concurrent.Callable;


public class Demo implements Callable<String> {
    @Override
    public String call()  {
        return "callable call method is called";
    }
}
