public class EnoughSpace {



    public static int enough(int cap, int on, int wait) {

        int space = cap - on;
        if ((space) <= wait) {
            int spaceToWait = wait - space;
            if (spaceToWait <= wait) {
                return spaceToWait;
            } else {
                return 0;
            }
        }
        return 0;
    }
}
