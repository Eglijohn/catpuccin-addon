package me.pindour.catpuccin.gui.text;

import meteordevelopment.meteorclient.gui.renderer.GuiRenderOperation;

public class RichTextOperation extends GuiRenderOperation<RichTextOperation> {
    private RichTextSegment segment;
    private RichTextRenderer renderer;

    public RichTextOperation set(RichTextSegment segment, RichTextRenderer renderer) {
        this.segment = segment;
        this.renderer = renderer;
        return this;
    }

    public FontStyle getStyle() {
        return segment.getStyle();
    }

    public double getScale() {
        return segment.getScale();
    }

    @Override
    protected void onRun() {
        renderer.renderTextWithStyle(
                segment.getText(), x, y, color,
                segment.hasShadow(), segment.getStyle()
        );
    }
}
