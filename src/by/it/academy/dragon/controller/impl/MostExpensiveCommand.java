package by.it.academy.dragon.controller.impl;

import by.it.academy.dragon.bean.Treasure;
import by.it.academy.dragon.controller.Command;
import by.it.academy.dragon.controller.CommandName;
import by.it.academy.dragon.dto.Response;
import by.it.academy.dragon.logic.CaveLogic;
import by.it.academy.dragon.dto.Request;

public class MostExpensiveCommand implements Command {

    private final CaveLogic caveLogic = CaveLogic.getInstance();

    @Override
    public Response execute(Request request) {
        Response response = null;


        Treasure mostExpensiveTreasure = caveLogic.selectMostExpensiveTreasure();
        String operationName = request.getCommandName();
      //  System.out.println("operationName" + operationName);
        response = new Response(request.getCommandName(), mostExpensiveTreasure);
        //response.setCommandName(CommandName.MOST_EXPENSIVE.toString());
        //response.setTreasure(treasure);

        return response;
    }
}
