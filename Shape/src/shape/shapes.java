/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shape;

/**
 *
 * @author lenovo
 */
public abstract class shapes {
    String name;

    public shapes() {
    }

    public shapes(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void GetInfo(){
        System.out.println("the name of this shape is " + this.name);
    }
    
}
