package model;

import model.dispatcher.ExternalDispatcher;
import model.dispatcher.InternalDispatcher;

public class Floor {
    private int floorNumber;

    ExternalDispatcher externalDispatcher;
    InternalDispatcher internalDispatcher;

    public int getFloorNumber() {
        return floorNumber;
    }

    public Floor(int floorNumber) {
        this.floorNumber = floorNumber;
        externalDispatcher = new ExternalDispatcher();
    }

    public void pressButton(Direction direction){
        externalDispatcher.submitExternalRequest(this.floorNumber, direction);
    }
}