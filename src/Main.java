import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

    /*
    Реализуйте 3 метода, чтобы в каждом из них получить разные исключения Посмотрите на код,
    и подумайте сколько разных типов исключений вы тут сможете получить?

    в первом методе мы обрабатываем 4 разных варианта ситуаций
    во втором методе мы оставляем default для обработки не задокументированных кейсов
    в третьем через try catch мы парсим строку хотя могли бы через hasNextInt
     */
    int[] array = {1, 2, 3, 4, 5, 6, 7};
//            int[] array = {};
//        int a = 5;
//        int a = 8;

    int a = getValueFromUser();
    System.out.println(getArrayLenght(array,a));
    System.out.println(getValueError(getArrayLenght(array,a)));
    }
    private static int getArrayLenght(int[] array, int a){
        int min = 4;
//        int min = 10;
        if (array == null){
            return -3;
        }
        if (array.length < 1){
            return -4;
        }
        if (array.length < min){
            return -1;
        }
        for(int i = 0; i<array.length;i++){
            if(array[i]==a){
                return i;
            }
        }
        return -2;
    }
    private static String getValueError(int a){
        switch (a){
            case (-1):
                return "длина массива меньше порога";
            case (-2):
                return "искомый элемент не найден";
            case (-3):
                return "вместо массива пришел null";
            case (-4):
                return "массив пришел пустой";
            default:
                return "индекс элемента "+Integer.toString(a);
        }
    }

    private static int getValueFromUser(){
        Scanner scanner = new Scanner(System.in);
//        scanner.hasNextInt()
        String str = scanner.nextLine();
        int i = 0;
        try {
            i = Integer.valueOf(str);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        scanner.close();
        return i;

    }
}