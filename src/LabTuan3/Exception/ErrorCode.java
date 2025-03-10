package LabTuan3.Exception;

public enum ErrorCode {

    NOT_FOUND_ID(100, "Not found Id"),
    STUDENT_IS_NOT_EXISTED(101,"Student is not existed"),
    STUDENT_IS_ALREADY_EXISTED(102, "Can't add student because duplicate id"),
    NOT_A_TRIANGLE(103, "This is not triangle"),
    DENOMINATOR_INPUT_ERROR(104, "Denominator not equals 0"),
    FRACTION_INPUT_ERROR(105,"FRACTION IS NULL");

    private final int code;
    private final String message;
    ErrorCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
