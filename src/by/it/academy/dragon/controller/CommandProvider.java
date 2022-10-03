package by.it.academy.dragon.controller;

import by.it.academy.dragon.controller.impl.ByCostCommand;
import by.it.academy.dragon.controller.impl.MostExpensiveCommand;
import by.it.academy.dragon.controller.impl.NoSuchCommand;

import java.util.HashMap;
import java.util.Map;

public class CommandProvider {
    private Map<CommandName, Command> commands = new HashMap<>();

    public CommandProvider() {
        commands.put(CommandName.MOST_EXPENSIVE, new MostExpensiveCommand());
        commands.put(CommandName.BY_SUM, new ByCostCommand());
        commands.put(CommandName.NO_SUCH_COMMAND, new NoSuchCommand());

    }

    public Command getCommand(String nameOfcommand) {

        CommandName commandName;
        Command command;
        try {
            commandName = CommandName.valueOf(nameOfcommand);
            command = commands.get(commandName);
            if (command == null) {
                command = commands.get(CommandName.NO_SUCH_COMMAND);
            }

        } catch (Exception e) {
            command = commands.get(CommandName.NO_SUCH_COMMAND);
        }
        return command;
    }
}
