package demo;

/**
 * Created by kirill.marchuk on 07.10.2019
 */
public class Dummy {
    public int calculatePension(int age) {
        if (age<20) {
            return 0;
        } else if (age < 45) {
            return 1000;
        } else {
            return 10000;
        }
    }
}
