/**
 * @author Pepe Gallardo, Data Structures, Grado en Informática. UMA.
 *
 * Exceptions for graph operations
 */

package graph;

public class GraphException extends RuntimeException {

	private static final long serialVersionUID = -7807923404308749451L;

	public GraphException() {
	   super();
	 }

	 public GraphException(String msg) {
	   super(msg);
	 }
	}
