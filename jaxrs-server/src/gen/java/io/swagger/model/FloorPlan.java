import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FloorPlan {
	private static HashMap<String, Seat> floor = new HashMap<String, Seat>();
	
	public FloorPlan() {}
	
	public void addSeat(Seat seat) {
		floor.put(seat.getCode(), seat);
	}
	
	public void updateSeat(Seat seat) {
		floor.replace(seat.getCode(), seat);
	}
	
	public Seat getSeat(String id) {
		return floor.get(id);
	}
	
	public ArrayList<Seat> getFloor() {
		List<Seat> list = new ArrayList<Seat>();
		for(Seat seat : floor.values()) {
			list.add(seat);
		}
		return (ArrayList<Seat>) list;
	}
}
