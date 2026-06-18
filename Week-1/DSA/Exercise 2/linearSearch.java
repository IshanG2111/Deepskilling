public class linearSearch {
    public static int search(Product[] arr,String target) {
        for(int i=0;i<arr.length;i++){
            if(arr[i].productName.equals(target)){
                return i;
            }
        }
        return -1;
    }
}
