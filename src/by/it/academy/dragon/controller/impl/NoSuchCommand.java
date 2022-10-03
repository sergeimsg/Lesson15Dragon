package by.it.academy.dragon.controller.impl;

import by.it.academy.dragon.controller.Command;
import by.it.academy.dragon.controller.CommandName;
import by.it.academy.dragon.dto.Response;
import by.it.academy.dragon.dto.Request;

public class NoSuchCommand implements Command {

    @Override
    public Response execute(Request request) {
        Response response = null;
        response.setCommandName(CommandName.NO_SUCH_COMMAND.toString());
        response.setErrorMessage("No Such Command");

        return response;
    }
}
