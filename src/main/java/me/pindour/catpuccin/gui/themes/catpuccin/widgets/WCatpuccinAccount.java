package me.pindour.catpuccin.gui.themes.catpuccin.widgets;

import me.pindour.catpuccin.gui.themes.catpuccin.CatpuccinWidget;
import meteordevelopment.meteorclient.gui.WidgetScreen;
import meteordevelopment.meteorclient.gui.widgets.WAccount;
import meteordevelopment.meteorclient.systems.accounts.Account;
import meteordevelopment.meteorclient.utils.render.color.Color;

public class WCatpuccinAccount extends WAccount implements CatpuccinWidget {
    public WCatpuccinAccount(WidgetScreen screen, Account<?> account) {
        super(screen, account);
    }

    @Override
    protected Color loggedInColor() {
        return theme().greenColor();
    }

    @Override
    protected Color accountTypeColor() {
        return theme().textSecondaryColor();
    }
}
