class BattleShip extends Ship {
    private int missileCapacity;

    public BattleShip(String name, String yearBuilt, int missileCapacity) {
        super(name, yearBuilt);
        this.missileCapacity = missileCapacity;
    }

    public int getMissileCapacity() {
        return missileCapacity;
    }

    public void setMissileCapacity(int missileCapacity) {
        this.missileCapacity = missileCapacity;
    }
    @Override
    public void print() {
        super.print();
        System.out.println("Missile Capacity: " + missileCapacity);
    }
}