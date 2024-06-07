/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package escalonador;

/**
 *
 * @author Gabryel
 */
public class Tarefa {
    
    private String chars;
    private int currentPosition;
    private int pid;
    private int timeElapsed;

    public Tarefa(String chars, int pid) {
        this.chars = chars;
        this.currentPosition = 0;
        this.pid = pid;
    }

    public String getChars() {
        return chars;
    }

    public void setChars(String chars) {
        this.chars = chars;
    }

    public int getCurrentPosition() {
        return currentPosition;
    }

    public void setCurrentPosition(int currentPosition) {
        this.currentPosition = currentPosition;
    }

    public int getTimeElapsed() {
        return timeElapsed;
    }

    public void setTimeElapsed(int timeElapsed) {
        this.timeElapsed = timeElapsed;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }
    
    public char getCurrentChar() {
        return chars.charAt(currentPosition);
    }
    
}
