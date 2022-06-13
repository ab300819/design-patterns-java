package guru.refactoring.visitor.example.shapes;

import guru.refactoring.visitor.example.visitor.Visitor;

public interface Shape {
    void move(int x, int y);
    void draw();
    String accept(Visitor visitor);
}
