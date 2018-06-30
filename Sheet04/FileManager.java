package sheet04.collections.self.manager;

import java.util.Collection;

import sheet04.collections.self.base.Author;
import sheet04.collections.self.base.File;

/**
 * Methods for FileManager
 * 
 * @author Alexander Blaas
 */
public interface FileManager extends FolderManager {

	/**
	 * Finds all files containing a certain word.
	 * 
	 * @param word
	 *            The word a file has to contain to be match.
	 * @return All files containing the word.
	 */
	public Collection<File> findFilesContaining(String word);

	/**
	 * Finds files by a certain author.
	 * 
	 * @param author
	 *            The author.
	 * @return All files by the author.
	 */
	public Collection<File> findFilesByAuthor(Author author);

	/**
	 * Checks, if a certain file exists.
	 * 
	 * @param folderName
	 *            The folder to search.
	 * @param fileName
	 *            The filename.
	 * @return True, if the file exists, false otherwise.
	 */
	public boolean fileExists(String folderName, String fileName);

	/**
	 * Checks if a file contains a certain word
	 * 
	 * @param file
	 *            The file to search for.
	 * @param word
	 *            The word after the file is searched.
	 * @return True if the file contains it, false otherwise.
	 */
	public boolean fileContainsWord(File file, String word);

	/**
	 * Simply prints out a collection of files.
	 * 
	 * @param files
	 *            The files to be printed.
	 */
	public void printFiles(Collection<File> files);
}
