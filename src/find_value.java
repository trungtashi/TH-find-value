import java.util.Scanner;

public class find_value {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String [] arr = {"a", "b", "c", "d","n","r","t","y","u","i","q"};
        String input_word = scanner.nextLine();
        boolean check = false;
        for (int i = 0; i < arr.length; i++){
            if(arr[i].equals(input_word)){
                System.out.println("Position of " + input_word + " is: " + (i+1) );
                check = true;
                break;
            }
        }
        if(!check){
            System.out.println(input_word + " does not exist in arr");
        }
    }
}
