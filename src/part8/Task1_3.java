package part8;

// Создать метод, который будет сортировать указанный массив
// по возрастанию любым известным вам способом.

public class Task1_3 {
    public static int[] sortArray(int[] array){
        boolean sorted;
        int bigger;
        do{
            sorted=true;
            for (int i=1; i<array.length; i++){
                if(array[i]<array[i-1]){
                    bigger=array[i-1];
                    array[i-1]=array[i];
                    array[i]=bigger;
                    sorted=false;
                }
            }
        }while(sorted!=true);
        return array;
    }
}
