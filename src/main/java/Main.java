import ru.netology.sqr.squares.service.SQRService;

public class Main {
    public static void main(String[] args) {
        int upperBount;
        int lowerBount;
        SQRService service = new SQRService();
        int sqrt= service.calcSqr(-300 , 100);
        System.out.println("Количество квадратов в установленом диапазоне :" +sqrt);

    }
}


