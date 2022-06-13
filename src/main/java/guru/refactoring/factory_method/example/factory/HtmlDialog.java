package guru.refactoring.factory_method.example.factory;

import guru.refactoring.factory_method.example.buttons.Button;
import guru.refactoring.factory_method.example.buttons.HtmlButton;

/**
 * EN: HTML Dialog will produce HTML buttons.
 *
 * RU: HTML-диалог.
 */
public class HtmlDialog extends Dialog {

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
