/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer;

/**
 *
 * @author im
 */
public interface Command {//내장된 옵저버기능을 불러옴
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
