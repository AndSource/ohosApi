package ohos.global.i18n.text;

import java.util.Locale;
import ohos.global.i18n.text.MeasureOptions;

/* loaded from: ohos3.0.0.1.jar:ohos/global/i18n/text/MeasureFormatter.class */
public abstract class MeasureFormatter {
    public abstract void setFractionPrecision(int i);

    public abstract String format(MeasureOptions.Unit unit, double d, MeasureOptions.FormatStyle formatStyle);

    public abstract String format(MeasureOptions.Unit unit, double d, MeasureOptions.Usage usage, MeasureOptions.FormatStyle formatStyle, MeasureOptions.Style style) throws NotSupportConvertException;

    public abstract String format(MeasureOptions.Unit unit, double d, MeasureOptions.Unit unit2, MeasureOptions.FormatStyle formatStyle) throws NotSupportConvertException;

    public MeasureFormatter() {
        throw new RuntimeException("Stub!");
    }

    public static MeasureFormatter getInstance() {
        throw new RuntimeException("Stub!");
    }

    public static MeasureFormatter getInstance(Locale locale) {
        throw new RuntimeException("Stub!");
    }
}
