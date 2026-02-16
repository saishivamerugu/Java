package Optional.CheckValue;

import java.util.Optional;

public class CheckValueInsideOptional {
	public static void main(String[] args) {

        Optional<String> name = Optional.of("Sai");

        if(name.isPresent()) {
            System.out.println("Value is present");
            System.out.println(name.get());
        }
        
        name.ifPresent(value -> {
            System.out.println("Value is: " + value);
        });
        
        
        Optional<String> names = Optional.empty();
        System.out.println(names.get());  // 💥 NoSuchElementException
//        get() without checking = dangerous
//
//        We will cover safe methods next.
    }
}
