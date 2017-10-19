package org.refactoringminer.api;

import java.io.Serializable;

public interface Refactoring extends Serializable {

	public RefactoringType getRefactoringType();
	
	public String getName();

	public String toString();

	/**
	 * 
	 * @return If refactoring is method-related, return refactoredToMethod;currentClass;refactoredFromMethod, else just return {@link #toString()}
	 */
	public String getShortDescription();
}