package Ex_Aula_177.exceptions;

public class BusinessException extends RuntimeException {
    //private static final long serialVersionUID =1L;
    public BusinessException(String msg) {
        super(msg);
    }
}
