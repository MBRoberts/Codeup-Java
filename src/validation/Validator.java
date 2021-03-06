/**
 * This source file is subject to the license that is bundled with this package in the file LICENSE.
 */
package validation;

public interface Validator<T> {
    boolean isValid(T value);
    String errorMessage();
}