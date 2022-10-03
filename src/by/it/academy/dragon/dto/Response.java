package by.it.academy.dragon.dto;

import by.it.academy.dragon.bean.Treasure;

import java.util.List;
import java.util.Objects;

public class Response {

        private String commandName;
        private Treasure treasure;
        private List<Treasure> treasures;
        private String errorMessage;

        public Response() {
        }

        public Response(String commandName, Treasure treasure) {
                this.commandName = commandName;
                this.treasure = treasure;
        }



        public Response(String commandName, List<Treasure> treasures) {
                this.commandName = commandName;

                this.treasures = treasures;

        }

        public Response(String commandName, String errorMessage) {
                this.commandName = commandName;
                this.errorMessage = errorMessage;
        }


        public String getCommandName() {
                return commandName;
        }

        public void setCommandName(String commandName) {
                this.commandName = commandName;
        }

        public Treasure getTreasure() {
                return treasure;
        }

        public void setTreasure(Treasure treasure) {
                this.treasure = treasure;
        }

        public List<Treasure> getTreasures() {
                return treasures;
        }

        public void setTreasures(List<Treasure> treasures) {
                this.treasures = treasures;
        }

        public String getErrorMessage() {
                return errorMessage;
        }

        public void setErrorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
        }

        @Override
        public boolean equals(Object o) {
                if (this == o) return true;
                if (!(o instanceof Response)) return false;
                Response response = (Response) o;
                return Objects.equals(getCommandName(), response.getCommandName()) && Objects.equals(getTreasure(), response.getTreasure()) && Objects.equals(getTreasures(), response.getTreasures()) && Objects.equals(getErrorMessage(), response.getErrorMessage());
        }

        @Override
        public int hashCode() {
                return Objects.hash(getCommandName(), getTreasure(), getTreasures(), getErrorMessage());
        }

        @Override
        public String toString() {
                return "Response{" +
                        "commandName='" + commandName + '\'' +
                        ", treasure=" + treasure +
                        ", treasures=" + treasures +
                        ", errorMessage='" + errorMessage + '\'' +
                        '}';
        }
}
