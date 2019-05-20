package premierCoursCalculatrice;

import java.io.FileNotFoundException;
import java.io.IOException;

import exception.MonException;

public interface IHM {

	public default void launch() throws MonException, FileNotFoundException, IOException {}
}
