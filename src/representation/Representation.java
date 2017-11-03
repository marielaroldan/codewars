package representation;

public class Representation {

    private static final int DAYS_OF_THE_YEAR = 365;
    public static void main(String[] args) {
//        System.out.println(dayRepresented(new int[][] {{10,17},{200,207}}));
        System.out.println(dayRepresented(new int[][] {{4,5},{229,1},{55,90}}));
//        System.out.println(dayRepresented(new int[][] {{2,8},{220,367},{10,16},{10,15},{25,35}}));
    }
    public static int dayRepresented(int[][] trips){
        int numDaysTrips = 0;
        for (int i = 0; i < trips.length; i++) {
            int dayArrive = trips[i][0];
            int dayDeparture = trips[i][1];
            if(dayArrive>dayDeparture){
                if(dayArrive<dayDeparture){
                    if (dayDeparture>=DAYS_OF_THE_YEAR){
                        int differenceDays = DAYS_OF_THE_YEAR - dayDeparture;
                        numDaysTrips += (DAYS_OF_THE_YEAR - dayArrive) + differenceDays + 1;
                    }else{
                        numDaysTrips = getNumDaysTrips(numDaysTrips, dayArrive, dayDeparture);
                    }
                }
            }else {
                if (dayArrive>=DAYS_OF_THE_YEAR){
                    int days = dayArrive - DAYS_OF_THE_YEAR;
                    numDaysTrips += (days + 1) +dayDeparture;
                }else{
                    numDaysTrips = getNumDaysTrips(numDaysTrips, dayArrive, dayDeparture);
                }
            }
        }
        return numDaysTrips;
    }

    private static int getNumDaysTrips(int numDaysTrips, int dayArrive, int dayDeparture) {
        int dayOfTrip = dayDeparture - dayArrive;
        if(dayOfTrip<0){
            dayOfTrip = (DAYS_OF_THE_YEAR - dayArrive) + dayDeparture;
        }
        if(dayOfTrip==1){
            numDaysTrips += dayOfTrip;
        }else{
            numDaysTrips += (dayOfTrip+1);
        }
        return numDaysTrips;
    }
}
