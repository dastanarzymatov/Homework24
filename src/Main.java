import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {


        Set<Integer>num=new HashSet<>();
        num.add(3);
        num.add(2);
        num.add(1);

        Set<Integer>nums=new HashSet<>();
        nums.add(2);
        nums.add(1);
        nums.add(0);

        System.out.println(symmetricDifference(num,nums));
    }
    public static Set<Integer> symmetricDifference (Set<Integer > num, Set<Integer> nums) {
        Set<Integer>number=new HashSet<>(num);
        number.removeAll(nums);
        nums.removeAll(num);
        number.addAll(nums);



        return number;
    }

}