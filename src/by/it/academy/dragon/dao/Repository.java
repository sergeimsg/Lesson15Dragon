package by.it.academy.dragon.dao;

import by.it.academy.dragon.bean.DragonCave;
import by.it.academy.dragon.main.CaveDataPutter;

public class Repository {
        // ������ seangleton
    private final static DragonCave dragonCave = CaveDataPutter.createDragonCave();

    private Repository() {}
    public static DragonCave getDragonCave() {

        return dragonCave;
    }



}
