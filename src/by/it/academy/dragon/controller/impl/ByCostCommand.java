package by.it.academy.dragon.controller.impl;

import by.it.academy.dragon.bean.Treasure;
import by.it.academy.dragon.controller.Command;
import by.it.academy.dragon.dto.Response;
import by.it.academy.dragon.dto.Request;
import by.it.academy.dragon.logic.CaveLogic;

import java.util.ArrayList;
import java.util.List;

public class ByCostCommand implements Command {

    private final CaveLogic caveLogic =CaveLogic.getInstance();
    @Override
    public Response execute(Request request) {
        Response response = null;

        String commandName = request.getCommandName();
        double totalSum = request.getRequiredSum();
        List<Treasure> treasuresBySum = caveLogic.selectBySum(totalSum);
        response = new Response(commandName, treasuresBySum);

        return response;
    }
}
