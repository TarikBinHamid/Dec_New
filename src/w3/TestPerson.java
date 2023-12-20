package w3;

public class TestPerson {
    public static void main(String[] args) {
      Person person1=new Person("Tarik", 37);

//      person1.setName("Tarik");
//      person1.setAge(25);

        System.out.println(person1.getName());
        System.out.println(person1.getAge());


        Rectangle rectangle=new Rectangle();
        rectangle.setLength(6.9);
        rectangle.setWidth(8.5);
        System.out.println(rectangle.calculateAreaOfRectangle());
        System.out.println(rectangle.calculatePerimeterOfRectangle());

    }
}
