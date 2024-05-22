public class BonusMilesService {
    public int calculate(int cost) {

        int bonusMili = 20;
        int price;
        price = cost;

        int miles = 0;
        if (price > bonusMili) {
            miles = price / bonusMili;
        }
        return miles;
    }
}
