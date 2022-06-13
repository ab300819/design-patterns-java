package guru.refactoring.visitor.example.visitor;

import guru.refactoring.visitor.example.shapes.Circle;
import guru.refactoring.visitor.example.shapes.CompoundShape;
import guru.refactoring.visitor.example.shapes.Dot;
import guru.refactoring.visitor.example.shapes.Rectangle;

public interface Visitor {
    String visitDot(Dot dot);

    String visitCircle(Circle circle);

    String visitRectangle(Rectangle rectangle);

    String visitCompoundGraphic(CompoundShape cg);
}
