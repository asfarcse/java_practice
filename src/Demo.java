import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Demo {

    /**
     * Don't change this method.
     */
    public static int getSum(List<Integer> value) {
        int sum = 0;
        for (int i : value) {
            sum += i;
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        return sum;
    }

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        List<Integer> list = IntStream.rangeClosed(1, 10000)
                .boxed()
                .map(n -> ThreadLocalRandom.current().nextInt(0, 11))
                .collect(Collectors.toList());

        long start1 = System.currentTimeMillis();

        System.out.println(list.size());

        List<Integer> list1 = list.stream().limit(1000).collect(Collectors.toList());
        List<Integer> list2 = list.stream().skip(1000).limit(1000).collect(Collectors.toList());
        List<Integer> list3 = list.stream().skip(2000).limit(1000).collect(Collectors.toList());
        List<Integer> list4 = list.stream().skip(3000).limit(1000).collect(Collectors.toList());
        List<Integer> list5 = list.stream().skip(4000).limit(1000).collect(Collectors.toList());
        List<Integer> list6 = list.stream().skip(5000).limit(1000).collect(Collectors.toList());
        List<Integer> list7 = list.stream().skip(6000).limit(1000).collect(Collectors.toList());
        List<Integer> list8 = list.stream().skip(7000).limit(1000).collect(Collectors.toList());
        List<Integer> list9 = list.stream().skip(8000).limit(1000).collect(Collectors.toList());
        List<Integer> list10 = list.stream().skip(9000).limit(1000).collect(Collectors.toList());

        int summ = 0;

        ExecutorService es = Executors.newFixedThreadPool(10);

        Callable<Integer> call1 = () -> Hii.getSum(list1);
        Callable<Integer> call2 = () -> Hii.getSum(list2);
        Callable<Integer> call3 = () -> Hii.getSum(list3);
        Callable<Integer> call4 = () -> Hii.getSum(list4);
        Callable<Integer> call5 = () -> Hii.getSum(list5);
        Callable<Integer> call6 = () -> Hii.getSum(list6);
        Callable<Integer> call7 = () -> Hii.getSum(list7);
        Callable<Integer> call8 = () -> Hii.getSum(list8);
        Callable<Integer> call9 = () -> Hii.getSum(list9);
        Callable<Integer> call10 = () -> Hii.getSum(list10);

        List<Callable<Integer>> callables = List.of(call1, call2, call3, call4, call5, call6, call7, call8, call9, call10);
        List<Future<Integer>> futures = es.invokeAll(callables);

        for (Future<Integer> future : futures) {
            summ += future.get();
        }

        es.shutdown();

        System.out.println("Executed in : " + (System.currentTimeMillis() - start1) + ", sum is : " + summ);
    }
}
