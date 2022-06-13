package guru.refactoring.memento.example.commands;

public interface Command {
    String getName();
    void execute();
}
