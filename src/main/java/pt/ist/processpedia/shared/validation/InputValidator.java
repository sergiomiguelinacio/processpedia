package pt.ist.processpedia.shared.validation;

import pt.ist.processpedia.shared.exception.*;

public class InputValidator {

  private static final int PROCESS_TITLE_MAX_LENGTH = 50;
  private static final int REQUEST_TITLE_MAX_LENGTH = 50;
  private static final int PROCESS_DESCRIPTION_MAX_LENGTH = 100;
  private static final int REQUEST_DESCRIPTION_MAX_LENGTH = 250;
  private static final int DATA_OBJECT_LABEL_MAX_LENGTH = 10;
  private static final int QUEUE_TITLE_MAX_LENGTH = 20;
  private static final int PASSWORD_MIN_LENGTH = 4;
  private static final int ACTIVATION_KEY_LENGTH = 32;

  /**
   * Verifies if a user name contains at least a space, i.e. is composed, at least, by first and last name.
   * @param userName the name of the user to be validated
   * @return true if the provided name contains a space to separate the first from the user's last name, false otherwise
   */
  public static boolean isValidUserName(String userName) {
    return userName!=null && userName.contains(" ");
  }

  /**
   * Verifies if a user name contains at least a space, i.e. is composed, at least, by first and last name.
   * @param userName the name of the user to be validated
   * @throws InvalidUserNameException when the provided name does not contain a space separating the first and last names
   */
  public static void validateUserName(String userName) throws InvalidUserNameException {
    if(!isValidUserName(userName)) {
      throw new InvalidUserNameException(userName);
    }
  }

  /**
   * Verifies if an email has at least the @ character.
   * @param userEmail the email to be validated
   * @return true if the email contains the @ character, false otherwise
   */
  public static boolean isValidUserEmail(String userEmail) {
    return userEmail!=null && userEmail.contains("@");
  }

  /**
   * Verifies if an email has at least the @ character.
   * @param userEmail the email to be validated
   * @throws InvalidUserEmailAddressException when the provided email does not contain the @ character
   */
  public static void validateUserEmail(String userEmail) throws InvalidUserEmailAddressException {
    if(!isValidUserEmail(userEmail)) {
      throw new InvalidUserEmailAddressException(userEmail);
    }
  }

  /**
   * Verifies if a process title is shorter than the maximum pre-defined value of PROCESS_TITLE_MAX_LENGTH.
   * @param processTitle the process title to be validated
   * @return true if the process title is shorter than the maximum pre-defined value of PROCESS_TITLE_MAX_LENGTH, false otherwise
   */
  public static boolean isValidProcessTitle(String processTitle) {
    return processTitle!=null && processTitle.length() <= PROCESS_TITLE_MAX_LENGTH;
  }

  /**
   * Verifies if a process title is shorter than the maximum pre-defined value of PROCESS_TITLE_MAX_LENGTH.
   * @param processTitle the process title to be validated
   * @throws ProcessTitleTooLongException when the provided process title exceeds the pre-defined value of PROCESS_TITLE_MAX_LENGTH
   */
  public static void validateProcessTitle(String processTitle) throws ProcessTitleTooLongException {
    if(!isValidProcessTitle(processTitle)) {
      throw new ProcessTitleTooLongException(processTitle, PROCESS_TITLE_MAX_LENGTH);
    }
  }

  /**
   * Verifies if a process description is shorter than the maximum pred-defined value of PROCESS_DESCRIPTION_MAX_LENGTH.
   * @param processDescription the process description to be validated
   * @return true if the process description is shorter than the maximum pre-defined value of PROCESS_DESCRIPTION_MAX_LENGTH, false otherwise
   */
  public static boolean isValidProcessDescription(String processDescription) {
    return processDescription!=null && processDescription.length() <= PROCESS_DESCRIPTION_MAX_LENGTH;
  }

  /**
   * Verifies if a process description is shorter than the maximum pred-defined value of PROCESS_DESCRIPTION_MAX_LENGTH.
   * @param processDescription the process description to be validated
   * @throws ProcessDescriptionTooLongException when the provided process description exceeds the pre-defined value of PROCESS_DESCRIPTION_MAX_LENGTH
   */
  public static void validateProcessDescription(String processDescription) throws ProcessDescriptionTooLongException {
    if(!isValidProcessDescription(processDescription)) {
      throw new ProcessDescriptionTooLongException(processDescription, PROCESS_DESCRIPTION_MAX_LENGTH);
    }
  }

  /**
   * Verifies if a request title is shorter than the maximum pre-defined value of REQUEST_TITLE_MAX_LENGTH.
   * @param requestTitle the request title to be validated
   * @return true if the request title is shorter than the maximum pre-defined value of REQUEST_TITLE_MAX_LENGTH, false otherwise
   */
  public static boolean isValidRequestTitle(String requestTitle) {
    return requestTitle!=null && requestTitle.length() <= REQUEST_TITLE_MAX_LENGTH;
  }

  /**
   * Verifies if a request title is shorter than the maximum pre-defined REQUEST_TITLE_MAX_LENGTH.
   * @param requestTitle the request title to be validated
   * @throws RequestTitleTooLongException when the provided request title exceeds the pre-defined value of REQUEST_TITLE_MAX_LENGTH
   */
  public static void validateRequestTitle(String requestTitle) throws RequestTitleTooLongException {
    if(!isValidRequestTitle(requestTitle)) {
      throw new RequestTitleTooLongException(requestTitle, REQUEST_TITLE_MAX_LENGTH);
    }
  }

  /**
   * Verifies if a request description is shorter than the maximum pre-defined value of REQUEST_DESCRIPTION_MAX_LENGTH.
   * @param requestDescription the request description to be validated
   * @return true if the provided request description is shorter than the maximum pre-defined value of REQUEST_DESCRIPTION_MAX_LENGTH, false otherwise
   */
  public static boolean isValidRequestDescription(String requestDescription) {
    return requestDescription!=null && requestDescription.length() <= REQUEST_DESCRIPTION_MAX_LENGTH;
  }

  /**
   * Verifies if a request description is shorter than the maximum pre-defined value of REQUEST_DESCRIPTION_MAX_LENGTH.
   * @param requestDescription the request description to be validated
   * @throws RequestDescriptionTooLongException when the provided request description exceeds the pre-defined maximum value of REQUEST_DESCRIPTION_MAX_LENGTH.
   */
  public static void validateRequestDescription(String requestDescription) throws RequestDescriptionTooLongException {
    if(!isValidRequestDescription(requestDescription)) {
      throw new RequestDescriptionTooLongException(requestDescription, REQUEST_DESCRIPTION_MAX_LENGTH);
    }
  }

  /**
   * Verifies if a data object label is shorter than the maximum pre-defined value of DATA_OBJECT_LABEL_MAX_LENGTH.
   * @param dataObjectLabel the data object label to be validated
   * @return true if the provided data object label is shorter than the maximum pre-defined value of DATA_OBJECT_LABEL_MAX_LENGTH, false otherwise
   */
  public static boolean isValidDataObjectLabel(String dataObjectLabel) {
    return dataObjectLabel!=null && dataObjectLabel.length() <= DATA_OBJECT_LABEL_MAX_LENGTH;
  }

  /**
   * Verifies if a data object label is shorter than the maximum pre-defined value of DATA_OBJECT_LABEL_MAX_LENGTH.
   * @param dataObjectLabel the data object label to be validated
   * @throws DataObjectLabelTooLongException when the provided label exceeds the pre-defined maximum value of DATA_OBJECT_LABEL_MAX_LENGTH
   */
  public static void validateDataObjectLabel(String dataObjectLabel) throws DataObjectLabelTooLongException {
    if(!isValidDataObjectLabel(dataObjectLabel)) {
      throw new DataObjectLabelTooLongException(dataObjectLabel, DATA_OBJECT_LABEL_MAX_LENGTH);
    }
  }

  /**
   * Verifies if a queue title is shorter than the maximum pre-defined value of QUEUE_TITLE_MAX_LENGTH.
   * @param title the queue title to be validated
   * @return true if the provided queue title is shorter than the maximum pre-defined value of QUEUE_TITLE_MAX_LENGTH, false otherwise
   */
  public static boolean isValidQueueTitle(String queueTitle) {
    return queueTitle!=null && queueTitle.length() <= QUEUE_TITLE_MAX_LENGTH;
  }

  /**
   * Verifies if a queue title is shorter than the maximum pre-defined value of QUEUE_TITLE_MAX_LENGTH.
   * @param title the queue title to be validated
   * @throws QueueTitleTooLongException when the provided title exceeds the pre-defined maximum value of QUEUE_TITLE_MAX_LENGTH
   */
  public static void validateQueueTitle(String queueTitle) throws QueueTitleTooLongException {
    if(!isValidQueueTitle(queueTitle)) {
      throw new QueueTitleTooLongException(queueTitle, QUEUE_TITLE_MAX_LENGTH);
    }
  }

  /**
   * Verifies if a password is at least PASSWORD_MIN_LENGTH character long.
   * @param password the password to be verified
   * @return true if the provided password is at least PASSWORD_MIN_LENGTH character long
   */
  public static boolean isValidPassword(String password) {
    return password!=null && password.length() >= PASSWORD_MIN_LENGTH;
  }

  /**
   * Verifies if a password is at least PASSWORD_MIN_LENGTH character wide.
   * @param password the password to be validated
   * @throws InvalidUserPasswordException when the provided password is shorter than PASSWORD_MIN_LENGTH characters
   */
  public static void validateUserPassword(String password) throws InvalidUserPasswordException {
    if(!isValidPassword(password)) {
      throw new InvalidUserPasswordException();
    }
  }

  /**
   * Verifies if an activation key has its length equal to the pre-defined value of ACTIVATION_KEY_LENGTH
   * @param activationKey the activation key to be validated
   * @return true if the activation key has length equal to the pre-defined value of ACTIVATION_KEY_LENGTH, false otherwise
   */
  public static boolean isValidActivationKey(String activationKey) {
    return activationKey!=null && activationKey.length()==ACTIVATION_KEY_LENGTH;
  }

  public static void validateActivationKey(String activationKey) throws InvalidActivationKeyException {
    if(!isValidActivationKey(activationKey)) {
      throw new InvalidActivationKeyException(activationKey);
    }
  }


}
