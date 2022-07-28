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
/*  32 */     throw new RuntimeException("Stub!");
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
/*  43 */     WIDE,
/*     */ 
/*     */     
/*  46 */     SHORT,
/*     */ 
/*     */     
/*  49 */     NARROW;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public MeasureFormat.FormatWidth getFormatWidth() {
/*  58 */       throw new RuntimeException("Stub!");
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
/*  71 */     AUTO_STYLE_ON,
/*     */ 
/*     */     
/*  74 */     AUTO_STYLE_OFF;
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
/*  89 */     AREA_UK_ACRE,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  94 */     AREA_SI_HECTARE,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  99 */     AREA_SI_SQUARE_CENTIMETER,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 104 */     AREA_UK_SQUARE_FOOT,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 109 */     AREA_UK_SQUARE_INCH,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 114 */     AREA_SI_SQUARE_KILOMETER,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 119 */     AREA_SI_SQUARE_METER,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 124 */     AREA_UK_SQUARE_MILE,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 129 */     AREA_UK_SQUARE_YARD,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 134 */     AREA_DUNAM,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 139 */     LENGTH_SI_CENTIMETER,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 144 */     LENGTH_SI_DECIMETER,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 149 */     LENGTH_UK_FATHOM,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 154 */     LENGTH_UK_FOOT,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 159 */     LENGTH_UK_FURLONG,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 164 */     LENGTH_UK_INCH,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 169 */     LENGTH_SI_KILOMETER,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 174 */     LENGTH_SI_METER,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 179 */     LENGTH_SI_MICROMETER,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 184 */     LENGTH_UK_MILE,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 189 */     LENGTH_MILE_SCANDINAVIAN,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 194 */     LENGTH_SI_MILLIMETER,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 199 */     LENGTH_SI_NANOMETER,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 204 */     LENGTH_NAUTICAL_MILE,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 209 */     LENGTH_SI_PICOMETER,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 214 */     LENGTH_UK_POINT,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 219 */     LENGTH_UK_YARD,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 224 */     SPEED_SI_KILOMETER_PER_HOUR,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 229 */     SPEED_KNOT,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 234 */     SPEED_SI_METER_PER_SECOND,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 239 */     SPEED_UK_MILE_PER_HOUR,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 244 */     TEMPERATURE_SI_CELSIUS,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 249 */     TEMPERATURE_SI_FAHRENHEIT,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 254 */     TEMPERATURE_SI_KELVIN,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 259 */     VOLUME_US_ACRE_FOOT,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 264 */     VOLUME_UK_BARREL,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 269 */     VOLUME_US_BARREL,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 274 */     VOLUME_UK_BUSHEL,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 279 */     VOLUME_US_BUSHEL,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 284 */     VOLUME_SI_CENTILITER,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 289 */     VOLUME_SI_CUBIC_CENTIMETER,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 294 */     VOLUME_UK_CUBIC_FOOT,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 299 */     VOLUME_UK_CUBIC_INCH,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 304 */     VOLUME_SI_CUBIC_KILOMETER,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 309 */     VOLUME_SI_CUBIC_METER,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 314 */     VOLUME_UK_CUBIC_MILE,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 319 */     VOLUME_UK_CUBIC_YARD,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 324 */     VOLUME_UK_CUP,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 329 */     VOLUME_US_CUP,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 334 */     VOLUME_SI_CUP_METRIC,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 339 */     VOLUME_SI_DECILITER,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 344 */     VOLUME_US_FLUID_OUNCE,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 349 */     VOLUME_UK_FLUID_OUNCE_IMPERIAL,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 354 */     VOLUME_US_GALLON,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 359 */     VOLUME_UK_GALLON_IMPERIAL,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 364 */     VOLUME_SI_HECTOLITER,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 369 */     VOLUME_SI_LITER,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 374 */     VOLUME_SI_MEGALITER,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 379 */     VOLUME_SI_MILLILITER,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 384 */     VOLUME_UK_PINT,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 389 */     VOLUME_US_PINT,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 394 */     VOLUME_SI_PINT_METRIC,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 399 */     VOLUME_UK_QUART,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 404 */     VOLUME_US_QUART,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 409 */     VOLUME_UK_TABLESPOON,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 414 */     VOLUME_US_TABLESPOON,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 419 */     VOLUME_UK_TEASPOON,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 424 */     VOLUME_US_TEASPOON;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public String getUnitType() {
/* 432 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public String getUnitName() {
/* 440 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public MeasureUnit getMeasureUnit() {
/* 448 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public LocaleData.MeasurementSystem getMeasurementSystem() {
/* 456 */       throw new RuntimeException("Stub!");
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
/* 472 */     DEFAULT,
/*     */ 
/*     */     
/* 475 */     AREA_LAND_AGRICULT,
/*     */ 
/*     */     
/* 478 */     AREA_LAND_COMMERCL,
/*     */ 
/*     */     
/* 481 */     AREA_LAND_RESIDNTL,
/*     */ 
/*     */     
/* 484 */     LENGTH_PERSON,
/*     */ 
/*     */     
/* 487 */     LENGTH_PERSON_SMALL,
/*     */ 
/*     */     
/* 490 */     LENGTH_RAINFALL,
/*     */ 
/*     */     
/* 493 */     LENGTH_ROAD,
/*     */ 
/*     */     
/* 496 */     LENGTH_ROAD_SMALL,
/*     */ 
/*     */     
/* 499 */     LENGTH_SNOWFALL,
/*     */ 
/*     */     
/* 502 */     LENGTH_VEHICLE,
/*     */ 
/*     */     
/* 505 */     LENGTH_VISIBLTY,
/*     */ 
/*     */     
/* 508 */     LENGTH_VISIBLTY_SMALL,
/*     */ 
/*     */     
/* 511 */     LENGTH_PERSON_INFORMAL,
/*     */ 
/*     */     
/* 514 */     LENGTH_PERSON_SMALL_INFORMAL,
/*     */ 
/*     */     
/* 517 */     LENGTH_ROAD_INFORMAL,
/*     */ 
/*     */     
/* 520 */     SPEED_ROAD_TRAVEL,
/*     */ 
/*     */     
/* 523 */     SPEED_WIND,
/*     */ 
/*     */     
/* 526 */     TEMPERATURE_PERSON,
/*     */ 
/*     */     
/* 529 */     TEMPERATURE_WEATHER,
/*     */ 
/*     */     
/* 532 */     VOLUME_VEHICLE_FUEL;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public String getUsageName() {
/* 540 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public String getUsageType() {
/* 548 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */ }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/3.0.0.1/api/ohos.jar!/ohos/global/i18n/text/MeasureOptions.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */