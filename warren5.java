public class warren5 {
    // 2520 is the smallest number that can be divided by each of the
    // numbers from 1 to 10 without any remainder.
    //
    // What is the smallest positive number that is evenly divisible
    // by all of the numbers from 1 to 20?
    public static void main(String[] args) {
        //program checks for:  1,  2,  _,  4,  5,  _,  _,  _,  _, 10
        //                    __, __, __, __, __, __, __, __, 19, 20
        int smallestNumber = 0;

        // number will end in 0
        int i = 40;
        while(smallestNumber == 0) {
            //2*10 = 4*5 = 20
            //program checks for:  1,  2,  _,  4,  5,  _,  _,  _,  _, 10
            //                    __, __, __, __, __, __, __, __, __, 20
            i+= 20;

            // independent numbers 19, 17, 13, 11
            // program checks for:  1,  2,  _,  4,  5,  _,  _,  _,  _, 10
            //                     11, __, 13, __, __, __, 17, __, 19, 20
            if(i % 19 == 0 && i % 17 == 0 && i % 13 == 0 && i % 11 == 0) {
            // 2*9 = 3*6 = 18
            // program checks for:  1,  2,  3,  4,  5,  6,  _,  _,  9, 10
            //                     11, __, 13, __, __, __, 17, 18, 19, 20
                if(i % 18 == 0) {
            // 2 * 8
            // program checks for:  1,  2,  3,  4,  5,  6,  _,  8,  9, 10
            //                     11, __, 13, __, __, 16, 17, 18, 19, 20
                    if(i % 16 == 0) {
            // 3 * 5 = 15
            // program checks for:  1,  2,  3,  4,  5,  6,  _,  8,  9, 10
            //                     11, __, 13, __, 15, 16, 17, 18, 19, 20
                        if(i % 15 == 0) {
            // 2*7 = 14
            // program checks for:  1,  2,  3,  4,  5,  6,  7,  8,  9, 10
            //                     11, __, 13, 14, 15, 16, 17, 18, 19, 20
                            if(i % 14 == 0) {
            // 2*6 = 3*4 = 12
            // program checks for:  1,  2,  3,  4,  5,  6,  7,  8,  9, 10
            //                     11, 12, 13, 14, 15, 16, 17, 18, 19, 20
                                if(i % 12 == 0) {
                                    smallestNumber = i;
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println(smallestNumber);
    }
}
