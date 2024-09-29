/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package notebook;

/**
 *
 * @author Mohammed
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        NoteBook notebook = new NoteBook();

        notebook.storeNote("meeting on Tuesday");
        notebook.storeNote("Java exam next week");
        notebook.storeNote("Check the car");

        notebook.showNote(2);

        notebook.showNote(1);
        notebook.showNote(4);

    }

}
