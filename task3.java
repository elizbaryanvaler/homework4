public class task3 {
    public static void main(String[] args) {
        int myarray []= {-1,-4,7,8,6,-7,-58,-47,64,17,13};
        int cout_of_positives = 0;
        int cout_of_negatives = 0;

        for(int i = 0; i< myarray.length; i++){
            if(myarray[i] >= 0){
                cout_of_positives ++;
            }
        }
        cout_of_negatives = myarray.length - cout_of_positives;
        int arr_positivs [] = new int[cout_of_positives];
        int arr_negatives [] = new int[cout_of_negatives];
        for(int i = 0,pi = 0,ni = 0; i< myarray.length; i++){
            if(myarray[i] >= 0){
                arr_positivs[pi++] = myarray[i];
            }else{
                arr_negatives[ni++] = myarray[i];
            }
        }
        System.out.println("drakanneri array");
        for (int i = 0;i < arr_positivs.length; i++){
            System.out.println(arr_positivs[i]);
        }
        System.out.println("bacasakanneri array");
        for (int i = 0;i < arr_negatives.length; i++){
            System.out.println(arr_negatives[i]);
        }
    }
}
