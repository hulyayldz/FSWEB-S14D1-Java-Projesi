import com.workintech.inheritance.*;
import com.workintech.inheritance.company.HRManager;

import com.workintech.inheritance.company.JuniorDevelepor;
import com.workintech.inheritance.company.MidDeveloper;
import com.workintech.inheritance.company.SeniorDeveloper;

public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle(3.75);

        System.out.println("circle.radius= " + circle.getRadius());

        System.out.println("circle.area= " + circle.getArea());

        Cylinder cylinder = new Cylinder(5.55, 7.25);

        System.out.println("cylinder.radius= " + cylinder.getRadius());

        System.out.println("cylinder.height= " + cylinder.getHeight());

        System.out.println("cylinder.area= " + cylinder.getArea());

        System.out.println("cylinder.volume= " + cylinder.getVolume());
        System.out.println("*************");
        Rectangle rectangle = new Rectangle(5, 10);

        System.out.println("rectangle.width= " + rectangle.getWidth());

        System.out.println("rectangle.length= " + rectangle.getLength());

        System.out.println("rectangle.area= " + rectangle.getArea());

        Cuboid cuboid = new Cuboid(5, 10, 5);

        System.out.println("cuboid.width= " + cuboid.getWidth());

        System.out.println("cuboid.length= " + cuboid.getLength());

        System.out.println("cuboid.area= " + cuboid.getArea());

        System.out.println("cuboid.height= " + cuboid.getHeight());

        System.out.println("cuboid.volume= " + cuboid.getVolume());
        System.out.println("*************");
        JuniorDevelepor junior1 = new JuniorDevelepor(1, "Ali", 123121412);
        JuniorDevelepor junior2 = new JuniorDevelepor(1, "Ali", 12);
        junior1.work();
        junior2.work();
        System.out.println(junior1);
        System.out.println(junior2);

        MidDeveloper mid1 = new MidDeveloper(3, "Joe", 424323);
        MidDeveloper mid2 = new MidDeveloper(4, "Jonothan the third", 123123);
        mid1.work();
        mid2.work();
        System.out.println(mid1);
        System.out.println(mid2);

        SeniorDeveloper senior1 = new SeniorDeveloper(5, "Mufasa", 12424);
        senior1.work();
        System.out.println(senior1);

        System.out.println("************************");
        HRManager hrManager = new HRManager(6, "Dogancan",899999,
                new JuniorDevelepor[5], new MidDeveloper[2], new SeniorDeveloper[1]);
        hrManager.work();
        hrManager.addEmployee(0, junior1);
        hrManager.addEmployee(1, junior2);
        hrManager.addEmployee(0, mid1);
        hrManager.addEmployee(1, mid2);
        hrManager.addEmployee(0, senior1);
        System.out.println(hrManager);

    }
}
