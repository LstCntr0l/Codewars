import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KataTest {
    @Test //test 0
    public void test1() {
        System.out.println("Score must be 0:");
        assertEquals(0, Greed.greedy(new int[]{2,2,3,4,6}));
    }
    @Test //test 1*1
    public void test2(){
        System.out.println("Score must be 1000:");
        assertEquals(100, Greed.greedy(new int[]{1,2,3,4,6}));
    }
    @Test //test 5*1
    public void test3(){
        System.out.println("Score must be 50:");
        assertEquals(50, Greed.greedy(new int[]{5,2,3,4,6}));
    }
    @Test //test 2
    public void test4(){
        System.out.println("Score must be 250:");
        assertEquals(250, Greed.greedy(new int[]{5,1,3,4,1}));
    }
    @Test //test 1*>3
    public void test5(){
        System.out.println("Score must be 1100:");
        assertEquals(1100, Greed.greedy(new int[]{1,1,1,3,1}));
    }
    @Test //test 4 and 5
    public void test6(){
        System.out.println("Score must be 450:");
        assertEquals(450, Greed.greedy(new int[]{2,4,4,5,4}));
    }
    @Test //test 1*>3 and 5
    public void test7(){
        System.out.println("Score must be 1150:");
        assertEquals(1150, Greed.greedy(new int[]{1,1,1,5,1}));
    }
    @Test //test 0
    public void test8(){
        System.out.println("Score must be 0:");
        assertEquals(0, Greed.greedy(new int[]{2,3,4,6,2}));
    }
    @Test //test 3 and 5
    public void test9(){
        System.out.println("Score must be 350:");
        assertEquals(350, Greed.greedy(new int[]{3,4,5,3,3}));
    }
    @Test //test 2 and 5
    public void test0(){
        System.out.println("Score must be 250:");
        assertEquals(250, Greed.greedy(new int[]{1,5,1,2,4}));
    }
    @Test //test 6 and 1
    public void test10(){
        System.out.println("Score must be 700:");
        assertEquals(700, Greed.greedy(new int[]{6,6,6,6,1}));
    }

    private static final Random rnd = new Random();

    @Test
    public void testRandomWithTriples() {

        for(int i=0; i<50; ++i) {

            int triple = rnd.nextInt(6) + 1;
            int single1 = rnd.nextInt(6) + 1;
            int single2 = rnd.nextInt(6) + 1;

            List<Integer> candidates = Arrays.asList(triple, triple, triple, single1, single2);
            Collections.shuffle(candidates);
            int[] dice = candidates.stream().mapToInt(Integer::valueOf).toArray();

            int expected = triple == 1 ? 1000 : triple * 100;
            expected += single1 == 1 ? 100 : (single1 == 5 ? 50 : 0);
            expected += single2 == 1 ? 100 : (single2 == 5 ? 50 : 0);
            assertEquals(expected, Greed.greedy(dice));
        }
    }

    @Test
    public void testRandomNoTriples() {

        List<Integer> candidates = Arrays.asList(1, 1, 2, 2, 3, 3 , 4, 4, 5, 5, 6 ,6);

        for(int i=0; i<50; ++i) {
            Collections.shuffle(candidates);
            int[] dice = candidates.subList(0,  5).stream().mapToInt(Integer::valueOf).toArray();
            int expected = 0;

            for(int die : dice) {
                expected += die == 1 ? 100 : (die == 5 ? 50 : 0);
            }
            assertEquals(expected, Greed.greedy(dice));
        }
    }
}