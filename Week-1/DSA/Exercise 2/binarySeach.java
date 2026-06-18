public class binarySeach {
    public static int binarySearch(Product[] arr,String target) {
        int left=0;
        int right=arr.length-1;
        while(left<=right){
            int mid=(left+right)/2;
            int result=arr[mid].productName.compareTo(target);
            if(result==0){
                return mid;
            }
            if(result<0){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return -1;
    }
}
