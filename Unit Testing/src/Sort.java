
public class Sort {

    public int [] sortList(int [] array){

        int length = array.length;
        int [] sortedArray = new int[length];
        System.arraycopy(array, 0, sortedArray, 0, length);

        for(int i=0;i<length;i++){

            for(int j=i+1;j<length;j++){

                if(sortedArray[i] < sortedArray[j]){
                    int temp = sortedArray[i];
                    sortedArray[i] = sortedArray[j];
                    sortedArray[j] = temp;
                }
            }
        }

        return sortedArray;
    }


}
