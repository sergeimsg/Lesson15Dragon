package by.it.academy.dragon.output;

import by.it.academy.dragon.bean.Treasure;
import by.it.academy.dragon.dto.Response;

import java.util.List;

public class Output {

    private static final Output instance = new Output();

    private Output() {

    }

    public static Output getInstance() {
        return instance;

    }

    public void printTreasureList(List<Treasure> treasures) {

        for (Treasure treasure : treasures) {

            System.out.println("Treasure name "+treasure.getTreasureName()+
                    " material " + treasure.getTreasureMaterial()+
                    " price "+ treasure.getPrice());

        }

    }



    public void printJustTreasure(Treasure treasure) {

        {

            System.out.printf("treasure - %5s ; material -  %5s ; price %5s \n",treasure.getTreasureName(),treasure.getTreasureMaterial(),
                    treasure.getPrice());

        }
    }

    public void printNoSuchCommand(Response response) {

        System.out.println(response.getCommandName() + response.getErrorMessage());


    }


}
