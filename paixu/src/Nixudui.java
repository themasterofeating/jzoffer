public class Nixudui {
    public int InversePairs(int [] array) {
        long sum = 0l;
        for(int i=0;i<array.length-1;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[i]>array[j])
                    sum++;
            }
        }
        return (int)(sum%1000000007);
    }
}
