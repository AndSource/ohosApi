/*     */ package ohos.global.i18n.text;
/*     */ 
/*     */ import ohos.global.icu.text.MeasureFormat;
/*     */ import ohos.global.icu.util.LocaleData;
/*     */ import ohos.global.icu.util.MeasureUnit;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class MeasureOptions
/*     */ {
/*     */   public MeasureOptions() {
/*  23 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public enum FormatStyle
/*     */   {
/*  34 */     WIDE,
/*     */ 
/*     */     
/*  37 */     SHORT,
/*     */ 
/*     */     
/*  40 */     NARROW;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public MeasureFormat.FormatWidth getFormatWidth() {
/*  49 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public enum Style
/*     */   {
/*  62 */     AUTO_STYLE_ON,
/*     */ 
/*     */     
/*  65 */     AUTO_STYLE_OFF;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public enum Unit
/*     */   {
/*  80 */     AREA_UK_ACRE,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  85 */     AREA_SI_HECTARE,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  90 */     AREA_SI_SQUARE_CENTIMETER,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  95 */     AREA_UK_SQUARE_FOOT,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 100 */     AREA_UK_SQUARE_INCH,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 105 */     AREA_SI_SQUARE_KILOMETER,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 110 */     AREA_SI_SQUARE_METER,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 115 */     AREA_UK_SQUARE_MILE,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 120 */     AREA_UK_SQUARE_YARD,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 125 */     AREA_DUNAM,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 130 */     LENGTH_SI_CENTIMETER,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 135 */     LENGTH_SI_DECIMETER,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 140 */     LENGTH_UK_FATHOM,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 145 */     LENGTH_UK_FOOT,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 150 */     LENGTH_UK_FURLONG,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 155 */     LENGTH_UK_INCH,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 160 */     LENGTH_SI_KILOMETER,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 165 */     LENGTH_SI_METER,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 170 */     LENGTH_SI_MICROMETER,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 175 */     LENGTH_UK_MILE,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 180 */     LENGTH_MILE_SCANDINAVIAN,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 185 */     LENGTH_SI_MILLIMETER,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 190 */     LENGTH_SI_NANOMETER,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 195 */     LENGTH_NAUTICAL_MILE,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 200 */     LENGTH_SI_PICOMETER,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 205 */     LENGTH_UK_POINT,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 210 */     LENGTH_UK_YARD,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 215 */     SPEED_SI_KILOMETER_PER_HOUR,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 220 */     SPEED_KNOT,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 225 */     SPEED_SI_METER_PER_SECOND,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 230 */     SPEED_UK_MILE_PER_HOUR,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 235 */     TEMPERATURE_SI_CELSIUS,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 240 */     TEMPERATURE_SI_FAHRENHEIT,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 245 */     TEMPERATURE_SI_KELVIN,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 250 */     VOLUME_US_ACRE_FOOT,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 255 */     VOLUME_UK_BARREL,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 260 */     VOLUME_US_BARREL,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 265 */     VOLUME_UK_BUSHEL,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 270 */     VOLUME_US_BUSHEL,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 275 */     VOLUME_SI_CENTILITER,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 280 */     VOLUME_SI_CUBIC_CENTIMETER,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 285 */     VOLUME_UK_CUBIC_FOOT,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 290 */     VOLUME_UK_CUBIC_INCH,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 295 */     VOLUME_SI_CUBIC_KILOMETER,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 300 */     VOLUME_SI_CUBIC_METER,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 305 */     VOLUME_UK_CUBIC_MILE,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 310 */     VOLUME_UK_CUBIC_YARD,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 315 */     VOLUME_UK_CUP,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 320 */     VOLUME_US_CUP,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 325 */     VOLUME_SI_CUP_METRIC,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 330 */     VOLUME_SI_DECILITER,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 335 */     VOLUME_US_FLUID_OUNCE,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 340 */     VOLUME_UK_FLUID_OUNCE_IMPERIAL,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 345 */     VOLUME_US_GALLON,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 350 */     VOLUME_UK_GALLON_IMPERIAL,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 355 */     VOLUME_SI_HECTOLITER,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 360 */     VOLUME_SI_LITER,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 365 */     VOLUME_SI_MEGALITER,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 370 */     VOLUME_SI_MILLILITER,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 375 */     VOLUME_UK_PINT,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 380 */     VOLUME_US_PINT,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 385 */     VOLUME_SI_PINT_METRIC,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 390 */     VOLUME_UK_QUART,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 395 */     VOLUME_US_QUART,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 400 */     VOLUME_UK_TABLESPOON,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 405 */     VOLUME_US_TABLESPOON,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 410 */     VOLUME_UK_TEASPOON,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 415 */     VOLUME_US_TEASPOON;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public String getUnitType() {
/* 423 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public String getUnitName() {
/* 431 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public MeasureUnit getMeasureUnit() {
/* 439 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public LocaleData.MeasurementSystem getMeasurementSystem() {
/* 447 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public enum Usage
/*     */   {
/* 463 */     DEFAULT,
/*     */ 
/*     */     
/* 466 */     AREA_LAND_AGRICULT,
/*     */ 
/*     */     
/* 469 */     AREA_LAND_COMMERCL,
/*     */ 
/*     */     
/* 472 */     AREA_LAND_RESIDNTL,
/*     */ 
/*     */     
/* 475 */     LENGTH_PERSON,
/*     */ 
/*     */     
/* 478 */     LENGTH_PERSON_SMALL,
/*     */ 
/*     */     
/* 481 */     LENGTH_RAINFALL,
/*     */ 
/*     */     
/* 484 */     LENGTH_ROAD,
/*     */ 
/*     */     
/* 487 */     LENGTH_ROAD_SMALL,
/*     */ 
/*     */     
/* 490 */     LENGTH_SNOWFALL,
/*     */ 
/*     */     
/* 493 */     LENGTH_VEHICLE,
/*     */ 
/*     */     
/* 496 */     LENGTH_VISIBLTY,
/*     */ 
/*     */     
/* 499 */     LENGTH_VISIBLTY_SMALL,
/*     */ 
/*     */     
/* 502 */     LENGTH_PERSON_INFORMAL,
/*     */ 
/*     */     
/* 505 */     LENGTH_PERSON_SMALL_INFORMAL,
/*     */ 
/*     */     
/* 508 */     LENGTH_ROAD_INFORMAL,
/*     */ 
/*     */     
/* 511 */     SPEED_ROAD_TRAVEL,
/*     */ 
/*     */     
/* 514 */     SPEED_WIND,
/*     */ 
/*     */     
/* 517 */     TEMPERATURE_PERSON,
/*     */ 
/*     */     
/* 520 */     TEMPERATURE_WEATHER,
/*     */ 
/*     */     
/* 523 */     VOLUME_VEHICLE_FUEL;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public String getUsageName() {
/* 531 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public String getUsageType() {
/* 539 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.1.1.21/api/ohos.jar!/ohos/global/i18n/text/MeasureOptions.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */