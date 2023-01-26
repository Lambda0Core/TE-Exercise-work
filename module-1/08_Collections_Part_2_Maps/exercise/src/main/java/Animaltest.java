import java.util.HashMap;
import java.util.Map;

public class Animaltest {
    public static void main(String[] args) {
        int paulMoney = 50000;
        int peterMoney = 100000;
        int peterMoneyPartner = 0;
        if (peterMoney >= 100000 && paulMoney >= 50000){
            paulMoney /=4;
            peterMoney /=4;
            peterMoneyPartner = paulMoney + peterMoney;
        }

        System.out.println(paulMoney);
    }
}
