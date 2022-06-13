package guru.refactoring.mediator.example.components;

import guru.refactoring.mediator.example.mediator.Mediator;

/**
 * EN: Common component interface.
 *
 * RU: Общий интерфейс компонентов.
 */
public interface Component {
    void setMediator(Mediator mediator);
    String getName();
}
