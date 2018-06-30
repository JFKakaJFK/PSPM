package sheet04.collections.self.manager;

import java.util.Collection;

import sheet04.collections.self.base.Author;
import sheet04.collections.self.base.Folder;

/**
 * Contains methods for the foldermanager
 * 
 * @author Alexander Blaas
 *
 */
public interface FolderManager {

	/**
	 * Adds a folder to the manager: Adding a folder means constructing, e.g.
	 * updating the underlying index-structure.
	 * 
	 * @param folder
	 *            The folder to add.
	 */
	public void addFolder(Folder folder);

	/**
	 * Finds all folders by a certain author.
	 * 
	 * @param author
	 *            The author.
	 * @return All folders by the specified author.
	 */
	public Collection<Folder> findFoldersByAuthor(Author author);

	/**
	 * Gets all folders within the foldermanager sorted by their name.
	 * 
	 * @return All folders within the foldermanager sorted by their name.
	 */
	public Collection<Folder> getAndSortFoldersByName();

	/**
	 * Gets all folders within the foldermanager sorted by their author
	 * (username).
	 * 
	 * @return All folders within the foldermanager sorted by their author
	 *         (username).
	 */
	public Collection<Folder> getAndSortFoldersByAuthor();

	/**
	 * Prints foldes.
	 * 
	 * @param folders
	 *            The folders to be printed.
	 * @param foldersOnly
	 *            True, if files within the folders should also be printed,
	 *            false otherwise.
	 */
	public void printContent(Collection<Folder> folders, boolean foldersOnly);

}
