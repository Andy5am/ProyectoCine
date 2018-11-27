
public class Ticket {
    TheaterRoom theaterRoom;
    Seats seats;

    public Ticket(TheaterRoom theaterRoom, Seats seats) {
        this.theaterRoom = theaterRoom;
        this.seats = seats;
    }

    @Override
    public String toString() {
        return "Sala:\n"+this.theaterRoom+"\n"+"Asiento\n"+this.seats;
    }
}

