import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public record dock(String tr, Integer num){

    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
        String str = "hello";

        Boolean strB = str.isBlank();
        System.out.println("strB = " + strB);

        dock dock = new dock("test", 3);
        System.out.println("dock.tr = " + dock.tr);
        System.out.println("dock.num = " + dock.num);

        String th = "my";
        switch (th){
            case "my" -> {
                System.out.println("th = " + th);
            }
            case "my1" -> {
                System.out.println("th1 = " + th);
            }
            default -> {
                System.out.println("str = " + str);
            }
        }
        Stream<String> stList = Stream.of("homne", "school", "work", "time");
        List<String> list = stList.collect(Collectors.toList());
        for(var str1 : list){
            System.out.println("str1 = " + str1);
        }

    }
}