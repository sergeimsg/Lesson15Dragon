package by.it.academy.dragon.dto;

import java.util.Objects;

public class Request {

    private String commandName;
    private double requiredSum;

    public Request() {
    }

    public Request(String commandName) {

        this.commandName = commandName;
    }

    public Request(String commandName, double requiredSum) {
        this.commandName = commandName;
        this.requiredSum = requiredSum;
    }

    public String getCommandName() {

        return commandName;
    }

    public void setCommandName(String commandName) {

        this.commandName = commandName;
    }

    public double getRequiredSum() {

        return requiredSum;
    }

    public void setRequiredSum(double requiredSum) {

        this.requiredSum = requiredSum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Request)) return false;
        Request request = (Request) o;
        return Double.compare(request.getRequiredSum(), getRequiredSum()) == 0 && Objects.equals(getCommandName(), request.getCommandName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCommandName(), getRequiredSum());
    }

    @Override
    public String toString() {
        return "Request{" +
                "commandName='" + commandName + '\'' +
                ", requiredSum=" + requiredSum +
                '}';
    }
}
