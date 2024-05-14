package opencloseprinciple;

import java.util.List;

public class Demo {

    public static void main(String[] args) {

        Product apple = new Product("Apple", Color.RED, Size.SMALL);
        Product berry = new Product("Berry", Color.BLUE, Size.LARGE);
        Product house = new Product("House", Color.BLUE, Size.SMALL);

        System.out.println("OLD WAY");
        System.out.println("-".repeat(30));
        System.out.println("Filter by color:");
        ProductFilter productFilter = new ProductFilter();
        productFilter.filterByColor(List.of(apple, berry, house), Color.BLUE)
                .forEach(System.out::println);
        System.out.println("Filter by size:");
        productFilter.filterBySize(List.of(apple, berry, house), Size.LARGE)
                .forEach(System.out::println);



        System.out.println("\n\nNEW WAY");
        System.out.println("-".repeat(30));
        System.out.println("Filter by color:");
        BetterFilter betterFilter = new BetterFilter();
        betterFilter.filter(List.of(apple, berry, house), new ColorSpecification(Color.BLUE))
                .forEach(System.out::println);
        System.out.println("Filter by color and size:");
        betterFilter.filter(List.of(apple, berry, house), new AndSpecification<Product>(
                new ColorSpecification(Color.RED),
                new SizeSpecification(Size.SMALL)))
                .forEach(System.out::println);
    }
}
