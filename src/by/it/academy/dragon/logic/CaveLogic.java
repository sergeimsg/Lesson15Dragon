package by.it.academy.dragon.logic;

import by.it.academy.dragon.bean.DragonCave;
import by.it.academy.dragon.bean.Treasure;
import by.it.academy.dragon.dao.Repository;

import java.util.ArrayList;
import java.util.List;

public final class CaveLogic {

    private final DragonCave dragonCave = Repository.getDragonCave();

    private static final CaveLogic instance = new CaveLogic();

    private CaveLogic() {

    }


    public static CaveLogic getInstance() {

        return instance;
    }

    public Treasure selectMostExpensiveTreasure() {
        List<Treasure> treasures = dragonCave.getDragonTreasure();
        Treasure result;
        double maxPrice = treasures.get(0).getPrice();
        int maxPriceIndex = 0;
        for (int i = 0; i < treasures.size(); i++) {
            if (treasures.get(i).getPrice() >= maxPrice) {
                maxPrice = treasures.get(i).getPrice();
                //System.out.println("maxPrice" + maxPrice);
                maxPriceIndex = i;
            }

        }
        //System.out.println("maxPriceIndex" + maxPriceIndex);

        result = treasures.get(maxPriceIndex);
//        System.out.println(result);
        return result;
    }

    public List<Treasure> selectBySum(double requiredSum) {
        List<Treasure> treasures = dragonCave.getDragonTreasure();
        List<Treasure> result = new ArrayList<>();
        double sum = 0;
        boolean toContinue = false;

        while (!toContinue) {
            for (int i = 0; i < treasures.size(); i++) {
                Treasure currentTreasure = treasures.get(i);
                double currentTreasurePrice = treasures.get(i).getPrice();
                double currentSum = sum + currentTreasurePrice;

                if (currentSum <= requiredSum) {
                    result.add(currentTreasure);
                    sum = sum + currentTreasurePrice;
                } else {
                    toContinue = true;
                    break;
                }

            }

        }
        return result;

    }
}
