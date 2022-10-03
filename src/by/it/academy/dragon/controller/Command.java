package by.it.academy.dragon.controller;

import by.it.academy.dragon.dto.Request;
import by.it.academy.dragon.dto.Response;


public interface Command {
    Response execute(Request request);
}
