package part5;

import java.util.Scanner;

// Создать программу, которая будет проверять,
// является ли слово из пяти букв, введённое пользователем,
// палиндромом (примеры: «комок», «ротор»).
// Если введено слово не из 5 букв, то сообщать об ошибке.
// Программа должна нормально обрабатывать слово,
// даже если в нём использованы символы разного регистра.
// Например, слова «Комок» или «РОТОР» следует также считать палиндромами.
public class Task4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please, enter a word from 5 letters: ");
        String s=sc.nextLine();
        if(s.length()==5){
            s=s.toLowerCase();
            if(s.charAt(0)==s.charAt(4)&&s.charAt(1)==s.charAt(3)){
                System.out.println("A word is palindrome");
            } else {
                System.out.println("A word is not palindrome");
            }
        }
        else {
            System.out.println("A word must have 5 letters!");
        }
    }
}
