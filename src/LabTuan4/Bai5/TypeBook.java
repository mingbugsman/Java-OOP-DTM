package LabTuan4.Bai5;

public enum TypeBook {
    SACHGIAOKHOA,
    SACHVANHOC;

    public static TypeBook fromInteger(int x) {
        return switch (x) {
            case 0 -> SACHGIAOKHOA;
            case 1 -> SACHVANHOC;
            default -> null;
        };
    }
}
