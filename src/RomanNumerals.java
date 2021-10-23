public enum RomanNumerals {
    unus, I, II, III, IV, V, VI, VII, VIII, IX, X, XI, XII, XIII, XIV, XV, XVI, XVII, XVIII, XIX, XX, XXI, XXII, XXIII,
    XXIV, XXV, XXVI, XXVII, XXVIII, XXIX, XXX, XXXI, XXXII, XXXIII, XXXIV, XXXV, XXXVI, XXXVII, XXXVIII, XXXIX, XL, XLI,
    XLII, XLIII, XLIV, XLV, XLVI, XLVII, XLVIII, XLIX, L, LI, LII, LIII, LIV, LV, LVI, LVII, LVIII, LIX, LX, LXI, LXII,
    LXIII,
    LXIV,
    LXV,
    LXVI,
    LXVII,
    LXVIII,
    LXIX,
    LXX,
    LXXI, LXXII, LXXIII, LXXIV, LXXV, LXXVI, LXXVII, LXXVIII, LXXIX, LXXX,
    LXXXI, LXXXII, LXXXIII, LXXXIV, LXXXV, LXXXVI, LXXXVII, LXXXVIII, LXXXIX, XC, XCI, XCII, XCIII, XCIV, XCV, XCVI,
    XCVII, XCVIII, XCIX, C, String;


    public static void valuesRomanNumerals() {
        RomanNumerals[] values = RomanNumerals.values();
        for (int i = 0; i < values.length; i++) {
            System.out.printf("%s RomanNumerals values is - %s%n", i, values[i]);
        }
    }
}












