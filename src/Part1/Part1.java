package Part1;

public class Part1 {
    public static void main(String[] args) {
        //part 1
        //Create an instance of Part1.Class1 and assign it to variable obj1
        Class1 obj1 = new Class1();
        //assign it also to variable obj2 and obj3
        Class1 obj2 = obj1;
        Class1 obj3 = obj1;
        System.out.println("obj1.value = " + obj1.value);
        //Change the property of the instance
        obj1.value = 3;
        //And see that value has changed in all three variables
        //because the instance is the same
        System.out.println("value changed");
        System.out.println("obj1.value = " + obj1.value);
        System.out.println("obj2.value = " + obj2.value);
        System.out.println("obj3.value = " + obj3.value);

        //part 2
        System.out.println("obj1.value = " + obj1.value);
        //Change the property of the instance in a method
        method(obj1);
        //And see that value has changed in the variable
        //because the instance is still the same
        System.out.println("Method called");
        System.out.println("obj1.value = " + obj1.value);
    }

    static void method(Class1 obj) {
        obj.value = 123456;
    }
}
