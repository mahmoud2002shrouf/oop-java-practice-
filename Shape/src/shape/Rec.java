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
public class Rec extends shapes {

    private int width;
    private int height;

    public Rec() {
    }

    public Rec(int width, int height, String name) {
        super(name);
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public void GetInfo() {
        System.out.println("the name of this shape is " + super.name);
    }

}
