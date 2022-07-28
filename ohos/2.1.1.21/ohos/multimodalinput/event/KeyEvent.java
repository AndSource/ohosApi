/*    */ package ohos.multimodalinput.event;public abstract class KeyEvent extends MultimodalEvent { public static final int KEY_0 = 2000; public static final int KEY_1 = 2001; public static final int KEY_2 = 2002; public static final int KEY_3 = 2003; public static final int KEY_4 = 2004; public static final int KEY_5 = 2005; public static final int KEY_6 = 2006; public static final int KEY_7 = 2007;
/*    */   public static final int KEY_8 = 2008;
/*    */   public static final int KEY_9 = 2009;
/*    */   public static final int KEY_A = 2017;
/*    */   public static final int KEY_ALT_LEFT = 2045;
/*    */   public static final int KEY_ALT_RIGHT = 2046;
/*    */   public static final int KEY_APOSTROPHE = 2063;
/*    */   public static final int KEY_AT = 2065;
/*    */   public static final int KEY_B = 2018;
/*    */   public static final int KEY_BACK = 2;
/*    */   public static final int KEY_BACKSLASH = 2061;
/*    */   public static final int KEY_BREAK = 2080;
/*    */   public static final int KEY_BRIGHTNESS_DOWN = 41;
/*    */   public static final int KEY_BRIGHTNESS_UP = 40;
/*    */   public static final int KEY_C = 2019;
/*    */   public static final int KEY_CALL = 3;
/*    */   public static final int KEY_CAMERA = 19;
/*    */   public static final int KEY_CAPS_LOCK = 2074;
/*    */   public static final int KEY_CLEAR = 5;
/*    */   public static final int KEY_COMMA = 2043;
/*    */   public static final int KEY_CTRL_LEFT = 2072;
/*    */   public static final int KEY_CTRL_RIGHT = 2073;
/*    */   public static final int KEY_CUSTOM1 = 21;
/*    */   public static final int KEY_D = 2020;
/*    */   public static final int KEY_DEL = 2055;
/*    */   public static final int KEY_DPAD_CENTER = 2016;
/*    */   public static final int KEY_DPAD_DOWN = 2013;
/*    */   public static final int KEY_DPAD_LEFT = 2014;
/*    */   public static final int KEY_DPAD_RIGHT = 2015;
/*    */   public static final int KEY_DPAD_UP = 2012;
/*    */   public static final int KEY_E = 2021;
/*    */   public static final int KEY_ENDCALL = 4;
/*    */   
/*    */   public KeyEvent() {
/* 35 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */   public static final int KEY_ENTER = 2054; public static final int KEY_ENVELOPE = 2053; public static final int KEY_EQUALS = 2058; public static final int KEY_ESCAPE = 2070; public static final int KEY_EXPLORER = 2052; public static final int KEY_F = 2022; public static final int KEY_F1 = 2090; public static final int KEY_F10 = 2099; public static final int KEY_F11 = 2100; public static final int KEY_F12 = 2101; public static final int KEY_F2 = 2091; public static final int KEY_F3 = 2092; public static final int KEY_F4 = 2093; public static final int KEY_F5 = 2094; public static final int KEY_F6 = 2095; public static final int KEY_F7 = 2096; public static final int KEY_F8 = 2097; public static final int KEY_F9 = 2098; public static final int KEY_FOCUS = 7; public static final int KEY_FORWARD = 2084; public static final int KEY_FORWARD_DEL = 2071; public static final int KEY_FUNCTION = 2078; public static final int KEY_G = 2023; public static final int KEY_GRAVE = 2056; public static final int KEY_H = 2024; public static final int KEY_HEADSETHOOK = 6; public static final int KEY_HOME = 1; public static final int KEY_I = 2025; public static final int KEY_INSERT = 2083; public static final int KEY_J = 2026; public static final int KEY_K = 2027; public static final int KEY_L = 2028; public static final int KEY_LAUNCHER_MENU = 10008; public static final int KEY_LEFT_BRACKET = 2059; public static final int KEY_LEFT_KNOB = 10003; public static final int KEY_LEFT_KNOB_ROLL_DOWN = 10002; public static final int KEY_LEFT_KNOB_ROLL_UP = 10001; public static final int KEY_M = 2029; public static final int KEY_MEDIA_CLOSE = 2087; public static final int KEY_MEDIA_EJECT = 2088; public static final int KEY_MEDIA_FAST_FORWARD = 15; public static final int KEY_MEDIA_NEXT = 12; public static final int KEY_MEDIA_PAUSE = 2086; public static final int KEY_MEDIA_PLAY = 2085; public static final int KEY_MEDIA_PLAY_PAUSE = 10; public static final int KEY_MEDIA_PREVIOUS = 13; public static final int KEY_MEDIA_RECORD = 2089; public static final int KEY_MEDIA_REWIND = 14; public static final int KEY_MEDIA_STOP = 11; public static final int KEY_MENU = 2067; public static final int KEY_META_LEFT = 2076; public static final int KEY_META_RIGHT = 2077; public static final int KEY_MINUS = 2057; public static final int KEY_MOVE_END = 2082; public static final int KEY_MOVE_HOME = 2081; public static final int KEY_N = 2030; public static final int KEY_NOTIFICATION = 8; public static final int KEY_NUMPAD_0 = 2103; public static final int KEY_NUMPAD_1 = 2104; public static final int KEY_NUMPAD_2 = 2105; public static final int KEY_NUMPAD_3 = 2106; public static final int KEY_NUMPAD_4 = 2107; public static final int KEY_NUMPAD_5 = 2108; public static final int KEY_NUMPAD_6 = 2109; public static final int KEY_NUMPAD_7 = 2110; public static final int KEY_NUMPAD_8 = 2111; public static final int KEY_NUMPAD_9 = 2112; public static final int KEY_NUMPAD_ADD = 2116; public static final int KEY_NUMPAD_COMMA = 2118; public static final int KEY_NUMPAD_DIVIDE = 2113; public static final int KEY_NUMPAD_DOT = 2117; public static final int KEY_NUMPAD_ENTER = 2119; public static final int KEY_NUMPAD_EQUALS = 2120; public static final int KEY_NUMPAD_LEFT_PAREN = 2121; public static final int KEY_NUMPAD_MULTIPLY = 2114; public static final int KEY_NUMPAD_RIGHT_PAREN = 2122;
/*    */   public static final int KEY_NUMPAD_SUBTRACT = 2115;
/*    */   public static final int KEY_NUM_LOCK = 2102;
/*    */   public static final int KEY_O = 2031;
/*    */   public static final int KEY_P = 2032;
/*    */   
/*    */   public static int getMaxKeyCode() {
/* 44 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */   
/*    */   public static final int KEY_PAGE_DOWN = 2069;
/*    */   public static final int KEY_PAGE_UP = 2068;
/*    */   public static final int KEY_PERIOD = 2044;
/*    */   public static final int KEY_PLUS = 2066;
/*    */   public static final int KEY_POUND = 2011;
/*    */   public static final int KEY_POWER = 18;
/*    */   public static final int KEY_PRESSED = 0;
/*    */   public static final int KEY_Q = 2033;
/*    */   public static final int KEY_R = 2034;
/*    */   public static final int KEY_RELEASED = 1;
/*    */   public static final int KEY_RIGHT_BRACKET = 2060;
/*    */   public static final int KEY_RIGHT_KNOB = 10006;
/*    */   public static final int KEY_RIGHT_KNOB_ROLL_DOWN = 10005;
/*    */   public static final int KEY_RIGHT_KNOB_ROLL_UP = 10004;
/*    */   public static final int KEY_S = 2035;
/*    */   public static final int KEY_SCROLL_LOCK = 2075;
/*    */   public static final int KEY_SEARCH = 9;
/*    */   public static final int KEY_SEMICOLON = 2062;
/*    */   public static final int KEY_SHIFT_LEFT = 2047;
/*    */   public static final int KEY_SHIFT_RIGHT = 2048;
/*    */   public static final int KEY_SLASH = 2064;
/*    */   public static final int KEY_SPACE = 2050;
/*    */   public static final int KEY_STAR = 2010;
/*    */   public static final int KEY_SYM = 2051;
/*    */   public static final int KEY_SYSRQ = 2079;
/*    */   public static final int KEY_T = 2036;
/*    */   public static final int KEY_TAB = 2049;
/*    */   public static final int KEY_U = 2037;
/*    */   public static final int KEY_UNKNOWN = -1;
/*    */   public static final int KEY_V = 2038;
/*    */   public static final int KEY_VOICE_ASSISTANT = 20;
/*    */   public static final int KEY_VOICE_SOURCE_SWITCH = 10007;
/*    */   public static final int KEY_VOLUME_DOWN = 17;
/*    */   public static final int KEY_VOLUME_UP = 16;
/*    */   public static final int KEY_W = 2039;
/*    */   public static final int KEY_WEAR_1 = 1001;
/*    */   public static final int KEY_X = 2040;
/*    */   public static final int KEY_Y = 2041;
/*    */   public static final int KEY_Z = 2042;
/*    */   public static final int NOW_MAX_KEY = 10008;
/*    */   
/*    */   public abstract boolean isKeyDown();
/*    */   
/*    */   public abstract int getKeyCode();
/*    */   
/*    */   public abstract long getKeyDownDuration(); }


/* Location:              /Users/sanbo/tools/HarmonOS_Legacy_sdk/java/2.1.1.21/api/ohos.jar!/ohos/multimodalinput/event/KeyEvent.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */