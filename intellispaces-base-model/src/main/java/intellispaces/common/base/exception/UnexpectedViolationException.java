package intellispaces.common.base.exception;

import java.text.MessageFormat;

/**
 * Unexpected violation exception.
 *
 * <p>This is the parent class for any exceptions related to <b>unexpected violations of assumptions</b> imposed on a particular method.
 */
public class UnexpectedViolationException extends RuntimeException {

  public UnexpectedViolationException() {
  }

  protected UnexpectedViolationException(String messageTemplate, Object... messageParams) {
    super(MessageFormat.format(messageTemplate, messageParams), null);
  }

  protected UnexpectedViolationException(Throwable cause, String messageTemplate, Object... messageParams) {
    super(MessageFormat.format(messageTemplate, messageParams), cause);
  }

  public static UnexpectedViolationException withCause(Throwable cause) {
    return new UnexpectedViolationException(cause, null);
  }

  public static UnexpectedViolationException withMessage(String messageTemplate, Object... messageParams) {
    return new UnexpectedViolationException(null, messageTemplate, messageParams);
  }

  public static UnexpectedViolationException withCauseAndMessage(Throwable cause, String messageTemplate, Object... messageParams) {
    return new UnexpectedViolationException(cause, messageTemplate, messageParams);
  }
}
