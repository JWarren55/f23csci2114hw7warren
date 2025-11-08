public class warren15 {
    // Starting in the top left corner of a 2 x 2 grid,
    // and only being able to move to the right and down, 
    // there are exactly 6 routes to the bottom right corner.
    //
    // .__.__.  |  .__.  .  |  .__.  .
    // .  .  |  |  .  |__.  |  .  |  .
    // .  .  |  |  .  .  |  |  .  |__.
    //
    // .  .  .  |  .  .  .  |  .  .  .
    // |__.__.  |  |__.  .  |  |  .  .
    // .  .  |  |  .  |__.  |  |__.__.
    //
    // How many such routes are there through a 20 x 20 grid?

    public static void main(String[] args) {
        // 40 choose 20
        // 40! / 20!(20-40)! == 40! / 20!20! 

        // 20 x 20 grid = path 40 long
        // take 40
        int size = 40; // possible path
        // choose 20
        int length = 20; // 20 lines till the end

        // i! / k!(i-k!)
        long ans = 1;
        long k = 1;
        for (int i = size; i > length; --i) {
            ans *=i;
            ans /= k;
            k++;
        }
        System.out.println(ans);
    }
}
