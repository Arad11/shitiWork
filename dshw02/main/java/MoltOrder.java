public class MoltOrder implements Comparable<MoltOrder>{
    private String name;
    private int timeNeededToDeliver;
    private int priority;
    private int orderReadyTime;
    private String orderDescription;

    public MoltOrder ( String name , String orderDescription , int orderReadyTime , int
    timeNeededToDeliver , int priority ) {
        if(timeNeededToDeliver > 0 && orderReadyTime > 0) {
            this.name = name;
            this.timeNeededToDeliver = timeNeededToDeliver;
            this.priority = priority;
            this.orderReadyTime = orderReadyTime;
            this.orderDescription = orderDescription;
        }
    }

    public int getOrderReadyTime () {
        return this.orderReadyTime;
    }

    public int getTimeNeededToDeliver () {
        return this.timeNeededToDeliver;
    }

    public String getName() {
        return this.name;
    }

    public String getOrderDescription() {
        return this.orderDescription;
    }

    public int compareTo(MoltOrder otherOrder){
        /*
         * This method returns the value zero if (this.priority==otherOrder.priority), 
         * if (this.priority < otherOrder.priority) then it returns a value less than zero 
         * and if (this.priority > otherOrder.priority) then it returns a value greater than zero.
         */
        return Integer.compare(this.priority, otherOrder.priority);
    }

    public String toString() {
        return ""; // complete - I dont know what text should be printed..
    }

}
