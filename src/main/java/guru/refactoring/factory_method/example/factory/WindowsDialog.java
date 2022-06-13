package guru.refactoring.factory_method.example.factory;

import guru.refactoring.factory_method.example.buttons.Button;
import guru.refactoring.factory_method.example.buttons.WindowsButton;

/**
 * EN: Windows Dialog will produce Windows buttons.
 *
 * RU: Диалог на элементах операционной системы.
 */
public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
