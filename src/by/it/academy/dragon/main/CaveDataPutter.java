package by.it.academy.dragon.main;

import by.it.academy.dragon.bean.DragonCave;
import by.it.academy.dragon.bean.Treasure;

import java.util.ArrayList;
import java.util.List;

public class CaveDataPutter {



        public static DragonCave createDragonCave() {
            DragonCave dragonCave = null;

            List<Treasure> treasures = new ArrayList<>();

            Treasure treasure1 = new Treasure("ring","gold", 1500);
            Treasure treasure2 = new Treasure("necklace","diamond", 2500 );
            Treasure treasure3 = new Treasure("pendant", "bronze", 950);
            Treasure treasure4 = new Treasure("ring", "platinum", 3900);
            Treasure treasure5 = new Treasure("necklace", "gold", 14500);
            Treasure treasure6 = new Treasure("pendant", "platinum", 2950);

            treasures.add(treasure1);
            treasures.add(treasure2);
            treasures.add(treasure3);
            treasures.add(treasure4);
            treasures.add(treasure5);
            treasures.add(treasure6);

            dragonCave =new DragonCave(treasures);
            return dragonCave;
        }
}
