class Frog{

    private int distanse;
    private int waiting_time;
    public final FrogJump[] frogJumps;

    public Frog(){
        frogJumps = new FrogJump[] {new Jump(5), new Rest(1), new Jump(3), new Rest(2), new Jump(1), new Rest(5)};
    }

    public int getDistance(){
        return this.distanse;
    }
    public void setDistanse(int d){
        this.distanse = d;

    }

    public int getWaitingTime(){
        return this.waiting_time;
    }

    public void setWaitingTime(int t){
        this.waiting_time = t;
    }
}