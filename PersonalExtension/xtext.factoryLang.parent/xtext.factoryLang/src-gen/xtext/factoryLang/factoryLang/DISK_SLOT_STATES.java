/**
 * generated by Xtext 2.26.0
 */
package xtext.factoryLang.factoryLang;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>DISK SLOT STATES</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see xtext.factoryLang.factoryLang.FactoryLangPackage#getDISK_SLOT_STATES()
 * @model
 * @generated
 */
public enum DISK_SLOT_STATES implements Enumerator
{
  /**
   * The '<em><b>FREE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #FREE_VALUE
   * @generated
   * @ordered
   */
  FREE(0, "FREE", "free"),

  /**
   * The '<em><b>IN PROGRESS</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #IN_PROGRESS_VALUE
   * @generated
   * @ordered
   */
  IN_PROGRESS(1, "IN_PROGRESS", "in_progress"),

  /**
   * The '<em><b>COMPLETE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #COMPLETE_VALUE
   * @generated
   * @ordered
   */
  COMPLETE(2, "COMPLETE", "complete");

  /**
   * The '<em><b>FREE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #FREE
   * @model literal="free"
   * @generated
   * @ordered
   */
  public static final int FREE_VALUE = 0;

  /**
   * The '<em><b>IN PROGRESS</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #IN_PROGRESS
   * @model literal="in_progress"
   * @generated
   * @ordered
   */
  public static final int IN_PROGRESS_VALUE = 1;

  /**
   * The '<em><b>COMPLETE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #COMPLETE
   * @model literal="complete"
   * @generated
   * @ordered
   */
  public static final int COMPLETE_VALUE = 2;

  /**
   * An array of all the '<em><b>DISK SLOT STATES</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final DISK_SLOT_STATES[] VALUES_ARRAY =
    new DISK_SLOT_STATES[]
    {
      FREE,
      IN_PROGRESS,
      COMPLETE,
    };

  /**
   * A public read-only list of all the '<em><b>DISK SLOT STATES</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<DISK_SLOT_STATES> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>DISK SLOT STATES</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static DISK_SLOT_STATES get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      DISK_SLOT_STATES result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>DISK SLOT STATES</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static DISK_SLOT_STATES getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      DISK_SLOT_STATES result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>DISK SLOT STATES</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static DISK_SLOT_STATES get(int value)
  {
    switch (value)
    {
      case FREE_VALUE: return FREE;
      case IN_PROGRESS_VALUE: return IN_PROGRESS;
      case COMPLETE_VALUE: return COMPLETE;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private DISK_SLOT_STATES(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //DISK_SLOT_STATES
