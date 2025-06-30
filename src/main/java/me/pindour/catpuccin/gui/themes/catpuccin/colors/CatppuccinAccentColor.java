package me.pindour.catpuccin.gui.themes.catpuccin.colors;

public enum CatppuccinAccentColor {
    Rosewater,
    Flamingo,
    Pink,
    Mauve,
    Maroon,
    Peach,
    Teal,
    Sky,
    Sapphire,
    Lavender,
    Red,
    Blue,
    Yellow,
    Green;

    public CatppuccinColor toColor() {
        return CatppuccinColor.valueOf(name());
    }
}
