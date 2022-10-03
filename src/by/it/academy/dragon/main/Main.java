package by.it.academy.dragon.main;

import by.it.academy.dragon.bean.Treasure;
import by.it.academy.dragon.controller.CaveController;
import by.it.academy.dragon.controller.CommandName;
import by.it.academy.dragon.dto.Request;
import by.it.academy.dragon.dto.Response;
import by.it.academy.dragon.output.Output;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        CaveController controller = new CaveController();
        Output output =Output.getInstance();
        Request request1 = new Request(CommandName.MOST_EXPENSIVE.name());
        Response response1 = controller.doAction(request1);
        System.out.println("Most expensive treasure");
        output.printJustTreasure(response1.getTreasure());
        System.out.println("On total sum 5000");

        Request request2 = new Request(CommandName.BY_SUM.name(), 5000);
        Response response2 = controller.doAction(request2);
        output.printTreasureList(response2.getTreasures());


    }
}