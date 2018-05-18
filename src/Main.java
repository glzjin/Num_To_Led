import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner ins_scanner = new Scanner(System.in);
        String str_input = ins_scanner.next();

        char char_array_input[] = str_input.toCharArray();

        char char_array_output[][] = new char[3][char_array_input.length * 4];
        for(int i = 0; i < char_array_input.length; i++) {
            int_to_led_show(i, char_array_input[i], char_array_output);
        }

        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < char_array_input.length * 4; j++) {
                System.out.print(char_array_output[i][j]);
            }
            System.out.println();
        }
    }

    public static void int_to_led_show(int index, int num, char[][] char_array_input) {
        char char_array_single_output[][];
        switch(num) {
            case '0':
                char_array_single_output = new char[][]{
                        {'.', '_', '.' , ' '},
                        {'|', '.', '|' , ' '},
                        {'|', '_', '|' , ' '}
                };
                break;
            case '1':
                char_array_single_output = new char[][]{
                        {'.', '.', '.' , ' '},
                        {'.', '.', '|' , ' '},
                        {'.', '.', '|' , ' '}
                };
                break;
            case '2':
                char_array_single_output = new char[][]{
                        {'.', '_', '.' , ' '},
                        {'.', '_', '|' , ' '},
                        {'|', '_', '.' , ' '}
                };
                break;
            case '3':
                char_array_single_output = new char[][]{
                        {'.', '_', '.' , ' '},
                        {'.', '_', '|' , ' '},
                        {'.', '_', '|' , ' '}
                };
                break;
            case '4':
                char_array_single_output = new char[][]{
                        {'.', '.', '.' , ' '},
                        {'|', '_', '|' , ' '},
                        {'.', '.', '|' , ' '}
                };
                break;
            case '5':
                char_array_single_output = new char[][]{
                        {'.', '_', '.' , ' '},
                        {'|', '_', '.' , ' '},
                        {'.', '_', '|' , ' '}
                };
                break;
            case '6':
                char_array_single_output = new char[][]{
                        {'.', '_', '.' , ' '},
                        {'|', '_', '.' , ' '},
                        {'|', '_', '|' , ' '}
                };
                break;
            case '7':
                char_array_single_output = new char[][]{
                        {'.', '_', '.' , ' '},
                        {'.', '.', '|' , ' '},
                        {'.', '.', '|' , ' '}
                };
                break;
            case '8':
                char_array_single_output = new char[][]{
                        {'.', '_', '.' , ' '},
                        {'|', '_', '|' , ' '},
                        {'|', '_', '|' , ' '}
                };
                break;
            default:
                char_array_single_output = new char[][]{
                        {'.', '_', '.' , ' '},
                        {'|', '_', '|' , ' '},
                        {'.', '.', '|' , ' '}
                };
                break;
        }

        for(int i = 0; i < 3; i++) {
            for(int j = index * 4; j < index * 4 + 4; j++) {
                char_array_input[i][j] = char_array_single_output[i][j - (index * 4)];
            }
        }


    }

}
