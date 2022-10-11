class BinarySearch{
    static void BinarySearching(int []Array,int Target,int start,int end){
        if(start<=end){
            int mid=(start+end)/2;
            if(Array[mid]==Target){
                System.out.println("\nTarget "+Target+ " Found at "+mid);
            
            }
            else if(Array[mid]>=Target){
                    BinarySearching(Array,Target,start,mid-1);
            }
            else if(Array[mid]<=Target){
                    BinarySearching(Array,Target,mid+1,end);
            }
                
        }
        else{
            System.out.println("\nTarget "+Target+" is Not Present");
        }
    }
    public static void main(String[] args){
        int []Array={12,34,45,46,47,48,49,50};
        int Target=500;
        BinarySearching(Array,Target,0,Array.length-1);

    }
 
}