public class GeneralPurposeHeap<T>{
    private final int jeneralSize = 1000000;
    private T[] arr;
    private int cuurentElementsAmount = 0;

    public GeneralPurposeHeap(){
        this.arr = (T[]) new Object[jeneralSize];
    }

    public GeneralPurposeHeap(int initialCapacity) {
        this.arr = (T[]) new Object[initialCapacity];
    }

    public GeneralPurposeHeap(T[] initialData) {
        int counter = 0;
        while (initialData[counter] != null) {
            counter++;
        }
        this.cuurentElementsAmount = counter;
        this.arr = initialData;
    }

    public void insert (T element) {
        precUp(0, element, this.cuurentElementsAmount, this.arr);
        cuurentElementsAmount++;
    }

    public T findMin() {
        return arr[0] != null ? arr[0] : null;
    }
    
    public int gitSize () {
        return 1;
    }

    public T deleteMin() {
        
        cuurentElementsAmount--;
        return;
    }

    public void mergeHeap (GeneralPurposeHeap <T > otherHeap ) {
        int counter = 0;
        while (otherHeap.arr[counter] != null) {
            counter++;
        }
        this.cuurentElementsAmount += counter;
        
    }

    private void precDown(int index, T newValue, int cuurentElementsAmount, T[] array) {
        if()
    }

    private void precUp(int index, T newValue, T[] arr) {
        boolean hasCompareToMethod = false;
        if (arr[0] != null){
            var a = arr[0].getClass().getMethods();
            for(int i = 0; i < a.length; i++){
                if(a[i].getName().equals("compareTo")) {
                    hasCompareToMethod = true;
                }
            }
        }

        int indexParrent = index/2;
        if(index == 1){
            arr[1] = newValue;
        } else if(arr) {

        } else {
            arr[index] = arr[indexParrent];
            precUp(indexParrent, newValue, arr);
        }

    }

}
