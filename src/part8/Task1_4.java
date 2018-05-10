package part8;

// В массиве хранится 7 явно заданных текстовых строк.
// Создать программу, которая отсортирует и выведет на экран
// строки в алфавитном порядке.

// Например, если были даны такие строки:   Программа должна вывести на экран:
// Пушкин                                   Есенин
// Лермонтов                                Лермонтов
// Некрасов                                 Некрасов
// Толстой Л. Н.                            Паустовский
// Толстой А. Н.                            Пушкин
// Есенин                                   Толстой А. Н.
// Паустовский                              Толстой Л. Н.

// Указание: прежде всего надо создать метод, устанавливающий отношения порядка
// для двух строк, переданных методу через аргументы.

public class Task1_4 {
    public static void main(String[] args) {
        String[] array=new String[]{"Pushkin","Lermontov","Nekrasov","Tolstoy L.N.","Tolstoy A.N.","Esenin","nekrasov","Paustovsiy"};
        printArray(array);
        sortArray(array);
        printArray(array);
    }

    public static String[] sortArray(String[] array){
        boolean sorted;
        String bigger;
        do{
            sorted=true;
            for (int i=1; i<array.length; i++){
                if(compWords(array[i-1], array[i])==1){
                    bigger=array[i-1];
                    array[i-1]=array[i];
                    array[i]=bigger;
                    sorted=false;
                }
            }
        }while(sorted!=true);
        return array;
    }

    public static int compWords(String word1, String word2){
        int len;
        word1=word1.toLowerCase();
        word2=word2.toLowerCase();
        if(word1.length()<=word2.length()){
            len=word1.length();
        } else{
            len=word2.length();
        }
        for (int i=0; i<len; i++){
            if(word1.charAt(i)==word2.charAt(i)){
                continue;
            } else if (word1.charAt(i)<word2.charAt(i)) {
                return -1;
            } else {
                return 1;
            }
        }
        return -1;
    }

    public static void printArray(String[] array){
        for (int i=0;i<array.length; i++ ) {
            System.out.print(array[i]+"; ");
        }
        System.out.println();
    }
}
