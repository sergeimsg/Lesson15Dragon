package by.it.academy.dragon.controller;

import by.it.academy.dragon.dto.Request;
import by.it.academy.dragon.dto.Response;

public class CaveController {
    //private final CaveLogic caveLogic = CaveLogic.getInstance();
    private final CommandProvider provider = new CommandProvider();
            //CommandProvider.getInstance();
    public Response doAction(Request request) {
        String commandName = request.getCommandName();
      //  System.out.println("commandName"+commandName);
        Command command = provider.getCommand(commandName);
        //System.out.println("do action");
        Response response = command.execute(request);

        return response;
    }
}
