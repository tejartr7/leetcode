class ParkingSystem {
    int x,y,z;
    public ParkingSystem(int big, int medium, int small) {
        x=big;
        y=medium;
        z=small;
    }
    
    public boolean addCar(int k) {
        if(k==1 && x>0)
        {
            x--;
            return true;
        }
        else if(k==2 && y>0)
        {
            y--;
            return true;
        }
         else if(k==3 && z>0)
        {
            z--;
            return true;
        }
        return false;
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */