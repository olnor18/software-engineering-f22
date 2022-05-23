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
 * A representation of the literals of the enumeration '<em><b>COMPARISON OPERATOR</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see xtext.factoryLang.factoryLang.FactoryLangPackage#getCOMPARISON_OPERATOR()
 * @model
 * @generated
 */
public enum COMPARISON_OPERATOR implements Enumerator
{
  /**
   * The '<em><b>UNDEFINED</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #UNDEFINED_VALUE
   * @generated
   * @ordered
   */
  UNDEFINED(0, "UNDEFINED", "undefined"),

  /**
   * The '<em><b>LESS THAN</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #LESS_THAN_VALUE
   * @generated
   * @ordered
   */
  LESS_THAN(1, "LESS_THAN", "less than"),

  /**
   * The '<em><b>GREATER THAN</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #GREATER_THAN_VALUE
   * @generated
   * @ordered
   */
  GREATER_THAN(2, "GREATER_THAN", "greater than"),

  /**
   * The '<em><b>NOT</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #NOT_VALUE
   * @generated
   * @ordered
   */
  NOT(3, "NOT", "not");

  /**
   * The '<em><b>UNDEFINED</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #UNDEFINED
   * @model literal="undefined"
   * @generated
   * @ordered
   */
  public static final int UNDEFINED_VALUE = 0;

  /**
   * The '<em><b>LESS THAN</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #LESS_THAN
   * @model literal="less than"
   * @generated
   * @ordered
   */
  public static final int LESS_THAN_VALUE = 1;

  /**
   * The '<em><b>GREATER THAN</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #GREATER_THAN
   * @model literal="greater than"
   * @generated
   * @ordered
   */
  public static final int GREATER_THAN_VALUE = 2;

  /**
   * The '<em><b>NOT</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #NOT
   * @model literal="not"
   * @generated
   * @ordered
   */
  public static final int NOT_VALUE = 3;

  /**
   * An array of all the '<em><b>COMPARISON OPERATOR</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final COMPARISON_OPERATOR[] VALUES_ARRAY =
    new COMPARISON_OPERATOR[]
    {
      UNDEFINED,
      LESS_THAN,
      GREATER_THAN,
      NOT,
    };

  /**
   * A public read-only list of all the '<em><b>COMPARISON OPERATOR</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<COMPARISON_OPERATOR> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>COMPARISON OPERATOR</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static COMPARISON_OPERATOR get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      COMPARISON_OPERATOR result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>COMPARISON OPERATOR</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static COMPARISON_OPERATOR getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      COMPARISON_OPERATOR result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>COMPARISON OPERATOR</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static COMPARISON_OPERATOR get(int value)
  {
    switch (value)
    {
      case UNDEFINED_VALUE: return UNDEFINED;
      case LESS_THAN_VALUE: return LESS_THAN;
      case GREATER_THAN_VALUE: return GREATER_THAN;
      case NOT_VALUE: return NOT;
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
  private COMPARISON_OPERATOR(int value, String name, String literal)
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
  
} //COMPARISON_OPERATOR
