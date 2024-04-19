public class MoltDriver implements Comparable<MoltDriver>{
    private int id;
    private String name;
    private int nextAvailableTimeForDelivery;

    public MoltDriver ( int id , String name , int nextAvailableTimeForDelivery ) {
        this.id = id;
        this.name = name;
        this.nextAvailableTimeForDelivery = nextAvailableTimeForDelivery;
    }

    public void incrementTotalOrdersDelivered (){
        this.nextAvailableTimeForDelivery++;
    }

    public int getNextAvailableTimeForDelivery () {
        return this.nextAvailableTimeForDelivery;
    }

    public void setNextAvailableTimeForDelivery ( int time ) {
        if(time > 0) {
            this.nextAvailableTimeForDelivery = time;
        }
    }

    public String getName () {
        return this.name;
    }

    public String toString () {
        return "";
    }

    public int compareTo ( MoltDriver otherDriver ) {
          /*
         * This method returns the value zero if (this.nextAvailableTimeForDelivery==otherOrder.priority), 
         * if (this.nextAvailableTimeForDelivery < otherOrder.nextAvailableTimeForDelivery) then it returns a value less than zero 
         * and if (this.nextAvailableTimeForDelivery > otherOrder.nextAvailableTimeForDelivery) then it returns a value greater than zero.
         */
        return  Integer.compare(this.nextAvailableTimeForDelivery, otherDriver.nextAvailableTimeForDelivery);
    }
}