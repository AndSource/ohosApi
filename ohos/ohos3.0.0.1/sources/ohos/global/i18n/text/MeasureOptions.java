package ohos.global.i18n.text;

import ohos.global.icu.text.MeasureFormat;
import ohos.global.icu.util.LocaleData;
import ohos.global.icu.util.MeasureUnit;

/* loaded from: ohos3.0.0.1.jar:ohos/global/i18n/text/MeasureOptions.class */
public class MeasureOptions {

    /* loaded from: ohos3.0.0.1.jar:ohos/global/i18n/text/MeasureOptions$Style.class */
    public enum Style {
        AUTO_STYLE_ON,
        AUTO_STYLE_OFF
    }

    public MeasureOptions() {
        throw new RuntimeException("Stub!");
    }

    /* loaded from: ohos3.0.0.1.jar:ohos/global/i18n/text/MeasureOptions$FormatStyle.class */
    public enum FormatStyle {
        WIDE,
        SHORT,
        NARROW;

        public MeasureFormat.FormatWidth getFormatWidth() {
            throw new RuntimeException("Stub!");
        }
    }

    /* loaded from: ohos3.0.0.1.jar:ohos/global/i18n/text/MeasureOptions$Unit.class */
    public enum Unit {
        AREA_UK_ACRE,
        AREA_SI_HECTARE,
        AREA_SI_SQUARE_CENTIMETER,
        AREA_UK_SQUARE_FOOT,
        AREA_UK_SQUARE_INCH,
        AREA_SI_SQUARE_KILOMETER,
        AREA_SI_SQUARE_METER,
        AREA_UK_SQUARE_MILE,
        AREA_UK_SQUARE_YARD,
        AREA_DUNAM,
        LENGTH_SI_CENTIMETER,
        LENGTH_SI_DECIMETER,
        LENGTH_UK_FATHOM,
        LENGTH_UK_FOOT,
        LENGTH_UK_FURLONG,
        LENGTH_UK_INCH,
        LENGTH_SI_KILOMETER,
        LENGTH_SI_METER,
        LENGTH_SI_MICROMETER,
        LENGTH_UK_MILE,
        LENGTH_MILE_SCANDINAVIAN,
        LENGTH_SI_MILLIMETER,
        LENGTH_SI_NANOMETER,
        LENGTH_NAUTICAL_MILE,
        LENGTH_SI_PICOMETER,
        LENGTH_UK_POINT,
        LENGTH_UK_YARD,
        SPEED_SI_KILOMETER_PER_HOUR,
        SPEED_KNOT,
        SPEED_SI_METER_PER_SECOND,
        SPEED_UK_MILE_PER_HOUR,
        TEMPERATURE_SI_CELSIUS,
        TEMPERATURE_SI_FAHRENHEIT,
        TEMPERATURE_SI_KELVIN,
        VOLUME_US_ACRE_FOOT,
        VOLUME_UK_BARREL,
        VOLUME_US_BARREL,
        VOLUME_UK_BUSHEL,
        VOLUME_US_BUSHEL,
        VOLUME_SI_CENTILITER,
        VOLUME_SI_CUBIC_CENTIMETER,
        VOLUME_UK_CUBIC_FOOT,
        VOLUME_UK_CUBIC_INCH,
        VOLUME_SI_CUBIC_KILOMETER,
        VOLUME_SI_CUBIC_METER,
        VOLUME_UK_CUBIC_MILE,
        VOLUME_UK_CUBIC_YARD,
        VOLUME_UK_CUP,
        VOLUME_US_CUP,
        VOLUME_SI_CUP_METRIC,
        VOLUME_SI_DECILITER,
        VOLUME_US_FLUID_OUNCE,
        VOLUME_UK_FLUID_OUNCE_IMPERIAL,
        VOLUME_US_GALLON,
        VOLUME_UK_GALLON_IMPERIAL,
        VOLUME_SI_HECTOLITER,
        VOLUME_SI_LITER,
        VOLUME_SI_MEGALITER,
        VOLUME_SI_MILLILITER,
        VOLUME_UK_PINT,
        VOLUME_US_PINT,
        VOLUME_SI_PINT_METRIC,
        VOLUME_UK_QUART,
        VOLUME_US_QUART,
        VOLUME_UK_TABLESPOON,
        VOLUME_US_TABLESPOON,
        VOLUME_UK_TEASPOON,
        VOLUME_US_TEASPOON;

        public String getUnitType() {
            throw new RuntimeException("Stub!");
        }

        public String getUnitName() {
            throw new RuntimeException("Stub!");
        }

        public MeasureUnit getMeasureUnit() {
            throw new RuntimeException("Stub!");
        }

        public LocaleData.MeasurementSystem getMeasurementSystem() {
            throw new RuntimeException("Stub!");
        }
    }

    /* loaded from: ohos3.0.0.1.jar:ohos/global/i18n/text/MeasureOptions$Usage.class */
    public enum Usage {
        DEFAULT,
        AREA_LAND_AGRICULT,
        AREA_LAND_COMMERCL,
        AREA_LAND_RESIDNTL,
        LENGTH_PERSON,
        LENGTH_PERSON_SMALL,
        LENGTH_RAINFALL,
        LENGTH_ROAD,
        LENGTH_ROAD_SMALL,
        LENGTH_SNOWFALL,
        LENGTH_VEHICLE,
        LENGTH_VISIBLTY,
        LENGTH_VISIBLTY_SMALL,
        LENGTH_PERSON_INFORMAL,
        LENGTH_PERSON_SMALL_INFORMAL,
        LENGTH_ROAD_INFORMAL,
        SPEED_ROAD_TRAVEL,
        SPEED_WIND,
        TEMPERATURE_PERSON,
        TEMPERATURE_WEATHER,
        VOLUME_VEHICLE_FUEL;

        public String getUsageName() {
            throw new RuntimeException("Stub!");
        }

        public String getUsageType() {
            throw new RuntimeException("Stub!");
        }
    }
}
