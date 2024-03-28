import org.testng.annotations.Test;

public class GroupingDemo {

    @Test(groups = {"group1"})
    void test1() {
        System.out.println("test1");
    }

    @Test(groups = {"group1"})
    void test2() {
        System.out.println("test2");
    }

    @Test(groups = {"group2"})
    void test3() {
        System.out.println("test3");
    }

    @Test(groups = "group2")
    void test4() {
        System.out.println("test4");
    }

    @Test(groups = {"group1", "group2"})
    void test5() {
        System.out.println("test5");
    }

}
