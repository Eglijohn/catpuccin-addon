package me.pindour.catpuccin.gui.themes.catpuccin.widgets;

import me.pindour.catpuccin.gui.text.RichText;
import me.pindour.catpuccin.gui.themes.catpuccin.CatpuccinGuiTheme;
import me.pindour.catpuccin.gui.themes.catpuccin.CatpuccinWidget;
import meteordevelopment.meteorclient.gui.renderer.GuiRenderer;
import meteordevelopment.meteorclient.gui.widgets.WHorizontalSeparator;
import meteordevelopment.meteorclient.utils.render.color.Color;

public class WCatpuccinHorizontalSeparator extends WHorizontalSeparator implements CatpuccinWidget {
    private final RichText richText;
    private Color color;

    public WCatpuccinHorizontalSeparator(String text) {
        super(text);
        richText = RichText.bold(text);
    }

    @Override
    public void init() {
        super.init();
        color = theme().mantleColor();
    }

    @Override
    protected void onCalculateSize() {
        super.onCalculateSize();
        textWidth = theme().textWidth(richText);
    }

    @Override
    protected void onRender(GuiRenderer renderer, double mouseX, double mouseY, double delta) {
        if (text == null) renderWithoutText(renderer);
        else renderWithText();
    }

    private void renderWithoutText(GuiRenderer renderer) {
        CatpuccinGuiTheme theme = theme();
        double s = theme.scale(2);
        double w = width / 2;

        renderer.quad(x, y + s, w, s, color);
        renderer.quad(x + w, y + s, w, s, color);
    }

    private void renderWithText() {
        CatpuccinGuiTheme theme = theme();

        double textStart = Math.round(width / 2.0 - textWidth / 2.0);

        catpuccinRenderer().text(
                RichText.bold(text),
                x + textStart,
                y,
                theme.accentColor()
        );
    }
}
