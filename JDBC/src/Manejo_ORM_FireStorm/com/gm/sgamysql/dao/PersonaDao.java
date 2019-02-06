/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package Manejo_ORM_FireStorm.com.gm.sgamysql.dao;

import Manejo_ORM_FireStorm.com.gm.sgamysql.dto.*;
import Manejo_ORM_FireStorm.com.gm.sgamysql.exceptions.*;

public interface PersonaDao
{
	/** 
	 * Inserts a new row in the persona table.
	 */
	public PersonaPk insert(Persona dto) throws PersonaDaoException;

	/** 
	 * Updates a single row in the persona table.
	 */
	public void update(PersonaPk pk, Persona dto) throws PersonaDaoException;

	/** 
	 * Deletes a single row in the persona table.
	 */
	public void delete(PersonaPk pk) throws PersonaDaoException;

	/** 
	 * Returns the rows from the persona table that matches the specified primary-key value.
	 */
	public Persona findByPrimaryKey(PersonaPk pk) throws PersonaDaoException;

	/** 
	 * Returns all rows from the persona table that match the criteria 'id_persona = :idPersona'.
	 */
	public Persona findByPrimaryKey(int idPersona) throws PersonaDaoException;

	/** 
	 * Returns all rows from the persona table that match the criteria ''.
	 */
	public Persona[] findAll() throws PersonaDaoException;

	/** 
	 * Returns all rows from the persona table that match the criteria 'id_persona = :idPersona'.
	 */
	public Persona[] findWhereIdPersonaEquals(int idPersona) throws PersonaDaoException;

	/** 
	 * Returns all rows from the persona table that match the criteria 'nombre = :nombre'.
	 */
	public Persona[] findWhereNombreEquals(String nombre) throws PersonaDaoException;

	/** 
	 * Returns all rows from the persona table that match the criteria 'apellido = :apellido'.
	 */
	public Persona[] findWhereApellidoEquals(String apellido) throws PersonaDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the persona table that match the specified arbitrary SQL statement
	 */
	public Persona[] findByDynamicSelect(String sql, Object[] sqlParams) throws PersonaDaoException;

	/** 
	 * Returns all rows from the persona table that match the specified arbitrary SQL statement
	 */
	public Persona[] findByDynamicWhere(String sql, Object[] sqlParams) throws PersonaDaoException;

}
