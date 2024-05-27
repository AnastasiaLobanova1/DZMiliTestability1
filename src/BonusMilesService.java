public class BonusMilesService {
    public int calculate(int cost) {

        int bonusMiles = 20;
        int price;
        price = cost;

        int miles = 0;
        if (price >= bonusMiles) {
            miles = price / bonusMiles;
        }
        return miles;
    }
}
