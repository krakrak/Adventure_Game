/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rooms;

import commands.Game;

/**
 *
 * @author Irakiza Krak
 */
public class NormalRoom extends RoomImpl{

    public  NormalRoom(String name, String descr){
        super(name, descr);
    }
    
    @Override
    public void activate(Game game, Room exit) {
        this.setExits(game.getCurrentRoom(), exit, null, null);
    }
    
}
