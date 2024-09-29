/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package notebook;

import java.util.ArrayList;
/**
 *
 * @author Mohammed
 */
public class NoteBook {

    ArrayList<String> notes;

    public NoteBook() {

        notes = new ArrayList<String>();

    }

    public void storeNote(String note){
        notes.add(note);
    }

    public int numberOfNotes(){
        return notes.size();
    }

    public void showNote(int noteNo){
        if (noteNo< 0){
            System.out.println("this is invalid note number");
        }
        else if (noteNo>=0 && noteNo<numberOfNotes()){
            System.out.println( notes.get(noteNo));
        }
        else
            System.out.println( "this is invalid note number");
    }

}
