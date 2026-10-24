import java.util.ArrayList;

public class challenges_45 {
    static void main(String[] args) {
        int[] arr = {1,4,2,8,5,9,0,9};
//        System.out.println(Search(arr,5,0));
//        System.out.println(SearchIndex(arr,9,0));
//        System.out.println(SearchIndexFromLast(arr,9,arr.length-1));
//        SearchAllIndex(arr,9,0);
//        System.out.println(list);
//        System.out.println(SearchAllIndexArraylist(arr,9,0,new ArrayList<>()));
        System.out.println(SearchAllIndexArraylist2(arr,9,0));
    }

    public static boolean Search(int[] arr,int target,int index){
        if(index == arr.length){
            return false;
        }
        return arr[index] == target || Search(arr,target,index+1);
    }

    public static int SearchIndex(int[] arr,int target,int index){
        if(index == arr.length){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }
        return  SearchIndex(arr,target,index+1);
    }

    public static int SearchIndexFromLast(int[] arr,int target,int index){
        if(index == -1){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }
        return SearchIndexFromLast(arr,target,index-1);
    }
    static ArrayList<Integer> list = new ArrayList<>();
    public static int SearchAllIndex(int[] arr,int target,int index){
        if(index == arr.length){
            return -1;
        }
        if(arr[index] == target){
            list.add(index);
        }
        return SearchAllIndex(arr,target,index+1);
    }

    public static ArrayList<Integer> SearchAllIndexArraylist(int[] arr,int target,int index,ArrayList<Integer> list){
        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        return SearchAllIndexArraylist(arr,target,index+1,list);
    }
// This approach is not efficient as it is creating the object again and again.Use above approach..
    public static ArrayList<Integer> SearchAllIndexArraylist2(int[] arr,int target,int index){
        ArrayList<Integer>list = new ArrayList<>();
        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        ArrayList<Integer> ansfromBelowCalls =  SearchAllIndexArraylist2(arr,target,index+1);
        list.addAll(ansfromBelowCalls);
        return list;
    }
}
