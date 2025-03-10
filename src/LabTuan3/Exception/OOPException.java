package LabTuan3.Exception;

public class OOPException extends RuntimeException {
    private ErrorCode errorCode;
    public OOPException(ErrorCode errorCode) {
        super(errorCode.getMessage());
        this.errorCode = errorCode;
    }

    public ErrorCode getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(ErrorCode errorCode) {
        this.errorCode = errorCode;
    }

    @Override
    public String toString() {
        return "Error Code{" +
                "errorCode=" + errorCode.getCode() +
                "\nMessage=" + errorCode.getMessage() +
                '}';
    }
}
